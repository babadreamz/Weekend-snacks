import java.util.Scanner;
public class IsSquareDriver{
public static void main(String [] args){

IsSquare2 driver= new IsSquare2();

Scanner scan = new Scanner(System.in);

System.out.println("Enter an integer: ");
int num = scan.nextInt();

boolean result = driver.isSquare(num);
System.out.print(result);

}
}