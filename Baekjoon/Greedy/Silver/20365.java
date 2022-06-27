package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		String s = st.nextToken();
		
		char arr[] = s.toCharArray();
		
		int blue = 0;
		int red = 0;
		
		for(int i=0; i<N-1 ; i++) {
			if(arr[i]=='B'&&arr[i+1]=='R') {
				red++;
			}
			else if(arr[i]=='R'&&arr[i+1]=='B'){
				blue++;
			}
		}
		int min = Math.min(red, blue);
		System.out.println(min+2);
	}
}
