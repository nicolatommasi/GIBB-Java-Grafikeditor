package ch.ftw.gui;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ch.ftw.model.Drawing;
import ch.ftw.model.Form;
import ch.ftw.model.Line;
import ch.ftw.model.Oval;
import ch.ftw.model.Rectangular;
import ch.ftw.model.Text;

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
public class Paper extends JPanel implements MouseListener, KeyListener {

	/**
	 * Die Zeichnung.
	 */
	private Drawing drawing;
	/**
	 * Position der Maus beim Drücken der Maustaste. Wird von der Methode
	 * mousePressed() gesetzt und von der Methode mouseReleased() gelesen.
	 */
	private Point start;
	private char mode = 'r';

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
		start = e.getPoint();
	}

	/**
	 * Wird aufgerufen, wenn die Maustaste wieder losgelassen wird
	 * 
	 * @param e
	 *            Maus-Ereignis für das Loslassen der Maustaste
	 */
	public void mouseReleased(MouseEvent e) {
		Point end = e.getPoint();
		// Erzeugen ein neues Rechteckobjekt und speichern dieses
		// in der Zeichnung. Anschliessend alles neu zeichnen.
		Form f = null;
		switch (mode) {
		case 'r':
			f = new Rectangular(start, end);
			break;
		case 'l':
			f = new Line(start, end);
			break;
		case 'c':
			f = new Oval(start, end);
			break;
		case 'k':
			f = new Oval(start, end);
			break;
		case 't':
			String input = JOptionPane.showInputDialog(this, "Text bitte");
			f = new Text(start, input);
			break;
		}
		if(f != null)
			drawing.addForm(f);
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		mode = e.getKeyChar();	
	}

	// Weitere Ereignisse werden nicht bearbeitet, die Methoden müssen
	// aber implementiert werden!
	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
