import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
	int speed ;
	
	void update() {
		
	}
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x,y,50,50);
		
	}

	public RocketShip(int x, int y, int height, int width) {
		super(x, y, height, width);
		speed = 5;
	}
	void movingUp(){
		y = y -speed;
	}
	void movingDown() {
		y = y+speed;
	}
	void movingRight() {
		x= x + speed ;
	}
	void movingLeft() {
		x = x-speed;
	}
	
}
