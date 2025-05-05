import java.util.Scanner;
public class SubtractInt{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter two integers");

System.out.print("num1: ");
int num1 = scan.nextInt();

System.out.print("num2: ");
int num2 = scan.nextInt();

int diff = num1 - num2;

if(diff< 0){
	diff = -1 * diff;
	}
System.out.printf("difference is %d", diff);

}
}