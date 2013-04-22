// Adam Smith

import java.util.Scanner;


public class Country extends ContainerRegion{

  private int wealth;
	private String nameCo;
	
	public void setWealth(int amountWealth)
	{
		wealth = amountWealth;
	}
	
	public int getWealth()
	{
		return wealth;
	}
	public void setName(String newName)
	{
		nameCo = newName;
	}
	
	public String getName()
	{
		return nameCo;
	}
	
	public void readInput()
	{
		int userWealth;
		String userNameCo;
		super.readInput();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how wealthy the country is.");
		userWealth = input.nextInt();
		wealth = userWealth;
		System.out.println("Please enter the name of the country.");
		userNameCo = input.nextLine();
		nameCo = userNameCo;
		
		
	}
	public void fillRegionArray()
	{
		Scanner input = new Scanner(System.in);
		int max = 0;
		System.out.println("How many states are in the country?");
		max = input.nextInt();
		Region = new Region[max];
		for (int i = 0; i < max; i++)
		{
			Region[i] = new State();
			Region[i].fillRegionArray();
			
		}	

	}
	
	public void showRegionArray()
	{
		for (int i = 0; i < Region.length; i++)
		{
			Region[i].toString();
		}
	}
	
	public String toString()
	{
		for(int i = 0; i < Region.length; i++ )
		{
			 System.out.print(Region[i].toString());
		}
		
		return ("\nCountry's wealth: " + getWealth() +
				"\nCountry Name:" + getName());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country merica = new Country();
		
		merica.fillRegionArray();	
		
		
	}
	
	
	
	//make the read input methods
	//make it user friendly
	//test

}
