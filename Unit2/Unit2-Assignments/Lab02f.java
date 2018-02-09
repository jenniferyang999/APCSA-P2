//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		Line a = new Line(1, 9, 14, 2);
		a.setCoordinates(1, 9, 14, 2);
		a.calculateSlope();
		a.print();
		
		Line b = new Line(3, 4, 9, 2);
		b.setCoordinates(3, 4, 9, 2);
		b.calculateSlope();
		b.print();
		
		Line c = new Line(2, 7, 18, 8);
		c.setCoordinates(2, 7, 18, 8);
		c.calculateSlope();
		c.print();
		
		Line d = new Line(4, 3, 5, 6);
		d.setCoordinates(4, 3, 5, 6);
		d.calculateSlope();
		d.print();
		
		Line e = new Line(34, 1, 8, 19);
		e.setCoordinates(34, 1, 8, 19);
		e.calculateSlope();
		e.print();		
	}
}