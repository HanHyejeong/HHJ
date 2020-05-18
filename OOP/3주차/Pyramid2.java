import java.util.Scanner;

public class Pyramid2 {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("Enter the number of lines : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		int blank = 3*(num-1);
		
		for(int i = 1;i<=num;i++) {
			int number = i;
			
			for(int k=1; k<=blank ; k++)
				System.out.print(" ");
			
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print(number);
				
				if(number < 10)
					System.out.print("  ");
				if(number >= 10)
					System.out.print(" ");
				
				if(j < i)
					number--;
				else
					number++;
			}
			
			System.out.println();
			
			blank = blank - 3;
		}
		
		input.close();
	}
}
