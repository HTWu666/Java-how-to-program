package ex9_8;

public class Loan {
	private double principal;
	private double tenure;
	double rate;
	
	public Loan(double principal, double tenure, double rate) {
		if(principal < 0)
			throw new IllegalArgumentException("principal can't be negative");
		if(tenure <= 0)
			throw new IllegalArgumentException("tenure must be greater than");
		if(rate <= 0)
			throw new IllegalArgumentException("rate must be greater than 0");
		
		this.principal = principal;
		this.tenure = tenure;
		this.rate = rate;
	}
	
	public void monthlyInstallmentPayalbe(double principal, double tenure) {
		double r = rate / (12 * 100);
		double n = tenure;
		System.out.printf("EMI is: $%.2f%n%n", (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));
	}
}

class HomeLoan extends Loan{
	public HomeLoan(double principal, double tenure) {
		super(principal, tenure, 2.06);
	}
}

class VechicleLoan extends Loan{
	public VechicleLoan(double principal, double tenure) {
		super(principal, tenure, 4.3);
	}
}

class PersonalLoan extends Loan{
	public PersonalLoan(double principal, double tenure) {
		super(principal, tenure, 3.91);
	}
}
