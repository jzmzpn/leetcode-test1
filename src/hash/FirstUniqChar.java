package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstUniqChar {
	public int firstUniqChar_1(String s) {
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		int length = charArray.length;
		
		for(int index = 0; index < length; index ++) {
			if(s.indexOf(charArray[index]) == s.lastIndexOf(charArray[index])) {
				return index;
			}
		}
		return -1;
    }
	
	public int firstUniqChar_2(String s) {
		if(s.length() == 0) return -1;
		char[] charArray = s.toCharArray();
		
		int length = charArray.length;
		Map<Character, Integer> map = new HashMap<>(length);
		List<Integer> cSet = new ArrayList<>(length);
		for(int index = 0; index < length; index ++) {
			char key = charArray[index];
			Integer integer = map.get(key);
			if(integer == null) {
				map.put(key, index);
				cSet.add(index);
			} else {
				cSet.remove(integer);
			}
		}
		cSet.add(-1);
		return cSet.get(0);
    }
	
	public int firstUniqChar(String s) {
		
		int index =-1;
        for(int i='a';i<='z';i++){
            int tmpIndex = s.indexOf(i);
            if(tmpIndex>=0 && tmpIndex==s.lastIndexOf(i)
                    && (index== -1 || index>tmpIndex)){
                index=tmpIndex;
            }
        }
        return index;
	}
	
	public static void main(String[] args) {
		FirstUniqChar f =  new FirstUniqChar();
		System.out.println(f.firstUniqChar("leetcode"));
	}
}
