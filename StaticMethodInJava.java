public class StaticMethodInJava{
	//method here
	public static void main(String [] args){
		
		int sum = add(70,50,80);
		
		System.out.printf("The sum of all the number is %d%n",sum);
		
		sum = add(90,40,30);
		System.out.printf("The sum of all the number is %d%n",sum);
		details(20,"kate henry");
	}
	public static int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static void details(int age, String name ){
		System.out.printf("your name is %s%n",name);
		System.out.printf("you are %d years old%n",age);
	}
}