import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

	
	static void printTab()
	{
		System.out.print("				");
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		int x=0,y=0;
		Scanner scan=new Scanner(new File("src/dataset.txt"));
		ArrayList<Point2D> points = new ArrayList<Point2D>();
		while(scan.hasNext())
		{
			x=scan.nextInt();
			y=scan.nextInt();


			points.add(new Point2D(x,y));
		}
		
	System.out.println("");
	
	Kmeans obj=new Kmeans(2);	//k=2
	obj.getClusters(points,3);  // 3 Iterations
	
	obj=new Kmeans(3);			//k=3
	obj.getClusters(points,3);
	}

}
