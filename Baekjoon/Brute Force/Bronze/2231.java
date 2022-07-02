package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());	 // 비교값 
		int val = 0;
		
		for(int i=0; i<1000054; i++) {
			if(saveNum(i,num)>0) {
				val=i;
				break;
			}
			else {
			}
		}
		if(val>0) {
			System.out.println(val);
		}
		else {
			System.out.println(0);
		}
			
		
	}
	public static int saveNum(int s,int num) {
		int val = s;			//비교하기 위해 들어오는 입력값 (val == i)
		int answer = 0;
		String split = "";
		split = Integer.toString(s);
		
		String[] arr = split.split("");
		for(int i =0; i<arr.length ;i++) {
			answer+=Integer.valueOf(arr[i]);
		}
		answer+=s;
		if(answer == num) {
			return s;
		}
		else {
			return -1;
		}
		
	}
}
