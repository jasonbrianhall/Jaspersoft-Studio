/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) 2006-2009 Nicolas Richeton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors :
 *    Nicolas Richeton (nicolas.richeton@gmail.com) - initial API and implementation
 *******************************************************************************/

package org.eclipse.nebula.animation.effects;
/*
 * All animation effects must implement this interface.
 * <p>
 * Note : an effect should not do initialization in constructor, but at the
 * first call to doEffect(). For instance, a move effect should not get the
 * initial position of an object in the constructor, because the object may have
 * moved between creation and effect start.
 * </p>
 * 
 * @author Nicolas Richeton
 */
public interface IEffect {

	/**
	 * Set the effect as done and run the cancel runnable.
	 */
	public void cancel();

	/**
	 * Apply effect to the target according to the given time.
	 * 
	 * @param time
	 *            - Current time in ms. This value may be larger than the effect
	 *            length.
	 */
	public void doEffect(long time);

	/**
	 * Get effect length
	 * 
	 * @return length (ms)
	 */
	public long getLength();

	/**
	 * @return true if the effect as already reached its end.
	 */
	public boolean isDone();
}
