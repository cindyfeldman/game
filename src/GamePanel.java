import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
Font titleFont ;
Font other;
int x ;
int y ;
RocketShip ship = new RocketShip(250,700,50,50);
ObjectManager  object = new ObjectManager(ship);
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(currentState== MENU_STATE) {
		updateMenuState();
	}
	else if(currentState==GAME_STATE) {
		updateGameState();
	}
	else {
		updateEndState();
	}
	repaint();
}
public GamePanel() {
	timer = new Timer(1000/60,this);
	titleFont = new Font("Arial",Font.PLAIN,48);
	other = new Font("Arial",Font.PLAIN,25);
	
	
}
void startGame() {
	timer.start();
}
@Override

public void paintComponent(Graphics g){
g.fillRect(10, 10,100,100);
if(currentState==MENU_STATE) {
	drawMenuState(g);
}
else if(currentState==GAME_STATE) {
	drawGameState(g);
}
else {
	drawEndState(g);
}
                

        }
void updateMenuState() {
	
}
void updateGameState() {
	object.update();
}
void updateEndState() {
	
}
void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0,0,LeagueInvaders.width,LeagueInvaders.Height);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("League Invaders", 40, 100);
	g.setFont(other);
	g.drawString("Press ENTER To Start",70,300);
	g.drawString ("Press SPACE for instructions",40,500);
	
}
void drawGameState(Graphics g) {
	g.setColor(Color.black );
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.Height);
	object.draw(g);
}
void drawEndState(Graphics g) {
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.Height);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("GAME OVER", 70,300);
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
currentState = currentState+1;
	}
		
	
	if(currentState>END_STATE) {
		currentState= MENU_STATE;
	}
	if(arg0.getKeyCode()==KeyEvent.VK_UP) {
		ship.movingUp();
	}
	else if(arg0.getKeyCode()==KeyEvent.VK_DOWN) {
		ship.movingDown();
	}
	else if(arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
		ship.movingRight();
	}
	else {
		ship.movingLeft();
	}
	
}


@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	

}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub

}
}