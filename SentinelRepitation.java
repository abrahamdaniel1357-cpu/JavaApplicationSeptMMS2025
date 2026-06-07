import java.util.Scanner;

public class SentinelRepitation{
	public static void main(string[] args){
		Scanner scan = new Scanner(system .in);
		int num;
		int sum = 0;
		
		System.out.println("enter -1 to end the input");
		
		while(true){
			System.out.print("Enter number: ");
			num = scan.nextInt();
			
		    if(num == -1){
			   break;
		}
		sum += num;
	}
	System.out.printf("The sum of all the number is %d%n",sum);
}