import java.util.Scanner;

public class IntersetingPoint {

	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3, x4, y4 = 0;
		boolean solve;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the x1, y1 : ");
		x1 = input.nextInt();
		y1 = input.nextInt();
		System.out.print("Enter the x2, y2 : ");
		x2 = input.nextInt();
		y2 = input.nextInt();
		
		System.out.print("Enter the x3, y3 : ");
		x3 = input.nextInt();
		y3 = input.nextInt();
		System.out.print("Enter the x4, y4 : ");
		x4 = input.nextInt();
		y4 = input.nextInt();
		
		int a, b, c, d, e, f = 0;
		
		a = y1-y2;
		b = -x1 + x2;
		c = y3 - y4;
		d = -x3 + x4;
		e = (y1 - y2)*x1 - (x1 - x2)*y1;
		f = (y3 - y4)*x3 - (x3 - x4)*y3;
		
		solve = isSolvable(a, b, c, d);
		
		if(solve == false) {
			System.out.print("The equation has no solution.");
		}
		else {
		double x, y = 0;
		
		x = getX(a, b, c, d, e, f);
		y = getY(a, b, c, d, e, f);
		
		System.out.print("The intersecting point is ("+x+", "+y+").");
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
