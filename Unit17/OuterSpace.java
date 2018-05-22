//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	private Alien alienTwo;
	//private Ammo ammothingy;
	private Bullets bullets;
	
	private AlienHorde horde;
	private SpecialPower special;
	private int count, countthing = 0;

	private boolean blah = false;
	private boolean[] keys;
	private BufferedImage back;
	private Image img;


	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		
		ship = new Ship(300, 300, 50, 50, 5);
		//alienOne = new Alien(60, 120, 30, 30, 10);
		alienTwo = new Alien(170, 110, 30, 30, 10);
		
		//ammothingy = new Ammo(ship.getX(), ship.getY(), 2);
		bullets = new Bullets();
		horde = new AlienHorde(102);
		special = new SpecialPower();
		
		
		//Ship, Alien

		try
		{
			img = ImageIO.read(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Error: no lose image.");
		}
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		if (ship.getX() >= 0)
		{
			if(keys[0] == true)
			{
				ship.move("LEFT");
			}
		}
			
		if (ship.getX() <= 800 - ship.getWidth() - ship.getWidth()/2){
		 if (keys[1] == true){	
			ship.move("RIGHT");
		}
		}
		
		if (ship.getY() >= 0){
		if (keys[2] == true) {
			ship.move("UP");		
		}
		}
		
		if (ship.getY() <= 600 - ship.getHeight() - ship.getHeight()){
		if (keys[3] == true) {
			ship.move("DOWN");
		}
		}
		
		if (keys[4] == true && count > 40 && blah == false)
		{
			bullets.add(new Ammo(ship.getX() + 20, ship.getY() + 10, 2));
			
			count = 0;
		}
		else if (keys[4] == true && count > 40 && blah == true)
		{
			special.add(new Ammo(ship.getX() + 20, ship.getY() + 10, 2));

			count = 0;
		}

		//add code to move Ship, Alien, etc.
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		//ammothingy.draw(graphToBack);
		

		horde.drawEmAll(graphToBack);
		
		horde.moveEmAll();
		count++; 
		horde.removeDeadOnes(bullets.getList(), graphToBack);


		if (horde.getValue() > 10 && horde.getValue() < 30) 
		{
			
			blah = true;
			special.drawEmAll(graphToBack, horde);
			special.moveEmAll();
			special.cleanEmUp(graphToBack);
			horde.removeDeadOnes(special.getList(), graphToBack);
			horde.endGame(ship, graphToBack);
			if (horde.endGame(ship, graphToBack))
			{
				while (countthing < 1000000)
					{
						graphToBack.drawImage(img, 200, 200, 800, 600, null);
						countthing++;
					}

			}


		}
		

		else {
			if (horde.getValue() > 40)
			{
				horde.setValue();
			}
			blah = false;
			bullets.drawEmAll(graphToBack);
			bullets.moveEmAll();
			bullets.cleanEmUp(graphToBack);
			horde.removeDeadOnes(bullets.getList(), graphToBack);
			horde.endGame(ship, graphToBack);
			if (horde.endGame(ship, graphToBack))
			{
				//graphToBack.drawImage(img, 200, 200, 800, 600, null);
				graphToBack.setColor(Color.YELLOW);
				graphToBack.drawString("YOU LOST", 200, 200);


			}

		}


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;

		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

