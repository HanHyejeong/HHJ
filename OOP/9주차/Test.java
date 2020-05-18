public class Test {
	public static void main(String[] args) {
		Account acc = new Account(1122, 1000.0, "George");
		acc.setAnnualInterestRate(1.6);
		
		acc.deposit(30.0);
		acc.deposit(40);
		acc.deposit(50);
		
		acc.withdraw(5);
		acc.withdraw(4);
		acc.withdraw(2);
		
		System.out.println("Name : "+acc.getName());
		System.out.println("Annual interest rate : "+acc.getAnnualInterestRate());
		System.out.println("Balance : "+acc.getBalance());
		System.out.println("Date     	                  Type         Amount        Balance");
		
		for (int i = 0; i < acc.getTransaction().size(); i++) {
			System.out.print((acc.getTransaction()).get(i).getDate()+"      ");
			System.out.print((acc.getTransaction()).get(i).getType()+"            ");
			System.out.print((acc.getTransaction()).get(i).getAmount()+"          ");
			
			if(i>2)
				System.out.print(" ");
			
			System.out.print((acc.getTransaction()).get(i).getBalance());
			
			System.out.println();
		}
	}
}
