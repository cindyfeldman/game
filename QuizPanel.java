import java.awt.Dimension;

import javax.swing.JFrame;

public class QuizPanel {
JFrame frame;
final static int width = 500;
final static int Height= 800;
GamePanel game;
public QuizPanel() {
	frame = new JFrame();
	game = new GamePanel();
	game.addKeyListener(game);
	game.setFocusable(true);
	
}
public static void main(String[] args) {
	QuizPanel panel = new QuizPanel();
	panel.setup();
	GamePanel game = new GamePanel();
	QuizFrame quiz = new QuizFrame();



}
void setup() {
	frame.add(game);
	frame.getContentPane().setPreferredSize(new Dimension(width,Height));
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	game.startGame();
	

}
}