package ch.ftw.model;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangular extends Form {

	private int width;
	private int height;
	
	public Rectangular(){
		super();
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangular(Point start, Point end){
		super(start.x, start.y);
		this.width = end.x - start.x;
		this.height = end.y - start.y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(getX(), getY(), width, height);
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
