package algorithm;

import java.io.*;
import java.util.*;


public class Test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int num = Integer.parseInt(s);
		StringBuilder sb = new StringBuilder();
		
		String space = " ";
		String even = "1 2"; 
		String odd = "3";
		
		if(num%2 == 0) {
			for(int i = 0 ; i<num/2 ; i++) {
				sb.append(even);
				if(i!=num/2-1) {
					sb.append(space);
				}
			}
			System.out.println(sb);
		}
		else {
			for(int i=0 ; i<num/2; i++) {
				sb.append(even);
				sb.append(space);
			}
			sb.append(odd);
			System.out.println(sb);
		}
	}
}
