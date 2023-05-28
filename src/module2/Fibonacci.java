package module2;


/**
 * This class is used to generate the nth term of the Fibonacci sequence.
 */
public class Fibonacci {

	/**
     * This method calculates the nth term of the Fibonacci sequence using recursion.
     * 
     * @param n the position in the Fibonacci sequence
     * @return the nth term of the Fibonacci sequence
     */
	 public static int fibonacciRecursive(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	        }
	    }
	 /**
	     * This is the main method which makes use of the fibonacci method.
	     * 
	     * @param args Unused.
	     */
	public static void main(String[] args) {
		int n = 10;
        int nthTerm = fibonacciRecursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}