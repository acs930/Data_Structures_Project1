// Adam Smith

import java.util.Scanner;


public class AtomicRegion extends Region{

	private int population;
	private double area;
	private int numBusinesses;
	
	public AtomicRegion()
	{
		super();
		population = 0;
		area = 0;
		numBusinesses = 0;
	}
	
	public AtomicRegion(String newName, int pop, double ar, int numB)
	{
		super(newName);
		population = pop;
		area = ar;
		numBusinesses = numB;
		
	}
	
	public void setPop(int newPop)
	{
		population = newPop;
	}
	
	public void setArea(double newArea)
	{
		area = newArea;
	}
	
	public void setNumB(int numB)
	{
		numBusinesses = numB;
	}
	
	
	public int getPop() {		
		return population;
	}

	
	public double getArea() {		
		return area;
	}
	
	public int getNumB()
	{
		return numBusinesses;
	}

	public String toString()
	{
		return super.toString() +
				"\n Population: " + getPop() +
				".\n Area: " + getArea() +
				".\n Number of Businesses: " + getNumB() +
				".";
	}

	public void readInput()
	{
		Scanner input = new Scanner(System.in);
		int userPop;
		double userArea;
		int userNumBusinesses;
		
		System.out.println("Please enter the population.");
		userPop = input.nextInt();
		population = userPop;
		
		System.out.println("Please enter the Area.");
		userArea = input.nextDouble();
		area = userArea;
		
		System.out.println("Please enter the number of businesses in the area.");
		userNumBusinesses = input.nextInt();
		numBusinesses = userNumBusinesses;		
		
	}

	@Override
	public void fillRegionArray() {
		// TODO Auto-generated method stub
		
	}
	
	
}

