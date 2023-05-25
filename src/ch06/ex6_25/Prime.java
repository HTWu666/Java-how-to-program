//application to check a number is prime or not.

/*6.25 (Prime Numbers)A positive integer is prime if it’s divisible by only 1
and itself. For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not.
The number 1, by definition, is not prime
1. Write a application and method that determines whether a number is prime.
2. Use this method in an application that determines and displays all the prime
numbers less than 10,000. How many numbers up to 10,000 do you have to test to
ensure that you’ve found all the primes?
3. Initially, you might think that n/2 is the upper limit for which you must test
to see whether a number n is prime, but you need only go as high as the square root
of n. Rewrite the program, and run it both ways.*/

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
	
	//number mod every number which is less than it step by step
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
	
	//check the number is even or not. If it's even, then it's not prime. If it's not even can be check in the way that take 1 number as interval.
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
	
	/*A positive inter is either a prime or a composite, and it must can be factorized into two natural. 
	One is less than or equal to its root, the other is greater than or equal to its root. These two factor would be a pair*/  
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
