import java.util.Scanner;
public class IsSquare{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = scan.nextInt();
boolean isSquare = true;

if(number < 0){
	System.out.print(!isSquare);
	}
int sqroot = (int) Math.sqrt(number);
int square = sqroot * sqroot;
if(number == square){
	System.out.print(isSquare);
	}else{System.out.print(!isSquare);}

}
}