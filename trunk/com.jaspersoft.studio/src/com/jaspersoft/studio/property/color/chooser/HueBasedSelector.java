package com.jaspersoft.studio.property.color.chooser;

import org.eclipse.swt.graphics.RGB;

public class HueBasedSelector implements IWidgetGovernor{

	@Override
	public int getSliderMax() {
		return 360;
	}

	@Override
	public int getSliderMin() {
		return 0;
	}

	@Override
	public int getPadMinX() {
		return 0;
	}

	@Override
	public int getPadMinY() {
		return 0;
	}

	@Override
	public int getPadMaxX() {
		return 100;
	}

	@Override
	public int getPadMaxY() {
		return 100;
	}
	
	@Override
	public RGB getPadColor(int x, int y, int sliderPosition) {
		float fSat = (float) x /100;
		float fBright = (float) Math.abs(100-y) / 100;
		return new RGB((float)Math.abs(360-sliderPosition), fSat, fBright);
	}
	
	@Override
	public RGB getSliderColor(int x, int y, int sliderPosition) {
		return new RGB((float)Math.abs(360-sliderPosition), 1.0f, 1.0f);
	}

	@Override
	public int[] getXYSlider(Object color) {
		float[] hsb = null;
		if (color instanceof RGB){
			hsb = ((RGB)color).getHSB();
		} else if (color instanceof float[]){
			hsb = (float[])color;
		}
		if (hsb == null) return new int[]{0,0,0};
		return new int[]{Math.round(hsb[1]*100), Math.round(Math.abs(100-hsb[2]*100)), Math.round(Math.abs(360-hsb[0]))};
	}

}
