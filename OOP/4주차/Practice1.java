import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("Enter the number : ");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(isPalindrome(num) == true)
			System.out.println("Number is Palindrome");
		else {
			System.out.print("Number is not Palindrome, Reverse Number is "+reverse(num));
		}
		
	}

	public static int reverse(int number) {
		int reverse = 0;
		while(number != 0) {
			reverse = reverse*10 + number % 10;
			number /= 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int origianl = number;
		
		while(number != 0) {
			reverse = reverse*10 + number % 10;
			number /= 10;
		}
		
		if(origianl == reverse)
			return true;
		else
			return false;
	}
	
	
}