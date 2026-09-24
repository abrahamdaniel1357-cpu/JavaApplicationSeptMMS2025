//write a java program to collect all the even numbers from the array
public class PassSingleArrayToMethod {

    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        int[] evenArray = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray[index] = numbers[i];
                index++;
            }
        }

        return evenArray;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 3, 2, 9, 0, 1, 6, 8};
        int[] evenNumbers = getEvenNumbers(arr);
        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
    }
}