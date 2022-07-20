package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int space = Integer.parseInt(st.nextToken());
		int planet = Integer.parseInt(st.nextToken());
		int val = 0;
		int[] data = new int[planet];
		String[] Str= new String[space];
		int num =0;
		int answer = 0;
		
		val = space;
		while(space-- >0) {
			Str[num] = "";
			st = new StringTokenizer(br.readLine());
			for(int i=0 ;i<planet; i++) {
				data[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=0; i<planet-1;i++) {
				for(int j=1; j<planet;j++) {
					if(data[i]> data[j]) {
						Str[num]+="+";
					}
					else if(data[i]<data[j]) {
						Str[num]+="-";
					}
					else if(data[i]==data[j]) {
						Str[num]+="=";
					}
				}
			}
			num++;
		}
		
		if(val == 2) {
					if(Str[0].equals(Str[1])) {
						answer++;
					}
				}
		
		else {
			for(int i=0; i<val-1;i++) {
				for(int j=i+1; j<val ; j++) {
					if(Str[i].equals(Str[j])) {
						answer++;
					}
				}
			}
		}
		
		System.out.println(answer);
	}
}
