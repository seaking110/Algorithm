import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	public static int arr [][];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		arr= new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(),"01",true);
			int count = 0;
			while (st.hasMoreTokens()) {
				arr[i][count] = Integer.parseInt(st.nextToken());
				count++;
			}
		}
		partition(0,0,n);
		System.out.println(sb.toString());
		
	}
	public static void partition(int row, int col, int size) {
		if (check(row,col,size)) {
			if (arr[row][col]==1 ) {
				sb.append(1);
			}
			else {
				sb.append(0);
			}
			return;
		}
		sb.append("(");
		partition(row, col, size/2);
		partition(row, col+size/2, size/2);
		partition(row+size/2, col, size/2);
		partition(row+size/2, col+size/2, size/2);
		sb.append(")");
	}
	public static boolean check(int row, int col, int size) {
		int first = arr[row][col];
		for(int i=row;i<row+size;i++) {
			for(int j=col;j<col+size;j++) {
				if(first!=arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
