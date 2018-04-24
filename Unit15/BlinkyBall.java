
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

class BlinkyBall extends Ball {

	// constructors
	public BlinkyBall() {
		super(269, 232, 25, 25);
		setColor(Color.RED);
	}

	public BlinkyBall(int x, int y) {
		super(x, y);

	}

	public BlinkyBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);

	}

	public BlinkyBall(int x, int y, int wid, int ht, int xs, int ys) {
		super(x, y, wid, ht, xs, ys);

	}

	public BlinkyBall(int x, int y, int wid, int ht, Color col, int xs, int ys) {
		super(x, y, wid, ht, col, xs, ys);

	}

	public Color randomColor() {
		int r = (int) (Math.random() * 255) + 1; // use Math.random()
		int g = (int) (Math.random() * 255) + 1;
		int b = (int) (Math.random() * 255) + 1;
		return new Color(r, g, b);
	}

	public void moveAndDraw(Graphics window) {
		setColor(randomColor());
		super.moveAndDraw(window);

	}
}