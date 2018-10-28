import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject{

	public Aliens(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	void update() {
		y = y+=5;
		super.update();
	}
void draw(Graphics g) {
	g.drawImage(GamePanel.alienImg,x,y,width,height,null);
}
}
