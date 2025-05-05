import java.util.Scanner;
public class Divide{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter two integers: ");

System.out.println("Enter first integer: ");
int num1 = scan.nextInt();

System.out.println("Enter second integers: ");
int num2 = scan.nextInt();

int quotient;

	if(num2 == 0){
		quotient = 0;
		}else{
			quotient = num1/num2;
			}
	System.out.printf ("The Quotient is %d ", quotient);

}
}