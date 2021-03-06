//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int speed;
	private Color color;

	public Block()
	{
		setX(100);
		setY(150);
		setWidth(10);
		setHeight(10);
		setColor(Color.GREEN);

	}
	
	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(Color.GREEN);

	}
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(Color.GREEN);

	}
	
	public Block(int x, int y, int w, int h, Color col)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(col);
		//speed = s;
	}
	
   //add the other set methods
	public void setX(int x)
   {
	  xPos = x;
   }
	public void setY(int y)
   {
	  yPos = y;
   }
	public void setWidth(int w)
   {
	  width = w;
   }
	public void setHeight(int h)
   {
	  height = h;
   }
   public void setColor(Color col)
   {
	   color = col;
   }
   public void setPos(int x, int y) {
		xPos = x;
				yPos = y;
	}

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block test = (Block) obj;
		if (this.getX() == test.getX() && this.getY() == test.getY() && this.getHeight() == test.getHeight() && this.getWidth() == test.getWidth() && this.getColor() == test.getColor())
		{
			return true;
		}

		return false;
	}   

	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public Color getColor()
	{
		return color;
	}
	   

	//add a toString() method  - x , y , width, height, color
	public String toString()
	{
		String output = "";
		output = output + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		return output;
	}

}