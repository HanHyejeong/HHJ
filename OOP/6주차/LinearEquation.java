import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		int a, b, c, d, e, f = 0;
		boolean solve;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the a : ");
		a = input.nextInt();
		System.out.print("Enter the b : ");
		b = input.nextInt();
		System.out.print("Enter the c : ");
		c = input.nextInt();
		System.out.print("Enter the d : ");
		d = input.nextInt();
		System.out.print("Enter the e : ");
		e = input.nextInt();
		System.out.print("Enter the f : ");
		f = input.nextInt();
		
		double x, y = 0;
		
		solve = isSolvable(a, b, c, d);
		
		if(solve == false) {
			System.out.print("The equation has no solution.");
		}
		else {
			x = getX(a, b, c, d, e, f);
			y = getY(a, b, c, d, e, f);
		
			System.out.print("x = "+x+", y = "+y);
		}
	}
	
	public static boolean isSolvable(int a, int b, int c, int d) {
		if(a*d - b*c == 0) {
			return false;
		}
		else
			return true;
	}
	
	public static double getX (int a, int b, int c, int d, int e, int f) {
		int xx = 0;
		
		xx = (e*d - b*f)/(a*d - b*c);
			
		return xx;
	}
	
	public static double getY (int a, int b, int c, int d, int e, int f) {
		int yy = 0;
		
		yy = (a*f - e*c)/(a*d - b*c);
			
			return yy;
	}
	
}
