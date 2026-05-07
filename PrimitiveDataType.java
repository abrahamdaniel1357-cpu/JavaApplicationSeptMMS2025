public class PrimitiveDataType{
	public static void main(String[] args){
		byte myAge = 30;
		System.out.printf("Miss mercy is %d years old%n",myAge);
		
		short quantity = 20000;
		System.out.printf("The quantity of iphone orderd is %,d%n",quantity);
		
		int nigeriaPopulation = 294848848;
		System.out.printf("The population of Nigeria is %,d%n",nigeriaPopulation);
		
		long worldPopulation = 64838747848448L;
		System.out.printf("The world population is %,d%n",worldPopulation);
		
		float price = 18384.75647F;
		System.out.printf("The price of each iphone per unite is %,.2f%n",price);
		
		double myBalance = 16345476646.766479;
		System.out.printf("My account balance is %c%,.2f",'$',myBalance);
		
		char symbol = '%';
		System.out.printf("There is an increment in the world's population by 20.5%c%n",symbol);
		
		boolean isJavaFun = true;
		System.out.printf("Do you love Java? %b",isJavaFun);
	}
	
}