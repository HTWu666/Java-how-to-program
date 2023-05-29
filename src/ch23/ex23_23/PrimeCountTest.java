package ex23_23;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class PrimeCountTest {
	public static void main(String[] args) {
		PrimeCount primeCounter1 = new PrimeCount(2, 10000);
		PrimeCount primeCounter2 = new PrimeCount(10000, 20000);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(primeCounter1);
		executorService.execute(primeCounter2);
		
		executorService.shutdown();
	}

}
