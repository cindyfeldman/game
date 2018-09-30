import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final static int width = 500;
	final static int Height = 800;
	GamePanel game ;
	
public static void main(String[] args) {
	LeagueInvaders league = new LeagueInvaders();
	league.setup();
	
}
public LeagueInvaders() {
	frame = new JFrame();
	game = new GamePanel();
	game.addKeyListener(game);
	game.setFocusable(true);
	
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
