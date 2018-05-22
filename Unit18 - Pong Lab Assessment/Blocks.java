//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Blocks
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;
	private List<Block> arrayblocks;
	public Blocks()
	{
		
		arrayblocks = new ArrayList<Block>();
		int x = 0, y = 0;
		while (x <= 800)
			{
				if (x != 0)
				{
					arrayblocks.add(new Block(x + 8, y, 50, 50, Color.MAGENTA));
					arrayblocks.add(new Block(x + 8, y + 63, 50, 50, Color.MAGENTA));
					y = 0;
					x = x + 60;

				}
				else{
					arrayblocks.add(new Block(x + 9, y, 49, 50, Color.MAGENTA));
					x = x + 60;

				}


			}
		
		
		x = 0;
		y = 435;
		while (x <= 800)
			{
				if (x != 0)
				{
					arrayblocks.add(new Block(x + 8, y, 50, 50, Color.MAGENTA));
					arrayblocks.add(new Block(x + 8, y + 63, 50, 50, Color.MAGENTA));
					y = 435;
					x = x + 60;

				}
				else{
					arrayblocks.add(new Block(x + 9, y, 49, 50, Color.MAGENTA));
					x = x + 60;

				}


			}
		
		
		
		
		
		
			x = 9;
			y = 0;
			while (y < 540)
			{
				if (y != 0)
				{
					arrayblocks.add(new Block(x, y + 2, 50, 50, Color.MAGENTA));
					arrayblocks.add(new Block(x + 60, y +2, 50, 50, Color.MAGENTA));
					x = 9;
					y = y + 62;

				}
				else{
					arrayblocks.add(new Block(x, y, 50, 49, Color.MAGENTA));
					y = y + 60;

				}


			}
			
			x = 668;
			y = 0;
			while (y < 540)
			{
				if (y != 0)
				{
					arrayblocks.add(new Block(x, y + 3, 50, 50, Color.MAGENTA));
					arrayblocks.add(new Block(x + 60, y + 3, 50, 50, Color.MAGENTA));
					x = 668;
					y = y + 62;

				}
				else{
					arrayblocks.add(new Block(x, y, 50, 49, Color.MAGENTA));
					y = y + 60;

				}


			}
			
			
		}

	
	
	public void drawAll( Graphics window )
	{
		for(Block a : arrayblocks)
		{
			a.draw(window);
		
		}
	}
	
	public List<Block> returnList()
	{
		return arrayblocks;
	}

	//add a toString() method  - x , y , width, height, color
	public String toString()
	{
		String output = "";
		return output;
	}

}