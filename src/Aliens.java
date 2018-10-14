import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject{

	public Aliens(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	void update() {
		y = y++;
	}
void draw(Graphics g) {
	g.setColor(Color.yellow);
	g.drawRect(x, y, width, height);
}
}
