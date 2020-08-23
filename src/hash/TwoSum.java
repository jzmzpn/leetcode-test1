package hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
	}

	public int[] twoSum(int[] nums, int target) {
		if(nums == null || nums.length < 2)
			return null;
		int length = nums.length;
		Map<Integer, Integer> map = new HashMap<>(length);
		map.put(target - nums[0], 0);
		for(int index = 1; index < length; index ++) {
			Integer preIndex = null;
			if((preIndex = map.get(nums[index]))!= null) {
				return new int[]{preIndex, index};
			}
			map.put(target-nums[index], index);
		}
		return null;
    }
}
