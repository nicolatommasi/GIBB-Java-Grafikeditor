package ch.ftw.model;

import java.awt.Graphics;
import java.awt.Point;

public class Line extends Form {

	private int toX;
	private int toY;
	
	public Line(Point start, Point end){
		super(start.x, start.y);
		this.toX = end.x;
		this.toY = end.y;
	}
	
	public Line(){
		super();
		this.toX = 0;
		this.toY = 0;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(getX(), getY(), toX, toY);
	}
	
	public int getToX() {
		return toX;
	}

	public void setToX(int toX) {
		this.toX = toX;
	}

	public int getToY() {
		return toY;
	}

	public void setToY(int toY) {
		this.toY = toY;
	}

}
