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
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	JButton start;
	Timer timer;
QuizFrame quizFrame;
Font news;
	public GamePanel() {
		timer = new Timer(100 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		news = new Font("Arial", Font.PLAIN, 20);
	}

void startGame() {
	timer.start();
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
public void updateMenuState() {

}

public void updateGameState() {

}

public void updateEndState() {

}
	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0,0,600,800);
	
		g.setFont(titleFont);
		g.setColor(Color.red);
		g.drawString("Guess The Song", 50, 50);
		g.setFont(news);
		g.drawString("Press enter to start", 120,100);
	}

	public void drawGameState(Graphics g) {
quizFrame = new QuizFrame();
quizFrame.getGoing();

	}

	public void drawEndState(Graphics g) {
g.setColor(Color.red);
g.fillRect(0, 0, 400, 600);
g.setFont(titleFont);
g.setColor(Color.YELLOW);
g.drawString("You completed this quiz!", 70, 300);
	}

	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState = currentState + 1;
			System.out.println("Enter");
		}

		if (currentState > END_STATE) {
			currentState = GAME_STATE;
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