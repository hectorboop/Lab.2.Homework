package lab2homework;

public class Driver {

	public static void main(String[] args) {
		IterationMathLib iterationLibrary = new IterationMathLib();
		
		RecursiveMathLib recursionLibrary = new RecursiveMathLib();
		
		System.out.println("===RECURSION===");
		runTestCode(recursionLibrary);
		
		System.out.println("===ITERATION===");
		runTestCode(iterationLibrary);

	}
	
	public static void runTestCode(MathLib library) {
		System.out.println("GCD(16, 14) = " + library.gcd(16, 14));
		System.out.println("ACK(2, 4) = " + library.ack(2, 4));
		System.out.println("FIB(16) = " + library.fib(16));
		System.out.println("HANOI(14) = " + library.hanoi(14));
	}

}

