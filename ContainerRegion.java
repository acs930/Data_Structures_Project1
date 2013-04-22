// Adam Smith

public class ContainerRegion extends Region{


  
	Region[] Region;
	
	
	public int getPop() {
		
		int totPop = 0;
		
		for(int i = 0; i < Region.length; i++)
		{
				
			totPop = totPop + Region[i].getPop();
		}
		
		return totPop;
	}

	
	public double getArea() {
	
		double totArea = 0;
		
		for(int i = 0; i < Region.length; i++)
		{
				
			totArea = totArea + Region[i].getArea();
		}
		
		return totArea;
		
	}


	@Override
	public void fillRegionArray() {
		// TODO Auto-generated method stub
		
	}

}


