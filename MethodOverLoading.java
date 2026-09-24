import java.util.scanner;

public class MethodOverLoading{
	public static void main(String{} args){
		Scanner scan = new SCanner(System.in);
		
		System.out.println("======Calculate perimeter of shape=======");
		System.out.println("Enter.for Squre");
		System.out.println("Enter.for.Rectangle");
		System.out.println("Enter.for.Triangle");
		System.out.println("Enter.for.paralelogram");
		
		int choice = scan.nextint();
		switch(choice){
			case 1:
					System.out.print("Enter the length of the squre: ");
					int lenOfRect = scan.nextint();
					
					perimeterOfSquare(lenOfSqure);
			break;
					
					
			case 2:
					System.out.print("Enter the width of the Rectangle: ");
					int lenOfRect = scan.nextint();			
		}
		
	}
	
	public static void perimeter(int lenOfSqure){
		perimeterOfSquare = 4 * lenOfSqure;
		System.out.printf("The perimeter of the squre is %d%n",perimeterOfSquare);
	}
	public static void perimeter(int lenOfRect, int lenOfWidth){
		perimeterOfRect = 2 * (lenOfRect + widthOfRect);
		System.out.printf("The perimeter of the Rectangle is %d%n",perimeterOfRect);
	}
	
	public static void perimeter(int sideA,int sideB,int sideC){
		perimeterOfSquareTriangle = sideA + sideB + sideC;
		System.out.printf("The perimeter of the Triangle is %d%n",perimeterOfTriangle);
	}
}