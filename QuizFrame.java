import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

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

public static void main(String[] args) {
	QuizFrame quiz = new QuizFrame();
    	quiz.getGoing();
  
    	GamePanel panel= new GamePanel();
	}
	

	public void getGoing() {
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
		frame.pack();
		One.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();//1
	if(buttonPressed==two&&two.getText().equals("Moonlight")){
		panel.setBackground(Color.GREEN);
		frame.setSize(400,600);
label.setText("Correct!"+ " your score is: "+ score);
One.setText("Happier");
two.setText("HICCUP");
three.setText("SHINE");
four.setText("CANTU");
score+=10;
	}
	else if(buttonPressed==One&&One.getText().equals("Why?")) {//1
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
		panel.setBackground(Color.GREEN);
		label.setText("Correct " + "Your Score is : " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Sicko Mode");
		four.setText("Wake up in the sky");
		score +=10;
	}
	else if(buttonPressed == two&& two.getText().equals("HICCUP")) {//2
		panel.setBackground(Color.RED);
		label.setText("incorrect! " + "Your score is: " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Sicko Mode");
		four.setText("Wake up in the sky");
		score -=1;
	}
	else if(buttonPressed==three&&three.getText().equals("SHINE")){//2
		panel.setBackground(Color.RED);
		label.setText("incorrect " + "Your score is: " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Sicko Mode");
		four.setText("Wake up in the sky");
		score-=1;
		}
	else if(buttonPressed==four&&four.getText().equals("CANTU")) {//2
		panel.setBackground(Color.RED);
		label.setText("incorrect " + "Your score is: " + score);
		One.setText("ZEZE");
		two.setText("Spice Girl");
		three.setText("Sicko Mode");
		four.setText("Wake up in the sky");
		score-=1;
	}
	else if(buttonPressed==One&&One.getText().equals("ZEZE")) {//3
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		score-=1;
	}
	else if(buttonPressed==two&&two.getText().equals("Spice Girl")) {//3
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		score-=1;
	}
	else if(buttonPressed==three&&three.getText().equals("Sicko Mode")) {//3
		panel.setBackground(Color.GREEN);
		label.setText("Correct! " + " Your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		score +=10;
	}
	else if(buttonPressed==four&&four.getText().equals("Wake up in the sky")) {//3
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		One.setText("Casper");
		two.setText("Lose it");
		three.setText("DNA");
		four.setText("MIA");
		score-=1;
	}
	
	else if(buttonPressed==One&&One.getText().equals("Casper")) {//4
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		score-=1;
	}
	else if(buttonPressed==two&&two.getText().equals("Lose it")) {//4
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
		score-=1;
	}
	else if(buttonPressed==four&&four.getText().equals("MIA")) {//4
		panel.setBackground(Color.GREEN);
		label.setText("Correct! " + "your score is: " + score);
		score+=10;
	}
	else if(buttonPressed==three&&three.getText().equals("DNA")) {//4
		panel.setBackground(Color.RED);
		label.setText("Incorrect " + "your score is: " + score);
	score-=1;}
	
	}

	}

		
	
	/*
		private void sound() {
			 try
		        {
		            sound = new URL("file:src/Moonlight(1).aiff") ;
		            noise = JApplet.newAudioClip(sound);
		            noise.play();
		            System.out.println("playing sound");
		        } catch (MalformedURLException e)
		        {
		            e.printStackTrace();
		        }
		    */
	