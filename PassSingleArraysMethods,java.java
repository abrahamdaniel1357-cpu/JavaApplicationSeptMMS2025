public class PassSingleArraysMethods{
	public static void main(String[] args){
		
		public static int sum(int[] numbers){
			int sum = 0;
			for(int i = 0; i < numbers.length; i++){
				sum += numbers[i];
			}
			return sum;
		}
		public static void main(String[] args){
			
			int[] arr= {2,3,4,4,5,6,7,8,8,9,7};
			
			int totalNumber = sum(arr);
			
			System.out.printf("Total number is %d%n",totalNumber);
		{
	}
}