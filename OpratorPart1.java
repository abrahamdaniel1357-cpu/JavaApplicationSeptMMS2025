public class OpratorPart1{
	public static void main(String[] arfs){
		//Assignment Oprator(=)
		int num = 200;
		System.out.printf("The value of num is %d%n ",num);
		
		//Arithmethiv oprators(+,-,/,*,%)
		int num1 = 50;
		int num2 = 100;
		
		int addition = num1 + num2;
		int substrarction = num1 - num2;
		double division =(double) num1/num2;
		int multiplication = num1 * num2;
		int remaider = num1 % num2;
		
		
		
		System.out.printf("%d - %d = %d%n",num1,num2,addition);
		System.out.printf("%d + %d = %d%n",num1,num2,substrarction);
		System.out.printf("%d / %d = %f%n",num1,num2,division);
		System.out.printf("%d x %d = %d%n",num1,num2,multiplication);
		System.out.printf("%d %% %d =%d%n",num1,num2,remaider);
		System.out.println("");
		System.out.println("=================================");
		
		//compound assignments oprators
		
		num1 += num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 /= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 %= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		System.out.println("");
		System.out.println("=================================");
		
		int number1 = 15;
		int number2 = 30;
		
		
		boolean isGreater = number1 > number2;
		boolean isLessThan = number1 < number2;
		boolean isGreaterOrEqualTo = number1 >= number2;
		boolean isLessTHanOrEqualTo = number1 <= number2;
		boolean isEqualTo = number1 == number2;
		boolean isNotEqualTo = number1 != number2;
		
		System.out.printf("is %d > %d: %b%n",number1,number2,isGreater);
		System.out.printf("is %d < %d: %b%n",number1,number2,isLessThan);
		System.out.printf("is %d >= %d: %b%n",number1,number2,isGreaterOrEqualTo);
		System.out.printf("is %d <= %d: %b%n",number1,number2,isLessTHanOrEqualTo);
		System.out.printf("is %d ==%d: %b%n",number1,number2,isEqualTo);
		System.out.printf("is %d != %d: %b%n",number1,number2,isNotEqualTo);
	}
}