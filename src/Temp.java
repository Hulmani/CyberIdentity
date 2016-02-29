import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Temp {

	
	static void printTab()
	{
		System.out.print("				");
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		int x=0,y=0;
		Scanner scan=new Scanner(new File("/Users/manojhulmani/Desktop/dataset.txt"));
		ArrayList<Point2D> points = new ArrayList<Point2D>();
		while(scan.hasNext())
		{
			x=scan.nextInt();
			y=scan.nextInt();


			points.add(new Point2D(x,y));
		}
		
		
		Random randomGenerator = new Random();
		int r1=randomGenerator.nextInt(points.size());
		int r2=randomGenerator.nextInt(points.size());

		
		
		Point2D centroid1=points.get(r1),centroid2=points.get(r2);
		
		ArrayList<Point2D> cluster1 = new ArrayList<Point2D>();
		ArrayList<Point2D> cluster2 = new ArrayList<Point2D>();
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");

		System.out.println("Iteration 1");
		System.out.println("----------------------------------------------");
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}
		
		
		centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 2");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}
		
		
		centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}
		
		centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}
		centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}
		centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}centroid1=Point2D.getCentroid(cluster1);
		centroid2=Point2D.getCentroid(cluster2);
		cluster1.clear();
		cluster2.clear();
		System.out.println("----------------------------------------------");
		System.out.println("Iteration 3");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Centroid1");  printTab();  centroid1.printValue(true); 
		System.out.print("Centroid2");  printTab();  centroid2.printValue(true);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			if(centroid1.getDistance(p)		<	centroid2.getDistance(p))
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid1");
				cluster1.add(p);
			}
			else
			{
				p.printValue(false);	printTab();		System.out.println("--Centroid2");
				cluster2.add(p);
			}
		}	
	}

}
