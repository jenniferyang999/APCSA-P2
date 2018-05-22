
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PaddleTestTwo extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys; // keeps track of what keys are pressed

	public PaddleTestTwo() {
		// set up all game variables
		keys = new boolean[4];

		// instantiate a Ball
		ball = new Ball(50, 50, 25, 25, Color.BLUE);

		// instantiate a left Paddle
		leftPaddle = new Paddle(10, 20, 20, 80, Color.RED, 10);

		// instantiate a right Paddle
		rightPaddle = new Paddle(750, 20, 20, 80, Color.GREEN, 10);
		keys = new boolean[5];

		// set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);	
	}

	public void paint(Graphics window) {
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);

		if (!(ball.getX() >= 10 && ball.getX() <= 780)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (!(ball.getY() >= 10 && ball.getY() <= 550)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (keys[0] == true) {
			// move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if (keys[1] == true) {
			// move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);
		}
		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(window);
		}
		if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(window);
		}
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
		// no code needed here
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