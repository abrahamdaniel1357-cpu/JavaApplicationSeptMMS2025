import java.util.scanner;

public class EvenOrOddCheaker{
	public static void main(String[] args){
		scanner scan = new Scanner(System.in);
		char option;
		
		do{
			System.out.println("Enter a number: ");
			int num = scan.nextint();
			
			if(num % 2 == 0){
				System.out.println("The number is an even number");
			}
			else{
				System.out.println("The number is an odd number");
			}
			
			System.out.print("Do u want to run the program again(Y/N):");
			option = scan.next().charAt(0);
		}while(option == 'Y' || option == 'y');
		System.out.println("Good bye............");
	}
}