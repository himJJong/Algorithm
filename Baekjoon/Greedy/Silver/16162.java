package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int answer;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] data = new int[2];
		int num = 0;
		for(int i=0; i<data.length ;i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] place = new int[data[0]];
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			place[num]=Integer.parseInt(st.nextToken());
			num++;
		}
		Arrays.sort(place);
		
		double left = place[0] - 0.5;
		int cnt =1;
		for(int i=0; i<data[0]; i++) {
			if(left+data[1]<place[i]) {
				cnt++;
				left=place[i]-0.5;
			}
		}
		System.out.println(cnt);
	}
}
