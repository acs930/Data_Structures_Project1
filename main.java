// Adam Smith

public class main {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtomicRegion AtRe = new AtomicRegion();
		ContainerRegion CoRe = new ContainerRegion();
		City newCity = new City();
		State newState = new State();
		Country newCount = new Country();
		
		System.out.println("The Atomic Region:");
		System.out.print(AtRe.toString());
		
		
		System.out.println("");
		System.out.println("The Container Region:");
		System.out.print(CoRe.toString());
		
		System.out.println("");
		System.out.println("");
		System.out.println("The City");
		System.out.print(newCity.toString());
		
		System.out.println("");
		System.out.println("");
		System.out.println("The State");
		newState.fillRegionArray();
		
		System.out.println("");
		System.out.print(newState.toString());
		
		
		System.out.println("The Area of the state");
		System.out.print(newState.getArea());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("The Country");
		newCount.fillRegionArray();
		System.out.println(newCount.toString());
		
		

	}

}
