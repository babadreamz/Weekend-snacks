import java.util.Scanner;
public class TestDrillerTest{
public static void main(String [] args){
	
	TestDriller testDriller = new TestDriller();	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of copies you need: ");
	int copies = scan.nextInt();
	
	int pricePerCopy = testDriller.price(copies);
	if(copies == 1){
		System.out.println("The price for " + copies + " copy is N" + pricePerCopy);
	}else if(copies > 1){
		System.out.println("The price for " + copies + " number of copies is N" + pricePerCopy);
}	
	

}
}