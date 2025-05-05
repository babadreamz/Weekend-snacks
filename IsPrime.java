import java.util.Scanner;
public class IsPrime{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter an integer");
int number = scan.nextInt();
boolean isPrime = true;
	
	if(number<2){
		System.out.print(!isPrime);
		}else{
		for(int count = 2; count <= Math.sqrt(number); count++){
			if(number % count == 0){
				isPrime = false;
				break;
				}	
			}
		}
	System.out.println(isPrime);
	
}
}