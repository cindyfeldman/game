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
	int x= 0;
	int y =0;
	int Width=600;
	int Height= 800;
	Font titleFont;
QuizFrame frames = new QuizFrame();
	Timer timer;
QuizPanel quiz;
Font news;
	public GamePanel() {
		timer = new Timer(100 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN,36);
		news = new Font("Arial", Font.PLAIN, 20);
	}

void startGame() {
	timer.start();
	currentState = MENU_STATE;
}
public void paintComponent(Graphics g) {
	g.fillRect(10, 10, 100, 100);;
	if(currentState == MENU_STATE) {
		drawMenuState(g);
	
	}
	else if(currentState == GAME_STATE) {
		drawGameState(g);
		currentState +=1;
	}
	else if(currentState == END_STATE){
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
		g.fillRect(x,y,Width,Height);
	
		g.setFont(titleFont);
		g.setColor(Color.red);
		g.drawString("Guess The Song", 50, 50);
		g.setFont(news);
		g.drawString("Press space to get instructions", 60, 300);
		g.drawString("Press enter to start", 120,100);
		
	}

	public void drawGameState(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight() );
	
	}

	public void drawEndState(Graphics g) {
		g.equals(quiz);
		currentState = END_STATE;
g.setColor(Color.black);
g.fillRect(0, 0, 600, 800);
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
		
			currentState +=1;
			repaint();
		 	QuizFrame quiz = new QuizFrame();
			quiz.getGoing();
			quiz.frame.setSize(400, 600);
			
		}
		
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			JOptionPane.showMessageDialog(null, "you have 10 seconds to listen to a song and guess the name.  Get all 4 questions right to win!");
		}
	
		
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
		} else if (currentState == GAME_STATE) {
			updateGameState();
			
		} else if(currentState ==END_STATE){
			updateEndState();
			

		}
		
		
	}
	}