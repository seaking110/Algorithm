import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int rt = 0;
        int cf = 0;
        int jm = 0;
        int an = 0;
        for (int i = 0; i < survey.length; i++) {
        	switch (survey[i]) {
        		case "RT": { 
        			rt -= choices[i] - 4;
        			break;
        		}
        		case "TR": { 
        			rt += choices[i] - 4;
        			break;
        		}
        		case "CF": { 
        			cf -= choices[i] - 4;
        			break;
        		}
        		case "FC": { 
        			cf += choices[i] - 4;
        			break;
        		}
        		case "JM": { 
        			jm -= choices[i] - 4;
        			break;
        		}
        		case "MJ": { 
        			jm += choices[i] - 4;
        			break;
        		}
        		case "AN": { 
        			an -= choices[i] - 4;
        			break;
        		}
        		case "NA": { 
        			an += choices[i] - 4;
        			break;
        		}
        	}
        }
        if (rt >= 0) {
        	sb.append("R");
        } else {
        	sb.append("T");
        }
        if (cf >= 0) {
        	sb.append("C");
        } else {
        	sb.append("F");
        }
        if (jm >= 0) {
        	sb.append("J");
        } else {
        	sb.append("M");
        }
        if (an >= 0) {
        	sb.append("A");
        } else {
        	sb.append("N");
        }
        return sb.toString();
    }
}