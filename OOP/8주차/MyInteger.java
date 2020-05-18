
public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public boolean isEven(int v) {
		if(v%2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(int v) {
		if(v%2 != 0) 
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int v) {
		int count = 0;
		
		for(int i=2; i<v;i++) {
			if(v%i == 0) {
				count++;
			}
		}
		
		if(count == 0)
			return true;
		else
			return false;
	}
	
	public boolean isEven(MyInteger my) {
		return my.isEven();
	}
	
	public boolean isOdd(MyInteger my) {
		return my.isOdd();
	}
	
	public boolean isPrime(MyInteger my) {
		return my.isPrime();
	}
	
	public boolean equals(int v) {
		if(value == v)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger my) {
		if(my.value == value)
			return true;
		else
			return false;
	}
	
	public static int parseInt(char[] a) {
		int num = a.length;
		int result=0;
		for(int i=0; i<num;i++) {
			result += (a[i]-48)*Math.pow(10,num-1-i);
		}
		
		return result;
	}
	
	public static int parseInt(String str) {
		int num = str.length();
		int result = 0;
		
		for(int i=0;i<num;i++) {
			result += (str.charAt(i) - 48)*Math.pow(10, num-1-i);
		}
		
		return result;
	}
}
