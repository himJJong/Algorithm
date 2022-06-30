package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] count = br.readLine().split(" ");
		
		int book = Integer.valueOf(count[0]);
		int boxsize = Integer.valueOf(count[1]);
		int[] boxarr = new int[book];
		
		if(book==0) {
			System.out.println(0);
		}
		else {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<book ; i++) {
				boxarr[i]=Integer.parseInt(st.nextToken());
			}
			
			
			
			int val =0 ;
			int result = 0;
			int num=0;
			
			for(int i=0; i<book;i++) {
				val+=boxarr[i];
				if(val>boxsize) {
					result++;
					val = boxarr[i];
				}
			}
				
			System.out.println(result+1);
		}
	}
}
