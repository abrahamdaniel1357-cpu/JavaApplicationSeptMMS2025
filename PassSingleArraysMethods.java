public class PassSingleArraysMethods{
	public static int sumTotal(int[] numbers){
		
			int sum = 0;
			for(int i = 0; i < numbers.length; i++){
				sum += numbers[i];
			}
			return sum;
		}
		public static void main(String[] args){
			
			int[] arr= {7,8,4,3,9,0,6,9};
			
			int totalNumber = sumTotal(arr);
			
			System.out.printf("Total number is %d%n",totalNumber);
		}
	}