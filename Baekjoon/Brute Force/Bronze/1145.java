package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[5];
		int num = 0;
		int min = 0;
		for(int i=0; i<5; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<1000000; i++) {
			if(i%arr[0]==0) {
				num++;
			}
			if(i%arr[1]==0) {
				num++;
			}
			if(i%arr[2]==0) {
				num++;
			}
			if(i%arr[3]==0) {
				num++;
			}
			if(i%arr[4]==0) {
				num++;
			}
			if(num>=3) {
				min = i;
				break;
			}
			num=0;
		}
		System.out.println(min);
	}
}
