package ex8_11;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		realPart = 0;
		imaginaryPart = 0;
	}
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public double getRealPart() {
		return realPart;
	}
	
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public static Complex add(Complex complexNumber1, Complex complexNumber2) {
		return new Complex(complexNumber1.getRealPart() + complexNumber2.getRealPart(), 
				complexNumber1.getImaginaryPart() + complexNumber2.getImaginaryPart());
	}
	
	public static Complex subtract(Complex complexNumber1, Complex complexNumber2) {
		return new Complex(complexNumber1.getRealPart() - complexNumber2.getRealPart(), 
				complexNumber1.getImaginaryPart() - complexNumber2.getImaginaryPart());
	}
	
	public String toString() {
		return String.format("(%.1f, %.1f)", getRealPart(), getImaginaryPart());
	}
}
