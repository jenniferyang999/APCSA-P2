//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.net.URL;
import java.util.List;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		super(x, y);
		speed = 10;
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed = s;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit17\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Error: no alien.");
		}
	}

	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if (direction.equals("UP"))
		{
			setY(getY() - getSpeed());
		}
		if (direction.equals("DOWN"))
		{
			setY(getY() + getSpeed());
		}
		if (direction.equals("RIGHT"))
		{
			setX(getX() + getSpeed());
		}
		if (direction.equals("LEFT"))
		{
			setX(getX() - getSpeed());
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),30 , 30,null);
	}
	

	public String toString()
	{
		return "";
	}
}
