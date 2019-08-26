
public class StepsIterative {
	
	public static int countPathsI(int steps) {
		if(steps < 0) {
			return 0;
		}else if (steps <= 1) {
			return 1;
		}
		
		int[] paths = {1, 1, 2};
		
		for(int i = 3; i <= steps; i++) {
			int count = paths[2] + paths[1] + paths[0];
			paths[0] = paths[1];
			paths[1] = paths[2];
			paths[2] = count;
		}
		
		return paths[2];
	}

}
