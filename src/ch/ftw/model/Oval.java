package ch.ftw.model;

import java.awt.Graphics;

public class Oval extends Form {
	private int width, height;
	
	public Oval(){
		super();
		this.width = 0;
		this.height = 0;
	}

	public Oval(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(getX(), getY(), width, height);
	}
	
	@Override
	public Form getFormFromMouse(int x, int y, int width, int height) {
		return new Oval(x, y, width, height);
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
