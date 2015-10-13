package ch.ftw.gui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import ch.ftw.model.Drawing;
import ch.ftw.model.Form;
import ch.ftw.model.Rectangular;

/**
 * Papier ist eine von JPanel abgeleitete Swing-Komponente. - Sie dient als
 * "Zeichenblatt" für Zeichnungen. - Sie speichert die Zeichnung in einer
 * Instanzvariablen. - Sie überschreibt die Methode paintComponent der Klasse
 * JPanel so, dass bei ihrem Aufruf die Zeichnung auf das Papier gezeichnet
 * wird.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Paper extends JPanel implements MouseListener {

	/**
	 * Die Zeichnung.
	 */
	private Drawing drawing;
	/**
	 * Position der Maus beim Drücken der Maustaste. Wird von der Methode
	 * mousePressed() gesetzt und von der Methode mouseReleased() gelesen.
	 */
	private int x, y;

	private Form currentFormToDraw = new Rectangular();

	/**
	 * Die Methode paintComponent zeichnet die Zeichnung auf das Papier. Sie
	 * erhält dazu ein Graphics-Objekt, welches sie an die Zeichnung weitergibt.
	 * 
	 * @param g
	 *            Graphics-Objekt, welches zum zeichnen verwendet werden soll.
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(final Graphics g) {
		super.paintComponent(g);
		if (drawing != null)
			drawing.drawFigures(g);
	}

	/**
	 * Setter für die Instanzvariable zeichnung.
	 * 
	 * @param drawing
	 *            Die zu zeichnende Zeichnung.
	 */
	public void setDrawing(final Drawing drawing) {
		this.drawing = drawing;
	}

	/**
	 * Konstruktor. Registriert das eigene Objekt als MousListener.
	 */
	public Paper() {
		addMouseListener(this);
	}

	/**
	 * Wird aufgerufen, wenn die Maustaste gedrückt wird
	 * 
	 * @param e
	 *            Maus-Ereignis für das Drücken der Maustaste
	 */
	public void mousePressed(MouseEvent e) {
		// Speichern den Ort des Ereignisses.
		x = e.getX();
		y = e.getY();
	}

	/**
	 * Wird aufgerufen, wenn die Maustaste wieder losgelassen wird
	 * 
	 * @param e
	 *            Maus-Ereignis für das Loslassen der Maustaste
	 */
	public void mouseReleased(MouseEvent e) {
		// Bestimmen Breite und Hoehe des neuen Rechtecks
		int width = e.getX() - x;
		int height = e.getY() - y;
		// Erzeugen ein neues Rechteckobjekt und speichern dieses
		// in der Zeichnung. Anschliessend alles neu zeichnen.
		drawing.addForm(currentFormToDraw.getFormFromMouse(x, y, width, height));
		repaint();
	}

	// Weitere Ereignisse werden nicht bearbeitet, die Methoden müssen
	// aber implementiert werden!
	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void setCurrentFormToDraw(Form currentFormToDraw) {
		this.currentFormToDraw = currentFormToDraw;
	}

}
