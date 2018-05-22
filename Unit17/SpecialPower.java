import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class SpecialPower 
{
	private List<Ammo> ammo;

	public SpecialPower()
	{
		ammo = new ArrayList<Ammo>();

	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	
	public void drawEmAll( Graphics window, AlienHorde aliens)
	{
		for (int i = 0; i < ammo.size(); i++)
		{
			window.setColor(Color.CYAN);
		   	window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 10, 10);
			window.setColor(Color.CYAN);
		   	window.fillRect(ammo.get(i).getX() + 35, ammo.get(i).getY(), 10, 10);
		   	window.setColor(Color.CYAN);
		   	window.fillRect(ammo.get(i).getX() - 35, ammo.get(i).getY(), 10, 10);
			
		}

	}

	public void moveEmAll()
	{
		for (int i = 0; i < ammo.size(); i++)
		{
			ammo.get(i).move("UP");
		}
	}

	public void cleanEmUp(Graphics window)
	{
		for (int i = 0; i < ammo.size(); i++)
		{
			if(ammo.get(i).getY()< 5)
			{
				ammo.remove(i);
			}	
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
