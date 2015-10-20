package ch.ftw.model;

import java.awt.Graphics;

/**
 * A form represents a form (eg. rectangular etc.)
 * @author Yves
 *
 */
public abstract class Form {
	
	protected int x, y;

	protected Form(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Form() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Function to move a form (eg. current x = 100, y = 100 -> move(40, 30) -> x = 140, y = 130)
	 * @param x how much x should be added
	 * @param y how much y should be added
	 */
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	/**
	 * Function to move a form to a position (eg. current x = 100, y = 100 -> moveTo(40, 30) -> x = 40, y = 30)
	 * @param toX the new x where the form should be
	 * @param toY the new y where the form should be
	 */
	public void moveTo(int toX, int toY){
		this.x = toX;
		this.y = toY;
	}

	/**
	 * Function to draw a component
	 * @param g The graphics object which should be drawn on
	 */
	protected abstract void draw(Graphics g);
	
	/**
	 * Get the x position of the form
	 * @return x position as an int
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Set the x position of the form
	 * @param x the x position which is to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Get the y position of the form
	 * @return y position as an int
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set the y position of the form
	 * @param y the y position which is to set
	 */
	public void setY(int y) {
		this.y = y;
	}

}
