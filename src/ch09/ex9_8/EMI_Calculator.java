package ex9_8;

import java.util.Scanner;

public class EMI_Calculator {
	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan(1, 1);
		VechicleLoan vechicleLoan = new VechicleLoan(1, 1);
		PersonalLoan personalLoan = new PersonalLoan(1, 1);
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the EMI calculator!\nWhat kind of loan would you like to apply?\n1 - Home Loan\n2 - Vechicle Loan\n3 - Personal Loan\n9 - quit");
		int kindOfLoan = input.nextInt();

		if(kindOfLoan == 1 || kindOfLoan == 2 || kindOfLoan == 3) {
			System.out.println("How much is the principal? ");
			double principal = input.nextInt();

			System.out.println("How long is the tenure in month? ");
			double n = input.nextInt();

			while(kindOfLoan != 9) {
				if(kindOfLoan == 1)
					homeLoan.monthlyInstallmentPayalbe(principal, n);

				else if(kindOfLoan == 2)
					vechicleLoan.monthlyInstallmentPayalbe(principal, n);

				else if(kindOfLoan == 3)
					personalLoan.monthlyInstallmentPayalbe(principal, n);

				else {
					System.out.println("It's not a valid option\nExiting...");
					break;
				}

				System.out.println("What kind of loan would you like to apply?\n1 - Home Loan\n2 - Vechicle Loan\n3 - Personal Loan\n9 - quit");
				kindOfLoan = input.nextInt();
			}
			System.out.println("Exiting...");
		}
		else if(kindOfLoan == 9)
			System.out.println("Exiting...");
		else
			System.out.println("It's not a valid option\nExiting...");
		input.close();
	}

}
