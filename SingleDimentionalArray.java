public class SingleDimentionalArray{
	public static void main(String[] args){
	
		int[] number = {2,4,6,8,12,15,18,20,19,30};
		
		System.out.printf("The element at index number 5 is %d%n",number[5]);
		System.out.printf("The element at index number 9 is %d%n",number[9]);
		
		System.out.println("Transvering through the element of the array");
		System.out.println("===========================================");
		for(int i = 0; i < 10; i++){
			System.out.printf("%d%n",number[i]);
		}
	}
}