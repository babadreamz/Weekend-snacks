import java.util.Scanner;
public class Factors2Driver{
public static void main(String [] args){

Factors2 factors = new Factors2();

Scanner scan = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = scan.nextInt();

int result = factors.getFactors(number);

System.out.print(result );


}
}