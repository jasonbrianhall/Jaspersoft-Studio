package com.jaspersoft.studio.editor.palette;

import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;

import com.jaspersoft.studio.editor.gef.parts.editPolicy.SameBandEditPartsTracker;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.utils.compatibility.SharedImages;

/**
 * Refactoring of the original MarqueeToolEntry to use the drag manager SameBandEditPartsTracker instead of 
 * the MaqrqueeSelectionTool 
 * 
 * @author Orlandin Marco
 *
 */
public class JDMarqueeToolEntry extends ToolEntry {
	/**
	 * Creates a new MarqueeToolEntry that can select nodes
	 */
	public JDMarqueeToolEntry() {
		this(null, null);
	}

	/**
	 * Constructor for MarqueeToolEntry.
	 * 
	 * @param label
	 *            the label
	 */
	public JDMarqueeToolEntry(String label) {
		this(label, null);
	}

	/**
	 * Constructor for MarqueeToolEntry.
	 * 
	 * @param label
	 *            the label; can be <code>null</code>
	 * @param description
	 *            the description (can be <code>null</code>)
	 */
	public JDMarqueeToolEntry(String label, String description) {
		super(label, description, null, null, SameBandEditPartsTracker.class);
		if (label == null || label.length() == 0)
			setLabel(Messages.JDMarqueeToolEntry_Marquee);
		setUserModificationPermission(PERMISSION_NO_MODIFICATION);
	}
	
	/**
	 * @see org.eclipse.gef.palette.PaletteEntry#getDescription()
	 */
	public String getDescription() {
		String description = super.getDescription();
		if (description != null)
			return description;

		int marqueeBehavior = getMarqueeBehavior();
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_CONNECTIONS_TOUCHED) {
			return Messages.JDMarqueeToolEntry_Behavior_Connections_Touched;
		}
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_CONNECTIONS_CONTAINED) {
			return Messages.JDMarqueeToolEntry_Behavior_Connections_Contained;
		}
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_TOUCHED) {
			return Messages.JDMarqueeToolEntry_Behavior_Nodes_Touched;
		}
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_CONTAINED) {
			return Messages.JDMarqueeToolEntry_Behavior_Nodes_Contained;
		}
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_TOUCHED_AND_RELATED_CONNECTIONS) {
			return Messages.JDMarqueeToolEntry_Behavior_Connections_Nodes;
		}
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_CONTAINED_AND_RELATED_CONNECTIONS) {
			return Messages.JDMarqueeToolEntry_Behavior_Connections_Nodes_fully;
		}
		throw new IllegalArgumentException("Unknown marquee behavior"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.gef.palette.PaletteEntry#getLargeIcon()
	 */
	public ImageDescriptor getLargeIcon() {
		ImageDescriptor imageDescriptor = super.getLargeIcon();
		if (imageDescriptor != null) {
			return imageDescriptor;
		}
		// infer icon from behavior mode
		int marqueeBehavior = getMarqueeBehavior();
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_CONNECTIONS_CONTAINED
				|| marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_CONNECTIONS_TOUCHED) {
			return SharedImages.DESC_MARQUEE_TOOL_CONNECTIONS_24;
		} else if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_CONTAINED
				|| marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_TOUCHED) {
			return SharedImages.DESC_MARQUEE_TOOL_NODES_24;
		} else {
			return SharedImages.DESC_MARQUEE_TOOL_24;
		}
	}

	private int getMarqueeBehavior() {
		// retrieve marquee behavior from tool property
		Object value = getToolProperty(SameBandEditPartsTracker.PROPERTY_MARQUEE_BEHAVIOR);
		if (value != null && value instanceof Integer) {
			return ((Integer) value).intValue();
		}
		// return default behavior
		return SameBandEditPartsTracker.DEFAULT_MARQUEE_BEHAVIOR;
	}

	/**
	 * @see org.eclipse.gef.palette.PaletteEntry#getSmallIcon()
	 */
	public ImageDescriptor getSmallIcon() {
		ImageDescriptor imageDescriptor = super.getSmallIcon();
		if (imageDescriptor != null) {
			return imageDescriptor;
		}
		// infer icon from marquee behavior
		int marqueeBehavior = getMarqueeBehavior();
		if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_CONNECTIONS_CONTAINED
				|| marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_CONNECTIONS_TOUCHED) {
			return SharedImages.DESC_MARQUEE_TOOL_CONNECTIONS_16;
		} else if (marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_CONTAINED
				|| marqueeBehavior == SameBandEditPartsTracker.BEHAVIOR_NODES_TOUCHED) {
			return SharedImages.DESC_MARQUEE_TOOL_NODES_16;
		} else {
			return SharedImages.DESC_MARQUEE_TOOL_16;
		}
	}

}
