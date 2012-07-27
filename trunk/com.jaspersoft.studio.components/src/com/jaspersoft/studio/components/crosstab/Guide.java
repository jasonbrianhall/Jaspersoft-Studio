package com.jaspersoft.studio.components.crosstab;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.crosstabs.JRCellContents;

public class Guide {
	private int y;
	private List<CrosstabCell> prev = new ArrayList<CrosstabCell>();
	private List<CrosstabCell> next = new ArrayList<CrosstabCell>();

	public Guide(int y) {
		this.y = y;
	}

	public void setNext(List<CrosstabCell> next) {
		this.next = next;
	}

	public void setPrev(List<CrosstabCell> prev) {
		this.prev = prev;
	}

	public List<CrosstabCell> getPrev() {
		return prev;
	}

	public List<CrosstabCell> getNext() {
		return next;
	}

	public void addWest(CrosstabCell cell) {
		cell.setEast(this);
		prev.add(cell);
	}

	public void addEast(CrosstabCell cell) {
		cell.setWest(this);
		next.add(cell);
	}

	public void addNorth(CrosstabCell cell) {
		cell.setSouth(this);
		prev.add(cell);
	}

	public void addSouth(CrosstabCell cell) {
		cell.setNorth(this);
		next.add(cell);
	}

	public void mirror() {
		switchCells(next);
		switchCells(prev);

		List<CrosstabCell> tmp = next;
		next = prev;
		prev = tmp;
	}

	private void switchCells(List<CrosstabCell> cols) {
		for (CrosstabCell cc : cols) {
			Guide n = cc.getNorth();
			Guide s = cc.getSouth();
			cc.setSouth(n);
			cc.setNorth(s);
		}
	}

	public int getY() {
		return y;
	}

	public void setY(Guide north, JRCellContents c) {
		if (c != null)
			y = Math.max(y, north.getY() + c.getHeight());
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		StringBuffer res = new StringBuffer();
		res.append("y: " + y + " NORTH");
		for (CrosstabCell cc : prev)
			res.append(cc.toString());
		res.append("\nSOUTH");
		for (CrosstabCell cc : next)
			res.append(cc.toString());
		return res.toString();
	}

}
