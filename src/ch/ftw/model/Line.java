package ch.ftw.model;

import java.awt.Graphics;

public class Line extends Form {

	private int toX;
	private int toY;

	public Line(int x, int y, int toX, int toY) {
		super(x, y);
		this.toX = toX;
		this.toY = toY;
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
	
	@Override
	public Form getFormFromMouse(int x, int y, int width, int height) {
		int endX = x + width;
		int endY = y + height;
		return new Line(x, y, endX, endY);
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
