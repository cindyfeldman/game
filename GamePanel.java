import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;

	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public static void main(String[] args) {

		GamePanel panel = new GamePanel();
		panel.updateMenuState();

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(100, 100, 200, 150);
		g.setFont(titleFont);
		g.drawString("Guess The Song", 50, 50);
	}

	public void drawGameState(Graphics g) {

	}

	public void drawEndState(Graphics g) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {

			updateMenuState();
			JOptionPane.showMessageDialog(null,
					"Welcome to GUess The Song. Once started, 5 seconds of a song will play. Choose out of 4 options of Artists. Guess correctly and you will earn points! If you guess incorrectly 3 times, you lose! Guess faster to earn more points! Have fun!");
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}
}