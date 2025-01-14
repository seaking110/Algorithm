import java.util.*;
class Solution {
    public static char [][] arr;;
	public static int n;
	public static int [] start;
    public int[] solution(String[] park, String[] routes) {
        start = new int[2]; 
        arr = new char [park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
        	StringTokenizer st = new StringTokenizer(park[i], "SOX",true);
        	int count = 0;
        	while (st.hasMoreTokens()) {
        		arr[i][count] = st.nextToken().charAt(0);
        		if (arr[i][count]=='S') {
        			start[0] = i;
        			start[1] = count;
        		}
        		count++;
        	}
        }
        for (int i = 0; i < routes.length; i++) {
        	StringTokenizer st = new StringTokenizer(routes[i]);
        	char a =st.nextToken().charAt(0);
        	int n = Integer.parseInt(st.nextToken());
        	check(a, n);
        	System.out.println(start[0]+" "+start[1]);
        }
        return start;
    }
    public void check(char dir, int n) {
    	if (dir == 'E') {
    		if (start[1] + n < arr[0].length) {
    			for (int i = start[1]; i <= start[1] + n; i++) {
    				if (arr[start[0]][i] == 'X') {
    					return;
    				}
    			}
    			arr[start[0]][start[1]] = 'O';
    			start[1] = start[1] + n;
    			arr[start[0]][start[1]] = 'S';
    			
    		}
    	}
    	else if (dir == 'W') {
    		if (start[1] - n >= 0) {
    			for (int i = start[1]; i >= start[1] - n; i--) {
    				if (arr[start[0]][i] == 'X') {
    					return;
    				}
    			}
    			arr[start[0]][start[1]] = 'O';
    			start[1] -= n;
    			arr[start[0]][start[1]] = 'S';
    			
    		}
    	}
    	else if (dir == 'S') {
    		if (start[0] + n < arr.length) {
    			for (int i = start[0]; i <= start[0] + n; i++) {
    				if (arr[i][start[1]] == 'X') {
    					return;
    				}
    			}
    			arr[start[0]][start[1]] = 'O';
    			start[0] += n;
    			arr[start[0]][start[1]] = 'S';
    			
    		}
    	}
    	else {
    		if (start[0] - n >= 0) {
    			for (int i = start[0]; i >= start[0] - n; i--) {
    				if (arr[i][start[1]] == 'X') {
    					return;
    				}
    			}
    			arr[start[0]][start[1]] = 'O';
    			start[0] -= n;
    			arr[start[0]][start[1]] = 'S';
    			
    		}
    	}
    }
}