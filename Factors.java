import java.util.Scanner;
public class Factors{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter an integer: ");
int number = scan.nextInt();
int factCount = 0;
for(int counter = 1; counter <= number; counter++){
	if(number % counter == 0){
		factCount++;
			}
	
	}

	System.out.print(factCount);
}
}