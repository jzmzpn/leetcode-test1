package array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int num: candies) {
            max = Math.max(num, max);
        }
        
        for(int num: candies) {
            if(num+extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
