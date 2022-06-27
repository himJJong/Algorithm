package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sub = new StringTokenizer(br.readLine(),"-");
		int sum = 0;
		
		while(sub.hasMoreTokens()) {
			int val = Integer.MAX_VALUE;
			StringTokenizer add = new StringTokenizer(sub.nextToken(),"+");
			
			while(add.hasMoreTokens()) {	//+값들을 더해주기 
				val+=Integer.parseInt(add.nextToken());
			}
			
			if(sum==Integer.MAX_VALUE) {
				sum = val;
			}
			else {
				sum-=val;
			}
		}
		System.out.println(sum);
}
}
