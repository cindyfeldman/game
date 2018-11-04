import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class QuizFrame {
	JFrame frame;
	JPanel panel;
	JButton One;
	JButton two;
	JButton three;
	JButton four;

	public void getGoing() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 600);
		panel = new JPanel();
		frame.add(panel);
		One = new JButton();
		two = new JButton();
		three = new JButton();
		four = new JButton();
		panel.add(One);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		frame.pack();

	}
}
