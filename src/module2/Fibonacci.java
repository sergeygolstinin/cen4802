package module2;

public class Fibonacci {

	 public static int fibonacciRecursive(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	        }
	    }

	public static void main(String[] args) {
		int n = 10;
        int nthTerm = fibonacciRecursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}