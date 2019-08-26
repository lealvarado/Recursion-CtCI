
public class StepsMonetization {
	
	public static int countPathsMemo(int steps) {
		return countPathsMemo(steps, new int[steps + 1]);
	}
	
	public static int countPathsMemo(int steps, int[] memo) {
		
		if(steps < 0) {
			return 0;
		}else if(steps == 0) {
			return 1;
		}
		
		if(memo[steps] == 0) {
			memo[steps] = countPathsMemo(steps - 1, memo) + countPathsMemo(steps - 2, memo) + countPathsMemo(steps - 3, memo);
		}
		
		return memo[steps];
	}

}
