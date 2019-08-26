
public class Fibonacci {
	
	//Top Down Dynamic Programming 
	
	int fibonacci(int n) {
		return fibonacci(n, new int[n+1]);
	}
	
	int fibonacci(int i, int[] memo) {
		if(i == 0 || i == 1) {
			return i;
		}
		
		if(memo[i] == 0) {
			memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
		}
		return memo[i];
	}
	
	//Bottom Up Dynamic Programming 
	// 1.Compute fib(1) and fib(0)
	// 2. Use those to compute fib(2)
	// 3. Compute previous answers to compute fib(3), fib(4), etc.
	
	int fibonacciBU(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1){
			return 1;
		}
		
		int[] memo = new int[n];
		memo[0] = 0;
		memo[1] = 1;
		
		for(int i = 2; i < n; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		return memo[n - 1] + memo[n - 2];
	}
	
	// OR
	
	int fibonacciALT(int n) {
		if(n == 0) {
			return 0;
		}
		
		int a = 0; 
		int b = 1; 
		
		for(int i = 2; i < n; i++) {
			int c = a + b; 
			a = b; 
			b = c;
		}
		
		return a + b;
	}
	
	

}
