import java.applet.AudioClip;
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



	public void getGoing() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 600);
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
		JButton buttonPressed = (JButton)e.getSource();
	if(buttonPressed==two){
		
label.setText("Correct!");
		
	}
	}
	void sound() {
	try
      {
          sound = new URL("Moonlight.mp3") ;
          noise = JApplet.newAudioClip(sound);
          noise.play();
      } catch (MalformedURLException e)
      {
          e.printStackTrace();
      }
		
	}
}
