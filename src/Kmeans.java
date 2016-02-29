import java.util.ArrayList;
import java.util.Random;


public class Kmeans {
	
	ArrayList<ArrayList<Point2D>> clusters;
	ArrayList<Point2D> centroids;
	ArrayList<Integer> randoms;
	int k;
	
	public Kmeans(int k)
	{
		clusters=new ArrayList<ArrayList<Point2D>>();
		for(int i=0;i<k;i++)
		{
			ArrayList<Point2D> p=new ArrayList<Point2D>();	
			clusters.add(p);
		}
		centroids=new ArrayList<Point2D>();
		this.k=k; 
	}
	
	
	static void printTab()
	{
		System.out.print("				");
	}
	
	ArrayList<ArrayList<Point2D>> assignToCluster(ArrayList<Point2D> points)
	{
		 System.out.println("Centroids");

		for(int i=0;i<clusters.size();i++)
		{
			 ArrayList<Point2D> data=clusters.get(i);			// set new centroid from each cluster
			
				Point2D centroid=Point2D.getCentroid(data);
				centroid.printValue();
				clusters.get(i).clear();			// clear data points 
			   centroids.set(i,centroid);
			 					
		}
		System.out.println("----------***-----------");
			for(int j=0;j<points.size();j++)				//add points to new clusters
			{
				Point2D p=points.get(j);
				int c=getClosestPoint(p);
				
				clusters.get(c).add(p);
				centroids.set(c,Point2D.getCentroid(clusters.get(c)));
			}
		
		
		return clusters;
	}
	
	void generateRandomCentroids(ArrayList<Point2D> points)
	{
		Point2D random=Point2D.getRandomPoint(points);
		
		System.out.println("Centroids");
		System.out.println("------------------------");
		random.printValue();
		centroids.add(random);
		
		for(int i=1;i<k;)
		{
			Point2D r=Point2D.getRandomPoint(points);
			if(!random.isEqual(r))
			{
				r.printValue();
				centroids.add(r);
				random=r;
			
				i++;
			}
		}
		System.out.println("------------------------");
		
	}
	
	ArrayList<ArrayList<Point2D>> assignToCluster(ArrayList<Point2D> points,boolean random)
	{
		
		generateRandomCentroids(points);
		
		
		for(int i=0;i<points.size();i++)
		{
			Point2D p=points.get(i);
			int c=getClosestPoint(p);
			
			clusters.get(c).add(p);
			centroids.set(c,Point2D.getCentroid(clusters.get(c)));  //recalculate centroid
		}
		
		
		
		
		return clusters;
	}
	
	
	
	int getClosestPoint(Point2D p)
	{
		int minIndex=0;
		Point2D c= centroids.get(0);
		int min=p.getDistance(c);
		
		for(int i=1;i<centroids.size();i++)
		{
			int cur=p.getDistance(centroids.get(i));
			if( cur<min)
			{
				min=cur;
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	
	void printClusterData()
	{
		for(int i=0;i<k;i++)
		{
			System.out.println("Cluster "+(i+1)+" "+clusters.get(i).size());
			System.out.println("------------------------");
			for(Point2D point: clusters.get(i))
			{
				point.printValue();
			}
		}
	}
	
	public  ArrayList<ArrayList<Point2D>> getClusters(ArrayList<Point2D> points, int iterations) {
		
		System.out.println("Iteration 1");
		System.out.println("------------------------");
		clusters=assignToCluster(points,true);  //first time random allotment of centroids
		printClusterData();
		System.out.println("-----------***----------");
		
		for(int i=1;i<iterations;i++)
		{
			System.out.println("Iteration "+(i+1));
			System.out.println("------------------------");
			clusters=assignToCluster(points);
			printClusterData();
			System.out.println("-----------***----------");
		}
		return clusters;
	}

	
	public int getK() {
		return k;
	}



}
