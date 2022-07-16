package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int val = 0;
			int left = 0;
			int right = 0;
			
			int[] arr = new int[testcase];
			for(int i=0; i<testcase; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i=0; i< testcase ; i++) {
				if(val<arr[i]) {
					val=arr[i];
					left++;
				}
			}
			val = 0;
			for(int i=testcase-1; i>=0 ;i--) {
				if(val<arr[i]) {
					val=arr[i];
					right++;
				}
			}
			System.out.println(left);
			System.out.println(right);
	}
}
