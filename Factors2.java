public class Factors2{
public int getFactors(int number){
	int factCount = 0;
	for(int counter = 1; counter<= number; counter++){
		if(number % counter == 0){
			factCount++;
			}
			}	
	return factCount;
	}	
}
