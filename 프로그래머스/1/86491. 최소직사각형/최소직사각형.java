class Solution {
    public int solution(int[][] sizes) {
    	int result = 0;
    	int max = 0;
    	int min = 0;
    	for (int i = 0; i < sizes.length;i ++) {
    		max = Math.max(max, Math.max(sizes[i][0], sizes[i][1]));
    		min = Math.max(min, Math.min(sizes[i][0], sizes[i][1]));
    	}
    	System.out.println(max +" " +min);
    	return max * min;
    }
}