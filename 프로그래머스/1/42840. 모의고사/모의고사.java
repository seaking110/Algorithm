import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
     	int [][] arr = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        ArrayList <Integer> list = new ArrayList<>();
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	for (int j = 0 ; j < answers.length; j++) {
    		if (answers[j] == arr[0][j % arr[0].length]) {
    			count1++;
    		}
    		if (answers[j] == arr[1][j % arr[1].length]) {
    			count2++;
    		}
    		if (answers[j] == arr[2][j % arr[2].length]) {
    			count3++;
    		}
    	}
        int max = Math.max(count1, Math.max(count2, count3));
        if (max == count1) {
        	list.add(1);
        }
        if (max == count2) {
        	list.add(2);
        }
        if (max == count3) {
        	list.add(3);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}