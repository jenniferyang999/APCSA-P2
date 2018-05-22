//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private JLabel lossMsg;
	private JPanel panel;
	private Image img;

	private List<Alien> aliens;
	private int size, counter = 0, speed = 1;

	public AlienHorde(int s)
	{
		size = s;
		aliens = new ArrayList<Alien>();
		int x = 0, y = -270;
		for(int i = 0; i < size; i++)
		{
			aliens.add(new Alien(x, y, 25, 25, speed));
			x = x + 30;
			if(x > 500)
			{
				x = 20;
				y = y + 50;
			}
		}
		
		try
		{
			img = ImageIO.read(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Error: no lose image.");
		}
		
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien a : aliens)
		{
			a.draw(window);
		
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++){
			if(aliens.get(i).getSpeed()==0){
				aliens.get(i).setY(-100);
			}
			if(aliens.get(i).getX() > 810){
				aliens.get(i).setPos(760,aliens.get(i).getY() + 40);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			}
			else if(aliens.get(i).getX() < 3){
				aliens.get(i).setX(5);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			}
			else{
			aliens.get(i).move("RIGHT");
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots, Graphics window)
	{
		
		for(int i = 0; i < shots.size(); i++)
		{
			for(int j = 0; j < aliens.size(); j++)
			{
				if((shots.get(i).getX() >= aliens.get(j).getX() - 3) && (shots.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth() + 3))
				{
					if((shots.get(i).getY()>=aliens.get(j).getY() - 3) && (shots.get(i).getY() <= aliens.get(j).getY()+aliens.get(j).getHeight() + 3)) 
					{
						aliens.get(j).setSpeed(0);
						aliens.remove(j);
						counter++;
						shots.get(i).setSpeed(0);
						shots.remove(i);
					}
				}
			}
		}
		
		
	}
	
	public boolean endGame(Ship ship, Graphics window)
	{
		//lossMsg.setVisible(false);

		for(int i = aliens.size() - 1; i >= 0; i--){
			if(aliens.get(i).getY() > 500)
			{
				ship.setSpeed(0);
				window.drawImage(img, 200, 200, 800, 600, null);
				
				for(int j = aliens.size() - 1; j >= 0; j--){
					aliens.get(j).setSpeed(0);
					aliens.remove(j);
				}
				return true;
			}

		}
		return false;

		
	}
	

	public List<Alien> getList()
	{
		return aliens;
	}
	
	public void setValue()
	{
		counter = 0;
	}
	
	public int getValue()
	{
		return counter;
	}

	public String toString()
	{
		return "";
	}
}
