package ex23_23;

public class PrimeCount implements Runnable {
	private final int startNum;
	private final int endNum;
	private int primeCount = 0;
	
	public PrimeCount(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	public void run() {
		for(int i = startNum; i <= endNum; i++) {
			if(isPrime(i))
				primeCount++;
		}
		
		System.out.printf("Count done. The number of prime between %d "
				+ "and %d is %d.%n", startNum, endNum, primeCount);
	}
	
	public boolean isPrime(int num) {
	    if (num < 2)
	        return false;
	    else if (num == 2)
	        return true;
	    else if (num % 2 == 0)
	        return false;

	    int root = (int) Math.sqrt(num);

	    for (int i = 3; i <= root; i += 2) {
	        if (num % i == 0)
	            return false;
	    }
	    return true;
	}

}
