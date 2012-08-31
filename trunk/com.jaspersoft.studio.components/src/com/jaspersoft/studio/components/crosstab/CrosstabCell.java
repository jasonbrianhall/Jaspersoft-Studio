/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2012 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.components.crosstab;

import net.sf.jasperreports.crosstabs.design.JRCrosstabOrigin;
import net.sf.jasperreports.crosstabs.design.JRDesignCellContents;

import org.eclipse.draw2d.geometry.Rectangle;

public class CrosstabCell {
	public JRDesignCellContents cell;
	public byte type;

	public CrosstabCell(byte type) {
		this.type = type;
	}

	public CrosstabCell(JRDesignCellContents cell) {
		this.cell = cell;
		if (cell != null) {
			if (cell.getOrigin() != null)
				type = cell.getOrigin().getType();
			else
				type = JRCrosstabOrigin.TYPE_DATA_CELL;
		}
	}

	public CrosstabCell(JRDesignCellContents cell, byte type) {
		this.cell = cell;
		this.type = type;
	}

	private Guide north;
	private Guide south;
	private Guide west;
	private Guide east;

	public Guide getWest() {
		return west;
	}

	public void setWest(Guide west) {
		this.west = west;
	}

	public Guide getEast() {
		return east;
	}

	public void setEast(Guide east) {
		this.east = east;
	}

	public Guide getNorth() {
		return north;
	}

	public void setNorth(Guide north) {
		this.north = north;
	}

	public Guide getSouth() {
		return south;
	}

	public void setSouth(Guide south) {
		this.south = south;
	}

	public Rectangle getBounds() {
		int w = 60;
		int h = 20;
		if (east != null && west != null) {
			if (east.getY() < west.getY()) {
				Guide tmp = west;
				west = east;
				east = tmp;
			}
			w = east.getY() - west.getY();
		}
		if (south != null && north != null) {
			if (south.getY() < north.getY()) {
				Guide tmp = north;
				north = south;
				south = tmp;
			}
			h = south.getY() - north.getY();
		}
		if (west != null && north != null)
			return new Rectangle(west.getY(), north.getY(), w, h);
		if (cell != null)
			return new Rectangle(0, 0, cell.getWidth(), cell.getHeight());
		return new Rectangle(0, 0, w, h);
	}

	@Override
	public String toString() {
		String str = "[" + type + ":" + hashCode() + "-";
		if (cell != null)
			str += "-h:" + cell.getHeight() + "]";
		else
			str += "[++++]";
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		CrosstabCell toObj = (CrosstabCell) obj;
		if (cell != null)
			return cell.equals(toObj.cell);
		if (cell == null && toObj.cell == null)
			return type == toObj.type;
		return false;
	}

	@Override
	public int hashCode() {
		if (cell != null)
			return cell.hashCode();// ^ type;
		return type;
	}
}
