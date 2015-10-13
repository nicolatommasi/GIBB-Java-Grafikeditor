package ch.ftw.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import ch.ftw.model.Drawing;
import ch.ftw.model.Line;
import ch.ftw.model.Oval;
import ch.ftw.model.Rectangular;

/**
 * Die Klasse Zeichenbrett ermöglicht die Darstellung von Zeichnungen. Sie
 * öffnet ein Fenster auf dem Desktop, welches als einzige Komponente ein
 * Papierobjekt enthält.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class DrawingBoard extends JFrame implements KeyListener {

	/**
	 * Das Papier, auf welchem gezeichnet wird.
	 */
	private final Paper paper = new Paper();

	/**
	 * Konstruktor. Setzt den Titel, Ort, Grösse und Verhalten beim Schliessen
	 * des Zeichenbretts. Erzeugt ein Papierobjekt und fügt dieses in das
	 * Zeichnbrett ein. Zeigt das Zeichenbrett auf dem Desktop an.
	 */
	public DrawingBoard() {
		super("Zeichenbrett für Figuren");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocation(200, 200);
		setContentPane(paper);
		setVisible(true);
		addKeyListener(this);
	}

	/**
	 * Zeigt eine Zeichnung auf dem Zeichenbrett an, indem die Zeichnung auf das
	 * Papier "gesetzt" wird.
	 * 
	 * @param drawing
	 *            Die zu zeigende Zeichnung.
	 */
	public void show(Drawing drawing) {
		paper.setDrawing(drawing);
		// Aufruf von repaint() bewirkt, dass das Fenster des Zeichenbrett
		// auf dem Dektop neu aufgebaut wird.
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'r':
			paper.setCurrentFormToDraw(new Rectangular());
			break;
		case 'l':
			paper.setCurrentFormToDraw(new Line());
			break;

		case 'c':
			paper.setCurrentFormToDraw(new Oval());
			break;
		}
	}
}
