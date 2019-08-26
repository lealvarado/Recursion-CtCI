
public class StepsDynamicProgramming {
	
	public static int countPathsDP(int steps) {
		if(steps < 0) {
			return 0;
		}else if(steps <= 1) {
			return 1;
		}
		
		int[] paths = new int[steps + 1];
		paths[0] = 1;
		paths[1] = 1; 
		paths[2] = 2;
		
		for(int i = 3; i <= steps; i++) {
			paths[i] = paths[i - 1] + paths[i - 2] + paths[i - 3];
		}
		
		return paths[steps];
	}

}
