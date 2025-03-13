
class Solution {
    	public static int zero_count = 0;
	public static int one_count = 0;;
      public int[] solution(int[][] arr) {
        
        int n = arr.length;
        pattern(0,0,n, arr);
        int [] answer = {zero_count, one_count};
        
        return answer;
    }
    public static void pattern(int x, int y, int n, int[][] arr) {
    	int a = arr[x][y];
    	for(int i = x; i < x + n; i++) {
    		for (int j = y; j < y + n; j++) {
    			if (arr[i][j] != a) {
    				n = n / 2;
    	        	pattern(x,y,n, arr);
    	        	pattern(x+n,y,n, arr);
    	        	pattern(x,y+n,n, arr);
    	        	pattern(x+n,y+n,n, arr);
    	        	return;
    			}
    		}
    	}
    	if (a == 1) {
    		one_count++;
    	} else {
    		zero_count++;
    	}
    }
}