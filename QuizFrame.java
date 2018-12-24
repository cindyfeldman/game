import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuizFrame implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton One;
	JButton two;
	JButton three;
	JButton four;
	int score = 0;
	URL sound;
	AudioClip noise;
JLabel label;
GamePanel panels;
JButton exit;

JButton end;
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
exit = new JButton();

		One = new JButton();
		two = new JButton();
		three = new JButton();
		four = new JButton();
		end = new JButton();
		label.setText("Question 1: ");
		exit.setText("EXIT");
		end.setText("get score");
		One.setText("The Light");
		two.setText("Moonlight");
		three.setText("Sad!");
		four.setText("Reel it in");
		panel.add(One);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(end);
		panel.add(exit);
		end.setEnabled(false);
		exit.setEnabled(false);
		One.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		end.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		noise.stop();
		QuizFrame frames = new QuizFrame();
		GamePanel panels = new GamePanel();
		
	
		JButton buttonPressed = (JButton)e.getSource();//1
	if(buttonPressed==two&&two.getText().equals("Moonlight")){
		
		sound("file:src/Happier 1.aiff");
		score+=10;
		panel.setBackground(Color.GREEN);
		frame.setSize(400,600);
		label.setText("Correct!"+ "+10"+" Question 2:" );
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		
	}
	else if(buttonPressed==One&&One.getText().equals("The Light")) {//1
		sound("file:src/Happier 1.aiff");
		panel.setBackground(Color.RED);
		frame.setSize(400, 600);
		label.setText("Incorrect "+ " - 10"+" Question 2:" );
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		score -= 10;
	}
	else if(buttonPressed==three&&three.getText().equals("Sad!")) {//1
		sound("file:src/Happier 1.aiff");
		panel.setBackground(Color.RED);
		frame.setSize(400, 600);
		label.setText("Incorrect " + " - 10"+" Question 2:" );
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		score-=10;
	}
	else if(buttonPressed==four&&four.getText().equals("Reel it in")) {//1
		sound("file:src/Happier 1.aiff");
		frame.setSize(400, 600);
		panel.setBackground(Color.RED);
		label.setText("Incorrect " +" - 10"+" Question 2:" );
		One.setText("Happier");
		two.setText("HICCUP");
		three.setText("SHINE");
		four.setText("CANTU");
		score-=10;
	}
	else if(buttonPressed==One&&One.getText().equals("Happier")) {//2
		
		sound("file:src/Why.aiff");
		score +=10;
		panel.setBackground(Color.GREEN);
		label.setText("Correct " + " + 10"+" Question 3:");
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("WHY");
		four.setText("Wake up in the sky");
		
	}
	else if(buttonPressed == two&& two.getText().equals("HICCUP")) {//2
		
		sound("file:src/Why.aiff");
		panel.setBackground(Color.RED);
		score -=10;
		label.setText("incorrect! " + " - 10"+" Question 3:");
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("WHY");
		four.setText("Wake up in the sky");
		
	}
	else if(buttonPressed==three&&three.getText().equals("SHINE")){//2
	
		sound("file:src/Why.aiff");
		panel.setBackground(Color.RED);
		score -=10;
		label.setText("incorrect " +  " - 10"+" Question 3:");
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("WHY");
		four.setText("Wake up in the sky");
		
		}
	else if(buttonPressed==four&&four.getText().equals("CANTU")) {//2
		
		sound("file:src/Why.aiff");
		panel.setBackground(Color.RED);
		score -=10;
		label.setText("incorrect " + " - 10"+" Question 3:");
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("WHY");
		four.setText("Wake up in the sky");
	
	}
	else if(buttonPressed==One&&One.getText().equals("ZEZE")) {//3
		
		sound("file:src/MIA.aiff");
		score -=10;
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + " - 10"+" Question 4:");
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		
	}
	else if(buttonPressed==two&&two.getText().equals("Spice Girl")) {//3
		
		sound("file:src/MIA.aiff");
		score -=10;
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + " - 10"+" Question 4:");
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
	
	}
	else if(buttonPressed==three&&three.getText().equals("WHY")) {//3
	
		sound("file:src/MIA.aiff");
		score +=10;
		panel.setBackground(Color.GREEN);
		label.setText("Correct! " + " +10"+" Question 4:");
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
	
	
	}
	else if(buttonPressed==four&&four.getText().equals("Wake up in the sky")) {//3
		
		sound("file:src/MIA.aiff");
		panel.setBackground(Color.RED);
		score -=10;
		label.setText("Incorrect " + " - 10"+" Question 4:");
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		end.setEnabled(false);
	}

	
	else if(buttonPressed==One&&One.getText().equals("Casper")) {//4
		end.setEnabled(true);
		exit.setEnabled(true);
		exit.setSize(100, 50);
		end.setSize(100, 100);
		panel.remove(One);
		panel.remove(three);
		panel.remove(two);
		panel.remove(four);
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + " - 10");
		score-=10;
		
	
	}
	
	else if(buttonPressed==two&&two.getText().equals("Lose it")) {//4
		end.setEnabled(true);
		exit.setEnabled(true);
		exit.setSize(100, 50);
		end.setSize(100, 100);
		panel.remove(One);
		panel.remove(three);
		panel.remove(two);
		panel.remove(four);
		panels.updateEndState();
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + " -10");
		score-=10;
panels.currentState+=1;
		
	}
	else if(buttonPressed==four&&four.getText().equals("MIA")) {//4
		end.setEnabled(true);
		exit.setEnabled(true);
		exit.setSize(100, 50);
		end.setSize(100, 100);
		panel.remove(One);
		panel.remove(three);
		panel.remove(two);
		panel.remove(four);
		score+=10;
		label.setText("Correct! " + "+10");

	}
	else if(buttonPressed==three&&three.getText().equals("DNA")) {//4
		end.setEnabled(true);
		exit.setEnabled(true);
		exit.setSize(100, 50);
		end.setSize(100, 100);
		panel.remove(One);
		panel.remove(two);
		panel.remove(three);
		panel.remove(four);
		panels.currentState +=1;
		panels.updateEndState();
		noise.stop();
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "- 10");
	score-=10;
	

	}
	else if(buttonPressed ==end&&One.getText()=="Casper") {
		
		panel.setBackground(Color.yellow);
		exit.setEnabled(true);
		panel.remove(One);
		panel.remove(two);
		panel.remove(three);
		panel.remove(four);
		if(score<40) {
		label.setText(" Congratulations!  you finished this quiz!" +
		"     Your score is    " + score);
		panel.remove(end);}
		else if(score==40) {
			label.setText(" Congratulations!"+ "  you finished this quiz!" +
			    "   you got 100% correct!");
			panel.remove(end);
		}
	
		}
		if(buttonPressed==exit) {
			frame.dispose();
	}
	
	}
	
	
	
	
		private void sound(String fileName) {
			 try
		        {
		            sound = new URL(fileName) ;
		            noise = JApplet.newAudioClip(sound);
		            noise.play();
		           
		        } 
			 
					 catch (MalformedURLException e)
		        {
		            e.printStackTrace();
 }}}
			
				