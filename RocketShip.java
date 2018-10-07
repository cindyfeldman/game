import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
	int speed ;
	
	void update() {
		
	}
	void draw(Graphics c) {
		c.setColor(Color.BLUE);
		c.fillRect(x, y, width, height);
		
	}

	public RocketShip(int x, int y, int height, int width) {
		super(x, y, height, width);
		speed = 5;
	}
	
}
