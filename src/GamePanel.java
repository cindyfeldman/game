import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	JButton start;

	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
	}


public void paintComponent(Graphics g) {
	g.fillRect(10, 10, 100, 100);;
	if(currentState == MENU_STATE) {
		drawMenuState(g);
	
	}
	else if(currentState == GAME_STATE) {
		drawGameState(g);
		
	}
	else {
		drawEndState(g);
	}
}
	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 200, 150);
		g.setFont(titleFont);
		g.drawString("Guess The Song", 50, 50);
		start = new JButton("START");
	}

	public void drawGameState(Graphics g) {

	}

	public void drawEndState(Graphics g) {

	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(currentState == END_STATE) {
				
			}
			currentState = currentState + 1;
	}}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else {
			updateEndState();
		}
		
	}
	}