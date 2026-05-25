public class OpratorPart2{
	public static void main(String[] args){
		//Logical oprators
		int num1 = 15;
		int num2 = 30;
		int num3 = 18;
		
		boolean andOprator = (num1 > num2) && (num1 > num3);
		System.out.printf("Is (%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,andOprator);
		
		boolean orOprator = (num1 > num2) || (num1 > num3);
		System.out.printf("Is (%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,orOprator);
		
		
		boolean notOprator = !(num1 > num2) || (num1 > num3);
		System.out.printf("Is !(%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,notOprator);
		
		
		// unary oprators(++,--)
	}
}