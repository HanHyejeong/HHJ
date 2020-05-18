import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("Enter the number of lines : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		int blank = 2*(num-1);
		
		for(int i = 1;i<=num;i++) {
			int number = i;
			
			for(int k = 0 ; k < blank ; k++)
				System.out.print(" ");
			
			if(num>=10) {
				if(i<10)
					for(int k=1 ; k <= num-9 ; k++)
						System.out.print(" ");
				else if(i>=10)
					for(int k=1 ; k <= num-i ; k++)
						System.out.print(" ");
			}
			
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print(number);
				System.out.print(" ");
				
				if(j < i)
					number--;
				else
					number++;
			}
			
			System.out.println();
			
			blank = blank - 2;
		}
		
		input.close();
	}
}
