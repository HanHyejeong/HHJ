
public class Practice2 {
	public static void main(String[] args) {
		int num = 0;
		int rev = 0;
		int count;
	
		for(int n = 2 ; ; n++) {
			count = 0;
			
			for(int i=2 ; i< n ; i++) {
				if(n%i == 0) {
					count=1;
					break;
				}
				
			}
		
			
		if(count == 0) {
			rev = isPalindrome(n);
				
			if(rev == n)
				count=1;
			else {
				for(int j = 2; j < rev ; j++) {
					if(rev%j==0)
						count+=1;
				}
			}
		}
		
			if(count==0) {
				System.out.print(n+" ");
				num++;
			
				if((num!=0) && (num%10==0))
					System.out.println();
			
				if(num==120)
					break;
			}
		}
		}
	
	public static int isPalindrome(int number) {
		int reverse = 0;
		
		while(number != 0) {
			reverse = reverse*10 + number % 10;
			number /= 10;
		}
		
		return reverse;
	}
}
