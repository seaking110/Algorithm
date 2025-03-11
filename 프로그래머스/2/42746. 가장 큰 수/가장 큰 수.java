import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String [] arr = new String[numbers.length];
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        	arr[i] = numbers[i]+"";
        }
        if (max == 0) {
            return "0";
        }
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); 
        for (int i = 0; i < numbers.length; i++) {
        	sb.append(arr[i]);
        }
        return sb.toString();
    }
}