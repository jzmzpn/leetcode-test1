package array;

public class NumIdenticalPairs1512 {
	public int numIdenticalPairs(int[] nums) {
		int[] map = new int[100];
        int count = 0; 
        for (int i=0;i<nums.length;i++){
            if (map[nums[i]-1]>0){
                count += map[nums[i]-1]++;
            } else {
            	map[nums[i]-1]++;
            }
        }
        return count;
    }
}
