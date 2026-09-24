public class EnhancedForLoop{
	public static void main (String[] args){
		String[] names = {"John","Jack","Mary","James","Lucy",};
		int[] marks = {69,80,100,70,50};
		
		for (int i = 0; i < 5; i++){
			if(marks[i]>=70){
				System.out.printf("Student name: %s%n",names[i]);
				System.out.printf("Student mark: %s%n",marks[i]);
				System.out.print("Greade:A");
				System.out.println("==================\n\n\n");
			}
			else if(marks[i]>=60){
				System.out.printf("Student name: %s%n",names[i]);
				System.out.printf("Student mark: %s%n",marks[i]);
				System.out.print("Greade:B");
				System.out.println("==================\n\n\n");
			}
			else if(marks[i]>=50){
				System.out.printf("Student name: %s%n",names[i]);
				System.out.printf("Student mark: %s%n",marks[i]);
				System.out.print("Greade:C");
				System.out.println("==================\n\n\n");
			}
			else if(marks[i]>=40){
				System.out.printf("Student name: %s%n",names[i]);
				System.out.printf("Student mark: %s%n",marks[i]);
				System.out.print("Greade:D");
				System.out.println("==================\n\n\n");
			}
			else{
				System.out.printf("Student name: %s%n",names[i]);
				System.out.printf("Student mark: %s%n",marks[i]);
				System.out.print("Greade:");
				System.out.println("==================\n\n\n");
			}
		}
	}
}