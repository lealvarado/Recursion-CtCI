
public class StepsPureRecursion {
	
	public static int countPaths(int steps) {
		if(steps < 0) {
			return 0; 
		}else if(steps == 0) {
			return 1;
		}
		return countPaths(steps -1 ) + countPaths(steps - 2) + countPaths(steps - 3);
	}

}
