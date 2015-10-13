package ch.ftw.model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Drawing {
	
	private List<Form> forms = new ArrayList<>();
	
	public Drawing(Form... forms){
		for(Form f: forms){
			addForm(f);
		}
	}
	
	public Drawing(List<Form> forms){
		this.forms = forms;
	}

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
