import java.util.Scanner;

public class UserInput{
	public static void main(String [] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.printf("Enter your gender: ");
		String gender = input.next();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter the number of student in ur class: ");
		short numberOfStudent = input.nextShort();
		
		System.out.print("Enter the number of student in ur school: ");
		int totalNumberOfStudentOfStudent = input.nextInt();
		
		System.out.print("Enter your grade: ");
		char grade = input.next().charAt(1);
		
		System.out.print("Do you love learning Java: ");
		boolean loveJava = input.next().nextBoolean();
		
		System.out.println("");
		System.out.printf("information about  %s%n",name);
		System.out.println("----------------------------------------");
		
		
		System.out.printf("Hello %s,You are welcom to NIIT",name);
		System.out.printf("You are a %s and you are %d years old",gender,age);
		System.out.printf("There are %d student in your class%n",numberOfStudent);
		System.out.printf("The total number of student is %,d%n",totalNumberOfStudent);
		System.out.printf("Your grade is %c%n",grade);
		System.out.printf("Do you love Java %b%n",loveJava);
	}
}