package ch.ftw.model;

import java.awt.Font;
import java.awt.Graphics;

public class Text extends Form {

	private String str;
	private int fontSize;
	
	public Text(int x, int y, String str, int fontSize) {
		super(x, y);
		this.str = str;
		this.fontSize = fontSize;
	}

	@Override
	public void draw(Graphics g) {
		g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, fontSize));
		g.drawString(str, getX(), getY());
	}

	@Override
	public Form getFormFromMouse(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return null;
	}

}
