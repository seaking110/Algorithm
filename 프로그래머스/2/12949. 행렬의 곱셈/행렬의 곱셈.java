class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
                int length = 0;
        if (arr1.length == arr2.length) {
        	int [][] answer = new int[arr1[0].length][arr2[0].length];
        	for (int i = 0; i < arr1[0].length; i++) {
        		for (int j = 0; j < arr2[0].length; j++) {
        			int sum = 0;
        			for (int l = 0; l < arr1.length; l++) {
        				sum += arr1[i][l] * arr2[l][j];
        			}
        			answer[i][j] = sum;
        		}
        	}
        	return answer;
        } else if (arr1.length == arr2[0].length) {
        	int [][] answer = new int[arr1[0].length][arr2.length];
        	for (int i = 0; i < arr1[0].length; i++) {
        		for (int j = 0; j < arr2.length; j++) {
        			int sum = 0;
        			for (int l = 0; l < arr1.length; l++) {
        				sum += arr1[i][l] * arr2[l][j];
        			}
        			answer[i][j] = sum;
        		}
        	}
        	return answer;
        } else if (arr1[0].length == arr2.length) {
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
        } else {
        	int [][] answer = new int[arr1.length][arr2.length];
        	for (int i = 0; i < arr1.length; i++) {
        		for (int j = 0; j < arr2.length; j++) {
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
}