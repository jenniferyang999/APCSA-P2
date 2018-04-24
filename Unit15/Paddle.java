
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	public Paddle(int nx, int ny) {
		super(nx, ny);
		speed = 5;
	}

	public Paddle(int nx, int ny, int widthr, int heightr, int speedr) {
		super(nx, ny, widthr, heightr);
		speed = speedr;
	}

	public Paddle(int nx, int ny, int widthr, int heightr, Color col, int speedr) {
		super(nx, ny, widthr, heightr, col);
		speed = speedr;
	}

	public Paddle(int nx, int ny, int speedr) {
		super(nx, ny);
		speed = speedr;
	}

	// add the other Paddle constructors

	public void moveUpAndDraw(Graphics window) {
		 window.setColor(Color.WHITE);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	      setY(getY() - getSpeed());
		  window.setColor(getColor());

	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void moveDownAndDraw(Graphics window) {
		 window.setColor(Color.WHITE);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	      setY(getY() + getSpeed());
		  window.setColor(getColor());

	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void setSpeed(int s) {
		speed = s;
	}
	
	public boolean didCollideTop(Object obj){
		Wall test = (Wall)obj;
		if (getY() <= test.getY() + test.getHeight()){
			return true;
		}
		else{
			return false;

		}
	}
	public boolean didCollideBottom(Object obj){
		Wall test = (Wall)obj;
		if (getY() >= test.getY() - test.getHeight()){
			return true;
		}
		else{
			return false;

		}
	}
	// add get methods
	public int getX() {
		return super.getX();
	}

	public int getY() {
		return super.getY();
	}

	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		return "x - " + getX() + " y - " + getY() + " width - " + getWidth() + " height - " + getHeight() + " Color - "
				+ getColor() + " Speed - " + getSpeed();
	}
}