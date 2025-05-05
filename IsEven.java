import java.util.Scanner;
public class IsEven{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter a valid integer");
int number = scan.nextInt();

boolean isEven = true;
	if(number % 2 == 0){
		System.out.print(isEven);
		}else{
			System.out.print(!isEven);
			}


}
}