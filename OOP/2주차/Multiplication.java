//정수 적고 곱하는 프로그램
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		int num=0;
		int result = 1;
		
		System.out.print("Enter an integer between 0 and 1000 : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		int i = num;
		
		while(i!=0) {
			if(i%10 != 0) {
				result *= i%10;
			}
			
			i /= 10;
		}
		
		System.out.println("The multiplication of all digits in "+num+" is "+result);
		input.close();
	}
}
