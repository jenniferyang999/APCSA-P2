//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      /*window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
	*/
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.CYAN);
      window.fillOval( 300, 150, 20, 20 );
      
      window.setColor(Color.CYAN);
      window.fillOval( 500, 150, 20, 20 );
      
      window.fillArc(400, 300, 200, 20, 0, 180);
      


		//add more code here


   }
}