public class PassSingleArraysMethodsForEvenNumber{
	public static int sumTotal(int[] numbers){
		
			int sum = 0;
			for(int i = 0; i< 10; i++){
			if(numbers[i] % 2 ==0){
				totalEven++;
			}
			return sum;
		}
		public static void main(String[] args){
			
			int[] arr= {7,8,4,3,9,0,6,9};
			
			int totalEven = sumTotal(arr);
			
			System.out.printf("Total number is %d%n",totalEven);
		}
	}