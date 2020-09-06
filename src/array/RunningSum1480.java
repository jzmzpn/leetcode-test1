package array;

public class RunningSum1480 {
	public int[] runningSum(int[] nums) {
		if(nums == null || nums.length == 0) return nums;
		for (int idx = 1; idx < nums.length; idx ++) {
			nums[idx] = nums[idx] + nums[idx - 1];
		}
		return nums;
    }
}
