package ch.ftw.model;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

public class Text extends Form {

	private String str;
	
	public Text(Point start, String str){
		x = start.x;
		y = start.y;
		this.str = str;			
	}

	@Override
	public void draw(Graphics g) {
		g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		g.drawString(str, x, y);
	}

}
