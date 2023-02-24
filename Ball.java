import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends Rectangle{

	Random random;
	int xVelocity;
	int yVelocity;
	int initialspeed = 2;
	
	Ball(int x,int y , int weight, int height){
		super(x,y,weight,height);
		random = new Random();
		int randomXDirection =  random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection-- ;
		setXDirection(randomXDirection*initialspeed);
		int randomYDirection =  random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection-- ;
		setYDirection(randomYDirection*initialspeed);
		
	}
	
	

	public void setXDirection(int randomXdirection) {
		xVelocity = randomXdirection;
	}
	public void setYDirection(int randomYdirection) {
		yVelocity = randomYdirection;
	}
	public void move() {
		x+=xVelocity;
		y+=yVelocity;
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
