import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles, gallons, totalMiles = 0, totalGallons = 0;

        System.out.print("Enter miles (-1 to stop): ");
        miles = input.nextInt();

        while (miles != -1) {

            System.out.print("Enter gallons: ");
            gallons = input.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Trip MPG: %.2f%n",
                    (double) miles / gallons);

            System.out.printf("Total MPG: %.2f%n%n",
                    (double) totalMiles / totalGallons);

            System.out.print("Enter miles (-1 to stop): ");
            miles = input.nextInt();
        }
    }
}