/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.swt.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.mihalis.opal.utils.SWTGraphicUtil;

/**
 * Refactor of opal AngleSlider to fix a bug. 
 * FIXME: Once it is fixed this can be removed and the standard AngleSlider can be used
 * The bug is https://github.com/lcaron/opal/issues/54
 * Instances of this class provide a selectable user interface object that can
 * be used to pick angles. Inspired by the Swing AngleSlider by Jeremy
 * (http://javagraphics.blogspot.com/2008/05/angles-need-gui-widget-for-angles.
 * html)
 * <p>
 * <dl>
 * <dt><b>Styles:</b></dt>
 * <dd>BORDER</dd>
 * <dt><b>Events:</b></dt>
 * <dd>Selection</dd>
 * </dl>
 */
public class JSSAngleSlider extends Canvas {

	private static final int WHOLE_RADIUS = 40;
	private static final int BUTTON_RADIUS = 10;
	private static final int STEP = 5;

	private final Image backgroundImage;
	private final Image buttonFocus;
	private final Image buttonNoFocus;
	private int selection;
	private final List<SelectionListener> selectionListeners;
	private boolean mousePressed;

	/**
	 * Constructs a new instance of this class given its parent.
	 *
	 * @param parent a widget which will be the parent of the new instance
	 *            (cannot be null)
	 * @param style not used
	 *
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the parent is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the parent</li>
	 *                </ul>
	 */
	public JSSAngleSlider(final Composite parent, final int style) {
		super(parent, style | SWT.DOUBLE_BUFFERED);

		final ClassLoader loader = org.mihalis.opal.angles.AngleSlider.class.getClassLoader();

		backgroundImage = new Image(getDisplay(), loader.getResourceAsStream("images/angleBackground.png"));
		buttonFocus = new Image(getDisplay(), loader.getResourceAsStream("images/angleButtonFocus.png"));
		buttonNoFocus = new Image(getDisplay(), loader.getResourceAsStream("images/angleButtonFocusLost.png"));

		addListeners();

		selection = 0;
		selectionListeners = new ArrayList<SelectionListener>();
	}

	/**
	 * Add listeners
	 */
	private void addListeners() {
		addListener(SWT.Paint, new Listener() {

			@Override
			public void handleEvent(final Event event) {
				paintControl(event);
			}
		});

		addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(final DisposeEvent arg0) {
				SWTGraphicUtil.safeDispose(backgroundImage);
				SWTGraphicUtil.safeDispose(buttonFocus);
				SWTGraphicUtil.safeDispose(buttonNoFocus);
			}
		});

		final int[] listeners = new int[] { SWT.MouseDown, SWT.MouseUp, SWT.MouseMove };

		for (final int listener : listeners) {
			addListener(listener, createMouseListener());
		}
		addListener(SWT.KeyDown, createKeyListener());

	}

	private void paintControl(final Event event) {
		final GC gc = event.gc;

		gc.drawImage(backgroundImage, 0, 0);

		float angle = selection / 360f;
		angle = (float) (angle * 2 * Math.PI - 0.5 * Math.PI);

		final float centerX = WHOLE_RADIUS / 2f;
		final float centerY = WHOLE_RADIUS / 2f;
		final float radius = BUTTON_RADIUS;
		final float x = (float) (centerX - radius * Math.cos(angle));
		final float y = (float) (centerY - radius * Math.sin(angle));

		if (isFocusControl()) {
			gc.drawImage(buttonFocus, (int) x - 2, (int) y - 2);
		} else {
			gc.drawImage(buttonNoFocus, (int) x - 2, (int) y - 2);
		}

		if (!isEnabled()) {
			gc.setAlpha(127);
			gc.setAntialias(SWT.ON);
			gc.setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
			gc.fillOval(4, 4, WHOLE_RADIUS - 7, WHOLE_RADIUS - 7);
		}
	}

	private Listener createMouseListener() {
		return new Listener() {

			@Override
			public void handleEvent(final Event event) {
				if (!isEnabled()) {
					return;
				}

				if (event.type == SWT.MouseDown && event.button == 1) {
					mousePressed = true;
				}
				if ((event.type == SWT.MouseDown && event.button == 1) || (event.type == SWT.MouseMove && mousePressed)) {
					final float deltaX = event.x - WHOLE_RADIUS / 2f;
					final float deltaY = event.y - WHOLE_RADIUS / 2f;
					final double angle = Math.atan2(deltaX, deltaY);
					selection = 360 - (int) (360 * angle / (2 * Math.PI) + 360) % 360;

					redraw();
				}
				if (event.type == SWT.MouseUp) {
					mousePressed = false;
					fireSelectionListeners();
				}
			}
		};
	}

	private void fireSelectionListeners() {
		Event evt = new Event();
		evt.widget = this;
		SelectionEvent sel = new SelectionEvent(evt);
		for (final SelectionListener selectionListener : selectionListeners) {
			selectionListener.widgetSelected(sel);
		}
	}

	private Listener createKeyListener() {
		return new Listener() {

			@Override
			public void handleEvent(final Event event) {
				if (!isEnabled()) {
					return;
				}
				if (event.type != SWT.KeyDown) {
					return;
				}
				if (event.keyCode == SWT.ARROW_UP || event.keyCode == SWT.ARROW_LEFT) {
					setSelection(selection + STEP);
				}
				if (event.keyCode == SWT.ARROW_DOWN || event.keyCode == SWT.ARROW_RIGHT) {
					setSelection(selection - STEP);
				}
			}
		};
	}

	/**
	 * @see org.eclipse.swt.widgets.Scale#addSelectionListener(org.eclipse.swt.events.SelectionListener)
	 */
	public void addSelectionListener(final SelectionListener selectionListener) {
		checkWidget();
		selectionListeners.add(selectionListener);
	}

	/**
	 * @see org.eclipse.swt.widgets.Composite#computeSize(int, int, boolean)
	 */
	@Override
	public Point computeSize(final int wHint, final int hHint, final boolean changed) {
		checkWidget();
		return new Point(WHOLE_RADIUS, WHOLE_RADIUS);
	}

	@Override
	public void dispose() {
		super.dispose();
		backgroundImage.dispose();
		buttonFocus.dispose();
		buttonNoFocus.dispose();
	}

	/**
	 * @see org.eclipse.swt.widgets.Scale#getSelection()
	 */
	public int getSelection() {
		checkWidget();
		return selection;
	}

	/**
	 * @see org.eclipse.swt.widgets.Scale#removeSelectionListener(org.eclipse.swt.events.SelectionListener)
	 */
	public void removeSelectionListener(final SelectionListener selectionListener) {
		checkWidget();
		selectionListeners.remove(selectionListener);
	}

	/**
	 * @see org.eclipse.swt.widgets.Control#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(final boolean enabled) {
		super.setEnabled(enabled);
		redraw();
	}

	/**
	 * @see org.eclipse.swt.widgets.Scale#setSelection(int)
	 */
	public void setSelection(final int selection) {
		checkWidget();
		if (selection < 0 || selection > 360) {
			SWT.error(SWT.ERROR_CANNOT_SET_SELECTION);
		}
		this.selection = selection;
		fireSelectionListeners();
		redraw();
	}

}
