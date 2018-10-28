import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
	int speed ;
	
	void update() {
		super.update();
	}
	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		
	}

	public RocketShip(int x, int y, int height, int width) {
		super(x, y, height, width);
		speed = 20;
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
