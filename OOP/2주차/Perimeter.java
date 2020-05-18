import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double per = 0;
		
		System.out.print("Enter three edges (length in double) : ");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		if(a>=b && a>=c) {
			if(a < b+c) {
				per = a+b+c;
				System.out.println("The perimeter is "+per);
			}
			else
				System.out.println("Input is invalid");
		}
		
		if(b>=a && b>=c) {
			if(b < a+c) {
				per = a+b+c;
				System.out.println("The perimeter is "+per);
			}
			else
				System.out.println("Input is invalid");
		}
		
		if(c>=a && c>=b) {
			if(c < a+b) {
				per = a+b+c;
				System.out.println("The perimeter is "+per);
			}
			else
				System.out.println("Input is invalid");
		}

		input.close();
	}
}
