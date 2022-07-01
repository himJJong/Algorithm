package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] count = br.readLine().split(" ");
		
		int num = Integer.valueOf(count[0]);
		int bird = Integer.valueOf(count[1]);
		int[] fruits = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num ; i++) {
			fruits[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(fruits);
		
		for(int i=0 ; i<num ; i++) {
			if(fruits[i]<=bird) {
				bird++;
			}
			else {
				break;
			}
		}
		System.out.println(bird);
			
	}
}
