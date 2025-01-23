class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
               
 
        	int [][] answer = new int[arr1.length][arr2[0].length];
        	for (int i = 0; i < arr1.length; i++) {
        		for (int j = 0; j < arr2[0].length; j++) {
        			int sum = 0;
        			for (int l = 0; l < arr1[0].length; l++) {
        				sum += arr1[i][l] * arr2[l][j];
        			}
        			answer[i][j] = sum;
        		}
        	}
        	return answer;
        
    }
}