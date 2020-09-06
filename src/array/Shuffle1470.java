package array;

public class Shuffle1470 {
	public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        for(int i = 0; i < n; i ++) {
        	res[i * 2] = nums[i];
        	res[i * 2 + 1]= nums[i + n];
        }
        for (int i : res) {
			System.out.println(i);
			
		}
        return res;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		Shuffle1470 s = new Shuffle1470();
		s.shuffle(nums, 3);
	}
}
