/*8.9 Write code that generates n random numbers in the range 10–100. [Note: Only import
the Scanner and SecureRandom classes.]*/

package ex8_9;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumber = new SecureRandom();
		
		System.out.print("How many random numbers in the range 10 - 100 do you want to generate? ");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(randomNumber.nextInt(91) + 10);
		}
	}

}
