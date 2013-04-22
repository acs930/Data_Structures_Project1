// Adam Smith

import java.util.Scanner;


public class State extends ContainerRegion{
  
	private String govenor;
	
	
	public State()
	{
		super();
		govenor = "No Name";
	}
	public void setGov(String govName)
	{
		govenor = govName;
	}
	
	public String getGov()
	{
		return govenor;
	}
	
	public void fillRegionArray()
	{
		Scanner input = new Scanner(System.in);
		int max = 0;
		System.out.println("How many cities are in the state?");
		max = input.nextInt();
		Region = new Region[max];
		for (int i = 0; i < max; i++)
		{
			Region[i] = new City();
			Region[i].readInput();
			
			
		}
	}
	
	public String toString()
	{
		for(int i = 0; i < Region.length; i++ )
		{
			 System.out.print(Region[i].toString());
		}
		
		return ("\nAnd the govenor is: " + this.getGov());
		
	}
	
	public void readInput()
	{
		super.readInput();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the govenor's name.");
		
	}
	
	public void showRegionArray()
	{
		for (int i = 0; i < 10; i++)
		{
			Region[i].toString();
		}
	}

}
