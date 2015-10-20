package ch.ftw.gui;

import javax.swing.JFrame;

import ch.ftw.model.Drawing;

/**
 * Die Klasse Zeichenbrett ermöglicht die Darstellung von Zeichnungen. Sie
 * öffnet ein Fenster auf dem Desktop, welches als einzige Komponente ein
 * Papierobjekt enthält.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class DrawingBoard extends JFrame {

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
		addKeyListener(paper);
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

}
