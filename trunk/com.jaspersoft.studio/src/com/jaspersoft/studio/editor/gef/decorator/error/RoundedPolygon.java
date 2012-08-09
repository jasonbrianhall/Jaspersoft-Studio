package com.jaspersoft.studio.editor.gef.decorator.error;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that offer static support methods to design a polygon with rounded border
 * @author Orlandin Marco
 *
 */
public class RoundedPolygon {
	
	/**
	 * The start color for the progressive paint of the warning icon
	 */
	private static Color startColor =  new Color(255,238,193);
	
	/**
	 * The end color in the progressive paint of the warning icon
	 */
	private static Color endColor = new Color(255,208,115);
	
	/**
	 * The color of the border of the warning icon
	 */
	private static Color borderColor = Color.orange;
	
	/**
	 * The font used to paint the ! symbol in the warning icon
	 */
	private static Font messageFont = new Font("SansSerif", 0, 10);
	
	/**
	 * Set the start color for the progressive paint of the warning icon
	 * @param newColor the new color
	 */
	public static void setStartColor(Color newColor){
		startColor = newColor;
	}
	
	/**
	 * Set the end color in the progressive paint of the warning icon
	 * @param newColor the new color
	 */
	public static void setEndColor(Color newColor){
		endColor = newColor;
	}
	
	/**
	 * Set the color of the border of the warning icon
	 * @param newColor the new color
	 */
	public static void setBorderColor(Color newColor){
		borderColor = newColor;
	}
	
	/**
	 * Set the font that will be used to paint the ! symbol in the warning icon
	 * @param newFont the new font
	 */
	public static void setFont(Font newFont){
		messageFont = newFont;
	}
	
	/**
	 * Generate a rounded path for a polygon with more than 3 corners
	 * @param polygon input polygon
	 * @return a general path that represent the rounded polygon
	 */
	public static GeneralPath getRoundedGeneralPath(Polygon polygon) {
	   List<int[]> l = new ArrayList<int[]>();
	   for(int i=0; i < polygon.npoints; i++){
	      l.add(new int[]{polygon.xpoints[i],polygon.ypoints[i]});
	   }
	   return getRoundedGeneralPath(l);
	}
	 
	/**
	 * Generate a rounded path for a polygon with more than 3 corners
	 * @param l a polygon represented from a list of pair of points
	 * @return a general path that represent the rounded polygon
	 */
	public static GeneralPath getRoundedGeneralPath(List<int[]> l) {
	   List<Point> list=new ArrayList<Point>();
	   for (int[] point : l){
	      list.add(new Point(point[0],point[1]));
	   }
	   return getRoundedGeneralPathFromPoints(list);
	}
	
	/**
	 * Generate a rounded path for a polygon with more than 3 corners
	 * @param l a polygon represented from a list of pair of points
	 * @return a general path that represent the rounded polygon
	 */
	public static GeneralPath getRoundedGeneralPathFromPoints(List<Point> l) {
	   l.add(l.get(0));
	   l.add(l.get(1));
	   GeneralPath p = new GeneralPath();
	   p.moveTo(l.get(0).x,l.get(0).y);
	  
	   for(int pointIndex=1; pointIndex<l.size()-1;pointIndex++){
	      Point p1=l.get(pointIndex-1);
	      Point p2=l.get(pointIndex);
	      Point p3=l.get(pointIndex+1);
	      Point mPoint = calculatePoint(p1, p2);
	      p.lineTo(mPoint.x, mPoint.y);
	      mPoint = calculatePoint(p3, p2);
	      p.curveTo(p2.x, p2.y, p2.x, p2.y, mPoint.x, mPoint.y);
	   }
	   return p;
	}
	
	/**
	 * Calculate the curving point for a rounded corner, using b�zer curves
	 * @param p1 start point
	 * @param p2 end point
	 * @return curving point
	 */
	private static Point calculatePoint(Point p1, Point p2) {
	   float arcSize=10;
	   double d1=Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
	   double per=arcSize/d1;
	   double d_x=(p1.x-p2.x)*per;
	   double d_y=(p1.y-p2.y)*per;
	   int xx=(int)(p2.x+d_x);
	   int yy=(int)(p2.y+d_y);
	   return new Point(xx,yy);
	}
	
	/**
	 * Generate a path that represent a triangle
	 * @param x coordinate x of the upper corner
	 * @param y coordinate y of the upper corner
	 * @param width width of the base
	 * @param height height of the base
	 * @return the general path that represent the triangle
	 */
	public static GeneralPath getWarningPath(int x, int y, int width, int height) {
	   final GeneralPath p0 = new GeneralPath();
     double border = 2;
	 	 double sin = Math.sin(Math.toRadians(60.0)) * border;
		 double cos = Math.cos(Math.toRadians(60.0)) * border;
	   int x_left_corner = x-width;
	   int y_corners = y+height;
	   int x_right_corner = x+width;
	   p0.moveTo(x - cos, y + sin);
	   p0.lineTo(x_left_corner+cos, y_corners-sin);
	   p0.curveTo(x_left_corner+cos, y_corners-sin, x_left_corner , y_corners, x_left_corner+border, y_corners);
	   p0.lineTo(x_right_corner-border, y_corners);
	   p0.curveTo(x_right_corner-border, y_corners, x_right_corner, y_corners, x_right_corner-cos, y_corners-sin);
	   p0.lineTo(x+cos, y + sin);
	   p0.curveTo(x+cos, y + sin, x, y, x - cos, y + sin);
	   p0.closePath();
	   return p0;
	}
	
	/**
	 * given a general path it will be colored as a warning icon
	 * @param x point x from where the path will be painted
	 * @param y point y from where the path will be painted
	 * @param stroke border of the icon
	 * @param p0 path representing the icon
	 * @param g Graphics used to paint the triangle, the internal value of the graphics will be 
	 * restored after the painting
	 */
	public static void paintWarningPath(int x, int y, float stroke, GeneralPath p0, Graphics2D g){
			//Backup old graphics value
			Color oldColor = g.getColor();
			Stroke oldStroke = g.getStroke();
			Object oldRendering = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
			Paint oldGradient = g.getPaint();
			Font oldFont = g.getFont();
			//Paint the path
			g.setStroke(new BasicStroke(stroke));
		  g.setColor(borderColor);
		  g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		  GradientPaint gp = new GradientPaint(x, y,startColor, x, y + p0.getBounds().height,endColor);
		  g.draw(p0);
		  g.setPaint(gp);
		  g.fill(p0);
		  g.setColor(Color.black);
		  g.setFont(messageFont);
		  int fontWidth = g.getFontMetrics().stringWidth("!");
		  float x_middle = new Float(x-((fontWidth)/2)-0.3);
		  g.drawString("!", x_middle, y+stroke+messageFont.getSize() );
		  //Restore old graphics value
		  g.setFont(oldFont);
		  g.setColor(oldColor);
		  g.setStroke(oldStroke);
		  g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,oldRendering);
		  g.setPaint(oldGradient);
	}
	
	/**
	 * Create and paint a warning triangular icon
	 * @param x Coordinate x of the upper corner
	 * @param y Coordinate y of the upper corner
	 * @param width base of the triangle
	 * @param height height of the triangle
	 * @param stroke size of the border
	 * @param g Graphics used to paint the triangle, the internal value of the graphics will be 
	 * restored after the painting
	 */
	public static void paintWarningIcon(int x, int y, int width, int height, float stroke, Graphics2D g) {
     final GeneralPath p0 = new GeneralPath();
     double border = 2;
	 	 double sin = Math.sin(Math.toRadians(60.0)) * border;
		 double cos = Math.cos(Math.toRadians(60.0)) * border;
	   int x_left_corner = x-width;
	   int y_corners = y+height;
	   int x_right_corner = x+width;
		 //Backup old graphics value
		 Color oldColor = g.getColor();
		 Stroke oldStroke = g.getStroke();
		 Object oldRendering = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
		 Paint oldGradient = g.getPaint();
		 Font oldFont = g.getFont();
		 //Paint the warning
	   g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	   g.setStroke(new BasicStroke(stroke));
	   g.setColor(borderColor);
	   p0.moveTo(x - cos, y + sin);
	   p0.lineTo(x_left_corner+cos, y_corners-sin);
	   p0.curveTo(x_left_corner+cos, y_corners-sin, x_left_corner , y_corners, x_left_corner+border, y_corners);
	   p0.lineTo(x_right_corner-border, y_corners);
	   p0.curveTo(x_right_corner-border, y_corners, x_right_corner, y_corners, x_right_corner-cos, y_corners-sin);
	   p0.lineTo(x+cos, y + sin);
	   p0.curveTo(x+cos, y + sin, x, y, x - cos, y + sin);
	   p0.closePath();
	   g.draw(p0);
	   GradientPaint gp = new GradientPaint(x, y,startColor, x, y_corners,endColor);
	   g.setPaint(gp);
	   g.fill(p0);
	   g.setColor(Color.black);
	   g.setFont(messageFont);
	   int fontWidth = g.getFontMetrics().stringWidth("!");
	   float x_middle = new Float(x-((fontWidth)/2)-0.3);
	   g.drawString("!", x_middle, y+stroke+messageFont.getSize() );
	   //Restore old graphics value
	   g.setFont(oldFont);
	   g.setColor(oldColor);
	   g.setStroke(oldStroke);
	   g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,oldRendering);
		 g.setPaint(oldGradient);
 }
}
