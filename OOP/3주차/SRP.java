import java.util.Scanner;

public class SRP {
	public static void main(String[] args) {
		int com = (int) (Math.random() * 3);
		int player = 0;
		int com_score = 0;
		int player_score = 0;
		
		while(player_score>=2*com_score || com_score>= 2*player_score){
			if (com == 0)
				System.out.println("Computer is Scissor.");
			else if (com == 1)
				System.out.println("Computer is Rock.");
			else if (com == 2)
				System.out.println("Computer is Paper.");
				
			System.out.print("Scissor (0), Rock(1), Paper(2) : ");
			
			Scanner input = new Scanner(System.in);
			player = input.nextInt();
			
			if(player == com)
				System.out.println("You draw.");
			else if(player == 0 && com == 2) {
				System.out.println("You won.");
				player_score++;
			}
			else if(player == 1 && com == 0) {
				System.out.println("You won.");
				player_score++;
			}
			else if(player == 2 && com == 1) {
				System.out.println("You won.");
				player_score++;
			}
			else {
				System.out.println("You lose.");
				com_score++;
			}
			
			if(com_score == 0 && player_score >= 2) {
				break;}
			else if(player_score == 0 && com_score >= 2) {
				break;}
		}
		
		if(player_score > com_score)
			System.out.println("You won more than two times.");
		else
			System.out.println("You lose less than two times.");
	}
}
