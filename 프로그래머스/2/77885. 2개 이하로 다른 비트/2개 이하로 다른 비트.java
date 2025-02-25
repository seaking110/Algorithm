import java.util.*;
class Solution {
		public long[] solution(long[] numbers) {
	    long[] answer = new long[numbers.length];
	    for (int i = 0; i < numbers.length; i++) {
	        long n = numbers[i];
	        String str = Long.toBinaryString(n);
	        int lastIndex = -1;
	        for(int j = 0; j < str.length(); j++){
	            if(str.charAt(j) == '0') lastIndex = j;
	        }
	        StringBuilder sb = new StringBuilder();
	       
	        long result = 0;
	        int size = str.length();
	        // 0이 없는 경우 
	        if(lastIndex == -1){
	            result = Long.parseLong("10" + str.substring(1, size),2);
	        }
	        else{
	            // 제일 끝에 있는 경우 
	            if(lastIndex == str.length() - 1){
	                result = Long.parseLong(str.substring(0, size -1) + "1",2);
	            } 
	            // 가운데에 0이 있는 경우 
	            else{
	                result = Long.parseLong(str.substring(0, lastIndex) + "10" + str.substring(lastIndex + 2),2);
	            }
	        }
	        
	        answer[i] = result;
	    }
	    return answer;
	}
}