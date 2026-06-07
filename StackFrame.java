public class StackFrame{
	public static void main(String[] args){
		readMe("The story is about a little girl who left her home and was lost in a park");
		
	}
	public static void readMe(String story){
		System.out.println("====story===="){
		System.out.println("%s%n",story);
		
		CheckAge(20);
	}
	
	public static void CheckAge(int age){
		if (age >=18){
			System.out.printf("your age is %d, you're an adult%n",age);
		}
		else{
			System.out.printf("yuor age is %d, you're still a minor%n",age);
		}
	}
}