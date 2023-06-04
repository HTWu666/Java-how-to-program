/*EX 9.8
Write a java application that read two values, the principal amount of a loan and the tenure of the loan from the user and calculates the monthy
installment payable for different types of loans and returns the results. Use an inheritance hierarchy to design your application. Creat a super
class Loan that is extended by the subclass HomeLoan, VechicleLoan and PersonalLoan.Each type would have a predefined interest rate. You
application should instantitate each type of subclass after reading the input from the user.*/

package ex9_8;

import java.util.Scanner;

public class EMI_Calculator {
	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan(1, 1);
		VechicleLoan vechicleLoan = new VechicleLoan(1, 1);
		PersonalLoan personalLoan = new PersonalLoan(1, 1);
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the EMI calculator!\n");
		
	        //ask question until user request to quit
		while(true) {
			System.out.println("What kind of loan would you like to apply?\n1 - Home Loan\n2 - Vechicle Loan\n3 - Personal Loan\n9 - quit");
			int kindOfLoan = input.nextInt();
			
			//if user enter a valid number and not a quit number, calculate EMI based on the principal and the period provided by user
			if(kindOfLoan == 1 || kindOfLoan == 2 || kindOfLoan == 3) {
				System.out.print("How much is the principal?\n$");
				double principal = input.nextDouble();
	
				System.out.println("How long is the tenure in month?\n ");
				double n = input.nextDouble();
				
				if(kindOfLoan == 1)
					homeLoan.monthlyInstallmentPayalbe(principal, n);

				else if(kindOfLoan == 2)
					vechicleLoan.monthlyInstallmentPayalbe(principal, n);

				else if(kindOfLoan == 3)
					personalLoan.monthlyInstallmentPayalbe(principal, n);
			}
			
			//quit the application
			else if(kindOfLoan == 9)
				break;
			//If the input is an invalid number
			else
				System.out.println("It's an invalid number, please try again.\n");
		}//end while
		input.close();
	}//end main
}//end class
