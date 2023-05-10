import java.util.Scanner;

public class Prime_ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		input.close();
		
		System.out.println(isPrime1(num) == true? "is prime": "not prime");
		System.out.println(isPrime2(num) == true? "is prime": "not prime");
		System.out.println(isPrime3(num) == true? "is prime": "not prime");
	}
	
	static boolean isPrime1(int num) {
		if(num < 2)
			return false;
		else {
			for(int i = 2; i < num; i++) {
				if (num % i == 0 && num > 2)
					return false;
			}
		}
		return true;
	}
	static boolean isPrime2(int num) {
		if(num < 2)
			return false;
		if(num % 2 == 0 && num > 2)
			return false;
		for(int i = 3; i < num; i += 2) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	static boolean isPrime3(int num) {
		if(num < 2)
			return false;
		if(num % 2 == 0 && num > 2)
			return false;
		
		int root = (int)Math.sqrt(num);
		
		for(int i = 2; i < root; i++) {
			if(num % root == 0)
				return false;
		}
		return true;
	}

}
