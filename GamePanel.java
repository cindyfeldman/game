import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
GameObject object;
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	object.update();
	repaint();
}
public GamePanel() {
	timer = new Timer(1000/60,this);
	object = new GameObject(100,100,50,50);
}
void startGame() {
	timer.start();
}
@Override

public void paintComponent(Graphics g){
g.fillRect(10, 10,100,100);
object.draw(g);
                

        }
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("KeyPressed");
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("key released");
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("key typed");
}
}
