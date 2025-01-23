class Solution {
    public int[] solution(int n, long left, long right) {
        int [] answer = new int [(int)(right - left + 1)];
        int index = 0;
        int startY = (int)(left / n);
        int startX = (int)(left % n);
        int endY = (int) (right / n);
        int endX = (int) (right % n);
        for (long i = startY; i <= endY; i++) {
        	for (long j = 0; j < n; j++) {
        		if (i == startY && j < startX) {}
        		else if (i == endY && j > endX) {
        			break;
        		}
        		else {
        			answer[index] = (int) Math.max(i+1, j+1); 
        			index++;
        		}
        	}	
        }
        return answer;
    }
}