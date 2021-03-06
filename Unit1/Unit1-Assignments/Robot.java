//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.RED);
      window.drawString("Robot LAB ", 35, 35 );
      
      Robot.head(window);
      Robot.upperBody(window);
      Robot.lowerBody(window);
      

      //call head methods
      //call other methods
   }

   public static void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillRect(250, 100, 310, 300);
      
      window.setColor(Color.CYAN);
      window.fillOval( 300, 150, 20, 20 );
      
      window.setColor(Color.CYAN);
      window.fillOval( 500, 150, 20, 20 );
      
      window.fillArc(310, 230, 200, 20, 0, 180);

   }

   public static void upperBody( Graphics window )
   {
	   window.setColor(Color.GREEN);
	   window.fillRect(200, 300, 400, 450);
	   window.setColor(Color.ORANGE);
	   window.drawLine(200, 300, 100, 200);
	   window.drawLine(600, 300, 700, 200);
	   window.setColor(Color.MAGENTA);
	   int xPoints[] = {250,270,400,530,550};
	   int yPoints[] = {650,520,425,520,650};
	   int nPoints = 5;
	   window.fillPolygon(xPoints, yPoints, nPoints);
	   window.setColor(Color.WHITE);
	   window.drawString("CCA !", 390, 500);
   }

   public static void lowerBody( Graphics window ){
	 
	   window.setColor(Color.BLUE);
	   window.fillRect(150, 700, 50, 200);
	   window.fillRect(600, 700, 50, 200);
   }
}