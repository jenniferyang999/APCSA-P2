
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	private Wall right;
	private Wall left;
	private Wall top;
	private Wall bottom;

	public Pong() {
		// set up all variables related to the game

		keys = new boolean[4];

		// instantiate a Ball
		//ball = new Ball();
		ball = new BlinkyBall();
		//ball = new Ball(100,90);		
		//ball = new Ball(100,100,25,25);		
		//ball = new Ball(200, 200, 10, 10, Color.blue);
		//ball = new Ball(100,100,30,50,Color.PINK,5,6);
		// instantiate a left Paddle
		ball.setColor(Color.ORANGE);
		ball.setXSpeed(2);
		ball.setYSpeed(2);
		leftPaddle = new Paddle(0, 20, 20, 80, Color.RED, 6);

		// instantiate a right Paddle
		rightPaddle = new Paddle(764, 20, 20, 80, Color.GREEN, 6);

		
		right = new Wall(0, 0, 10, 800);
		left = new Wall(0, 0, 800, 10);
		top = new Wall(0,0,800,10);
		bottom = new Wall(0, 540, 800, 50);

		setBackground(Color.BLACK);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}


	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {

		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen if(back
		// == null)
		back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);



		graphToBack.setColor(Color.black);
		graphToBack.drawString("Right score : " + rightScore, 240, 440);
		graphToBack.drawString("Left score : " + leftScore, 240, 460);

		if (leftPaddle.didCollideBottom(bottom) || leftPaddle.didCollideTop(top))
		{
			if(leftPaddle.didCollideBottom(bottom))
			{
				leftPaddle.moveUpAndDraw(graphToBack);
			}
			if(leftPaddle.didCollideTop(top))
			{
				leftPaddle.moveDownAndDraw(graphToBack);
			}
		}
		
		if (rightPaddle.didCollideBottom(bottom) || rightPaddle.didCollideTop(top))
		{
			if(rightPaddle.didCollideBottom(bottom))
			{
				rightPaddle.moveUpAndDraw(graphToBack);
			}
			if(rightPaddle.didCollideTop(top))
			{
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}
		
		
		if (ball.didCollideLeft(leftPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());

		}
		
		if (ball.didCollideRight(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());

		}
		

		if (leftPaddle.didCollideBottom(bottom) || leftPaddle.didCollideTop(top))
		{
			if(leftPaddle.didCollideBottom(bottom))
			{
				leftPaddle.moveUpAndDraw(graphToBack);
			}
			if(leftPaddle.didCollideTop(top))
			{
				leftPaddle.moveDownAndDraw(graphToBack);
			}
		}
		
		if (rightPaddle.didCollideBottom(bottom) || rightPaddle.didCollideTop(top))
		{
			if(rightPaddle.didCollideBottom(bottom))
			{
				rightPaddle.moveUpAndDraw(graphToBack);
			}
			if(rightPaddle.didCollideTop(top))
			{
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}
		
		/*if (ball.didCollideLeft(left))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			ball.setX(300);
			ball.setY(300);

			rightScore++;

		}
		
		if (ball.didCollideRight(right))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			ball.setX(300);
			ball.setY(300);
			
			leftScore++;

		}
		*/
		
		if (ball.getX() >= 20 && ball.getX() < 33 && ball.getY() < leftPaddle.getY() + 40
				&& ball.getY() > (leftPaddle.getY() + 40)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
		}

		// see if the ball hits the right paddle
		if (ball.getX() >= 790 && ball.getY() <= rightPaddle.getY() + 40
				&& ball.getY() >= rightPaddle.getY() + 40) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
		}
		
		if (!(ball.getX() > 0)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			ball.setX(250);
			ball.setY(250);

			rightScore++;
		}
		if (!(ball.getX() <= 760)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			ball.setX(250);
			ball.setY(250);
			leftScore++;
		}

		if ((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()))
				&& (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= leftPaddle.getY()
								&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())) {
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				ball.setYSpeed(-ball.getYSpeed());
			else
				ball.setXSpeed(-ball.getXSpeed());
		}
		if ((ball.getX() + ball.getWidth() >= rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				&& (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= rightPaddle.getY()
								&& ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())) {
			if (ball.getX() + ball.getWidth() <= rightPaddle.getX() - rightPaddle.getWidth()
					+ Math.abs(ball.getXSpeed()))
				ball.setYSpeed(-ball.getYSpeed());
			else
				ball.setXSpeed(-ball.getXSpeed());
		}

		if (ball.getY() <= 5) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.getY() >= 540) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		
		
		
		
		// see if the paddles need to be moved
		if (keys[0] == true)

		{
			// move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if (keys[1] == true)

		{
			// move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);
		}
		if (keys[2] == true)

		{
			rightPaddle.moveUpAndDraw(window);
		}
		if (keys[3] == true)

		{
			rightPaddle.moveDownAndDraw(window);
		}

		twoDGraph.drawImage(back, null, 0, 0);

	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'S':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'K':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'S':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'K':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}