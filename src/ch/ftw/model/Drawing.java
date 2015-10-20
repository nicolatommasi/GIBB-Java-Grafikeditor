package ch.ftw.model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * A drawing represents a drawing which is drawn on the drawingboard
 * @author vmadmin
 *
 */
public class Drawing {
	
	/**
	 * all forms in the drawing
	 */
	private List<Form> forms = new ArrayList<>();
	
	public Drawing(Form... forms){
		for(Form f: forms){
			addForm(f);
		}
	}
	
	public Drawing(List<Form> forms){
		this.forms = forms;
	}

	/**
	 * Function to draw all figures 
	 * @param g
	 */
	public void drawFigures(Graphics g) {
		for(Form f : forms){
			f.draw(g);
		}
	}
	
	public void addForm(Form f){
		forms.add(f);
	}

	public List<Form> getForms() {
		return forms;
	}

	public void setForms(List<Form> forms) {
		this.forms = forms;
	}

}
