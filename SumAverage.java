import java.util.Scanner;

public class SumAverage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int product = 1;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = input.nextInt();

            sum = sum + num;
            product = product * num;
        }

        double average = sum / 5.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Product = " + product);

        input.close();
    }
}