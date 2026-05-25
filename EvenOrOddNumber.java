import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = (number % 2 == 0) 
                ? "The number is even." 
                : "The number is odd.";

        System.out.println(result);

        input.close();
    }
}