
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuizFrame implements ActionListener, KeyListener {
	JFrame frame;
	JPanel panel;
	JButton One;
	JButton two;
	JButton three;
	JButton four;
	int score = 0;
	URL sound;
	AudioClip noise;
 	Graphics g;
JLabel label;
JButton endScore;
GamePanel panels;
Timer timer ;

JLabel dos;


	public void getGoing() {
	
		sound("file:src/Moonlight.aiff");
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,600);
		panel = new JPanel();
		frame.add(panel);
		frame.setTitle("Quiz");
label = new JLabel();
panel.add(label);

		One = new JButton();
		two = new JButton();
		three = new JButton();
		four = new JButton();
		One.setText("Why?");
		two.setText("Moonlight");
		three.setText("Sad!");
		four.setText("Reel it in");
		panel.add(One);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		endScore = new JButton();
		endScore.setText("get score"
				);
		//frame.pack();
		One.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
	frame.addKeyListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		noise.stop();
		QuizFrame frames = new QuizFrame();
		
		JButton buttonPressed = (JButton)e.getSource();//1
	if(buttonPressed==two&&two.getText().equals("Moonlight")){
		
		sound("file:src/Happier 1.aiff");
		score+=10;
		panel.setBackground(Color.GREEN);
		frame.setSize(400,600);
		label.setText("Correct!"+ " your score is: "+ score);
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		
	}
	else if(buttonPressed==One&&One.getText().equals("Why?")) {//1
		sound("file:src/Happier 1.aiff");
		panel.setBackground(Color.RED);
		frame.setSize(400, 600);
		label.setText("Incorrect "+ "your score is: " + score);
		
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		score -= 1;
	}
	else if(buttonPressed==three&&three.getText().equals("Sad!")) {//1
		sound("file:src/Happier 1.aiff");
		panel.setBackground(Color.RED);
		frame.setSize(400, 600);
		label.setText("Incorrect " + "Your score is: "+ score);
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		score-=1;
	}
	else if(buttonPressed==four&&four.getText().equals("Reel it in")) {//1
		sound("file:src/Happier 1.aiff");
		frame.setSize(400, 600);
		panel.setBackground(Color.RED);
		label.setText("Incorrect " +" Your score is: " + score );
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		score-=1;
	}
	else if(buttonPressed==One&&One.getText().equals("Happier")) {//2
		
		sound("file:src/Chun Swae.aiff");
		score +=10;
		panel.setBackground(Color.GREEN);
		label.setText("Correct " + "Your Score is : " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Chun Swae");
		four.setText("Wake up in the sky");
		;
	}
	else if(buttonPressed == two&& two.getText().equals("HICCUP")) {//2
		
		sound("file:src/Chun Swae.aiff");
		panel.setBackground(Color.RED);
		score -=1;
		label.setText("incorrect! " + "Your score is: " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Chun Swae");
		four.setText("Wake up in the sky");
		
	}
	else if(buttonPressed==three&&three.getText().equals("SHINE")){//2
	
		sound("file:src/Chun Swae.aiff");
		panel.setBackground(Color.RED);
		score -=1;
		label.setText("incorrect " + "Your score is: " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Chun Swae");
		four.setText("Wake up in the sky");
		
		}
	else if(buttonPressed==four&&four.getText().equals("CANTU")) {//2
		
		sound("file:src/Chun Swae.aiff");
		panel.setBackground(Color.RED);
		score -=1;
		label.setText("incorrect " + "Your score is: " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Chun Swae");
		four.setText("Wake up in the sky");
	
	}
	else if(buttonPressed==One&&One.getText().equals("ZEZE")) {//3
		
		sound("file:src/MIA.aiff");
		score -=1;
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
	
	}
	else if(buttonPressed==two&&two.getText().equals("Spice Girl")) {//3
		
		sound("file:src/MIA.aiff");
		score -=1;
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		
	}
	else if(buttonPressed==three&&three.getText().equals("Chun Swae")) {//3
	
		sound("file:src/MIA.aiff");
		score +=10;
		panel.setBackground(Color.GREEN);
		label.setText("Correct! " + " Your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
	
	}
	else if(buttonPressed==four&&four.getText().equals("Wake up in the sky")) {//3
		
		sound("file:src/MIA.aiff");
		panel.setBackground(Color.RED);
		score -=1;
		label.setText("Incorrect " + "your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		
	}
	
	else if(buttonPressed==One&&One.getText().equals("Casper")) {//4
		frame.setSize(600,400);
		panel.setBackground(Color.RED);
		label.setText("You have finished the quiz! "
				+ "press the button to get your final score!");
		panel.remove(One);
		panel.remove(two);
		panel.remove(three);
		panel.remove(four);
		score-=1;
		frame.add(endScore);
		endScore.setSize(50,50);
	
		frame.add(endScore);
		
	
	
	}
	else if(buttonPressed==endScore) {
		label.setText("your score is:" +score);
	}
	else if(buttonPressed==two&&two.getText().equals("Lose it")) {//4
		frame.setSize(600,400);
		panels.updateEndState();
		panel.setBackground(Color.RED);
		label.setText("You have finished the quiz! "
				+ "press the backspace to get your final score!");
		panel.remove(One);
		panel.remove(two);
		panel.remove(three);
		panel.remove(four);
		score-=1;

		
	}
	else if(buttonPressed==four&&four.getText().equals("MIA")) {//4
		frame.setSize(600,400);
		score+=10;
		label.setText("You have finished the quiz! "
				+ "press the backspace to get your final score!" );
		panel.remove(One);
		panel.remove(two);
		panel.remove(three);
		panel.remove(four);
		

	}
	else if(buttonPressed==three&&three.getText().equals("DNA")) {//4
		noise.stop();
		frame.setSize(600,400);
		panel.setBackground(Color.RED);
		label.setText("You have finished the quiz! "
				+ "press the backspace to get your final score!");
		
		panel.remove(One);
		panel.remove(two);
		panel.remove(three);
		panel.remove(four);
	score-=1;
	

	}
	
	}
		private void sound(String fileName) {
			 try
		        {
		            sound = new URL(fileName) ;
		            noise = JApplet.newAudioClip(sound);
		            noise.play();
		            System.out.println("playing sound");
		        } 
			 
					 catch (MalformedURLException e)
		        {
		            e.printStackTrace();
 }}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
				System.out.println("back");
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}