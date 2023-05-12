/*8.11     (Complex Numbers) Create a class called Complex for performing arithmetic with complex
numbers. Complex numbers have the form
realPart  +  imaginaryPart  *  i

where i is
`sqrt(-1)`

Write a program to test your class. Use floating-point variables to represent the private data of  the class.
Provide a constructor that enables an object of this class to be initialized when it’s  declared.
Provide a no-argument constructor with default values in case no initializers are  provided.
Provide public methods that perform the following operations:
a) Add two Complex numbers: The real parts are added together and the imaginary parts are added  together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from the real 
part of the left operand, and the imaginary part of the right operand is sub- tracted from the  imaginary part of the left operand.
c)   Print Complex numbers in the form   (realPart, imaginaryPart).
*/

package ex8_11;

import java.util.Scanner;

public class ComplexTest {
	public static void main(String[] args) {
		Complex complex1 = new Complex();
		Complex complex2 = new Complex();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first complex a: ");
		double realPart1 = input.nextDouble();
		double imaginaryPart1 = input.nextDouble();
		complex1.setRealPart(realPart1);
		complex1.setImaginaryPart(imaginaryPart1);
		
		System.out.println("Please enter the second complex b: ");
		double realPart2 = input.nextDouble();
		double imaginaryPart2 = input.nextDouble();
		complex2.setRealPart(realPart2);
		complex2.setImaginaryPart(imaginaryPart2);
		
		System.out.printf("a = %s%n", complex1);
		System.out.printf("b = %s%n", complex2);
		System.out.printf("a + b = %s%n", Complex.add(complex1, complex2));
		System.out.printf("a - b = %s%n", Complex.subtract(complex1, complex2));
		
		input.close();
	}
}
