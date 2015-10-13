package ch.ftw.model;

import java.awt.Graphics;

public class Rectangular extends Form {

	private int width;
	private int height;
	
	public Rectangular(){
		super();
		this.width = 0;
		this.height = 0;
	}

	public Rectangular(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
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

	@Override
	public Form getFormFromMouse(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return new Rectangular(x, y, width, height);
	}

}
