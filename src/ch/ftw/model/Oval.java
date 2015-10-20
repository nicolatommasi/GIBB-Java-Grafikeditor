package ch.ftw.model;

import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Form {
	private int width, height;
	
	public Oval(){
		super();
		this.width = 0;
		this.height = 0;
	}
	
	public Oval(Point start, Point end){
		super(start.x, start.y);
		this.width = end.x - start.x;
		this.height = end.y - start.y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(getX(), getY(), width, height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	

	
}
