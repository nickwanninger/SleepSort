

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,7,1,5,3,7,9,3,6,3,7,9,3,7,9};
		for (int i : nums) {
			new SleepSortSlave(i).start();
		}
		
	}
}
