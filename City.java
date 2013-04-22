// Adam Smith

import java.util.Scanner;


public class City extends AtomicRegion{

  private String mayorName;
	private int govtMem;  //number of people in the government
	
	public City()
	{
		super();
		mayorName = "No Name";
		govtMem = 0;
	}
	
	public City( String name, int pop, double ar, int numB, String mName, int govMem)
	{
		super(name, pop, ar, numB);
		mayorName = mName;
		govtMem = govMem;
	}
	
	public void setMayorName(String mName)
	{
		mayorName = mName;
	}
	
	public void setGovtMem(int govMem)
	{
		govtMem = govMem;
	}
	
	public String getMayorName()
	{
		return mayorName;
	}
	
	public int getGovtMem()
	{
		return govtMem;
	}
	
	public String toString()
	{
		return super.toString() +
				"\n Mayor's Name: " + getMayorName() +
				".\n Number of Members in Government: " + getGovtMem() + 
				".";
	}
	
	public void readInput()
	{
		
		String userMayor;
		int userGovtNum;
		super.readInput();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Mayor's name.");
		userMayor = input.nextLine();
		mayorName = userMayor;
		
		System.out.println("Please enter the number of members in the government.");
		userGovtNum = input.nextInt();
		govtMem = userGovtNum;
		
		
	}
	
	
}
