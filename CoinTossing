import java.util.Scanner;
import java.security.SecureRandom;

public class TossCoin {
	static final SecureRandom random = new SecureRandom();
	private enum Coin {HEADS, TAILS};
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int headCount = 0;
		int tailCount = 0;
		int option = 0;
		
		while(option != 9) {
			System.out.print("1 - Toss Coin\n2 - Display the result\n9 - Quit\n");
			option = input.nextInt();
			
			switch(option) {
			case 1:
				if(flip() == Coin.HEADS)
					headCount++;
				else
					tailCount++;
				break;
			case 2:
				display(headCount, tailCount);
				break;
			case 9:
				break;
			default:
				System.out.println("It's not a valid number. Please try again.\n");
			}

		}
	}
	
	static Coin flip() {
		return random.nextInt(2) == 0? Coin.HEADS: Coin.TAILS;
	}
	
	static void display(int headCount, int tailCount) {
		System.out.printf("%8s%n%s   %s%n%2d  %6d%n%n", "RESULT", "Head", "Tail", headCount, tailCount);
	}

}

