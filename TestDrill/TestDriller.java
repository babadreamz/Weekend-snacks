public class TestDriller{

	int pricePerCopy;
	public int price(int copies){
	if(copies < 1){
		System.out.println("Enter a valid number of copies");
		}else{
			if(copies >= 1 && copies <= 4){
				pricePerCopy = copies * 2000;
				return pricePerCopy;		
			}else if(copies >= 5 && copies <= 9){
				pricePerCopy = copies * 1800;
				return pricePerCopy;
			}else if(copies >= 10 && copies <= 29){
				pricePerCopy = copies * 1600;
				return pricePerCopy;
			}else if(copies >= 30 && copies <= 49){
				pricePerCopy = copies * 1500;
				return pricePerCopy;
			}else if(copies >= 50 && copies<= 99){
				pricePerCopy = copies * 1300;
				return pricePerCopy;
			}else if(copies >= 100 && copies <= 199){
				pricePerCopy = copies * 1200;
				return pricePerCopy;
			}else if(copies >= 200 && copies <= 499){
				pricePerCopy = copies * 1100;
				return pricePerCopy;
			}else{
				pricePerCopy = copies * 1000;
				return pricePerCopy;
			}	
			
			
			}
		return pricePerCopy;
	}




}