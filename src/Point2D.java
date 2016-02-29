import java.util.ArrayList;
import java.util.Random;


public class Point2D {

	int x;
	int y;

	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printValue(boolean space)
	{
					System.out.print(this.x+","+this.y);
	}
	
	public void printValue()
	{
					System.out.println(this.x+","+this.y);
	}

	public int getDistance(Point2D p)
	{
		return (int) ((int)Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
	}


	public boolean isEqual(Point2D p)
	{
		if(x==p.x  && y==p.y)
			return true;
		else
			return false;
	}
	public static Point2D getRandomPoint(ArrayList<Point2D> points)
	{
		Random randomGenerator = new Random();
		int r1=randomGenerator.nextInt(points.size());
//		int r2=randomGenerator.nextInt(45);
//
//		while(r1<r2)
//		{
//			r2=randomGenerator.nextInt(points.size());
//		}
//
//		Point2D random=new Point2D(r1,r2);
		return points.get(r1);
	}
	public static Point2D getCentroid(ArrayList<Point2D> points)
	{

		int x=0;
		int y=0;
		int s=points.size();
		for(int i=0;i<s;i++)
		{
			x+=points.get(i).x;
			y+=points.get(i).y;
		}
		if(s>0)
		{
		x=x/s;
		y=y/s;
		return new Point2D(x,y);
		}
		else
			{
			return getRandomPoint(points);
			}
		
	}
}
