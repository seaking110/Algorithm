import java.util.*;
class Solution {
        public String solution(String s) {
             StringBuilder sb = new StringBuilder();
            s = s.toLowerCase();
        for (int i=0;i<s.length();i++) {
        	if (i == 0 || s.charAt(i-1) == ' ') {
        		if (s.charAt(i) >= 'a' &&  'z' >= s.charAt(i)) {
        			String first = s.charAt(i)+"";
        			sb.append(first.toUpperCase());
        		} else {
        			sb.append(s.charAt(i));
        		}
        	} else {
        		sb.append(s.charAt(i));
        	}
        }
        
        return sb.toString();
    }
}