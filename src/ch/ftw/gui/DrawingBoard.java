package ch.ftw.gui;

import javax.swing.JFrame;

import ch.ftw.model.Drawing;

/**
 * Die Klasse Zeichenbrett erm�glicht die Darstellung von Zeichnungen. Sie
 * �ffnet ein Fenster auf dem Desktop, welches als einzige Komponente ein
 * Papierobjekt enth�lt.
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
	 * Konstruktor. Setzt den Titel, Ort, Gr�sse und Verhalten beim Schliessen
	 * des Zeichenbretts. Erzeugt ein Papierobjekt und f�gt dieses in das
	 * Zeichnbrett ein. Zeigt das Zeichenbrett auf dem Desktop an.
	 */
	public DrawingBoard() {
		super("Zeichenbrett f�r Figuren");
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
