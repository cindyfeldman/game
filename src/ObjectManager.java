import java.awt.Graphics;

public class ObjectManager {
RocketShip rocket ;

public ObjectManager(RocketShip rocket) {
	this.rocket = rocket;
	
}
void update() {
	rocket.update();
}
void draw(Graphics g) {
	rocket.draw(g);
	
}
}
