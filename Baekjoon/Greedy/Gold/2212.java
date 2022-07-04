package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int[] dp;
	static int min;
    public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int center = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[count];
		for(int i=0; i<count ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int[] diff = new int[count-1];
		
		for(int i=0; i<diff.length ;i++) {
			diff[i] = arr[i+1]-arr[i];
		}
		Arrays.sort(diff);
		
		int answer = 0;
		for(int i=0; i<count-center;i++) {
			answer+=diff[i];
		}
		System.out.println(answer);
		
	}
}    	
