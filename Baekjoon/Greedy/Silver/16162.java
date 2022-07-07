package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int answer;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] data = new int[3];
		
		for(int i=0; i<data.length ;i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		int val = data[1];
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			if(Integer.parseInt(st.nextToken())==val) {
				answer++;
				val+=data[2];
			}
		}
		
		System.out.println(answer);
	}
}
