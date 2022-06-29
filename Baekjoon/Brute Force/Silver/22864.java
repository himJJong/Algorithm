package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
		int hour = 0;
		int task = 0;
		int tired = 0;
		while(hour!=24) {
			if(tired+A<=M) {		
				tired+=A;
				task+=B;
			}
			else {
				tired-=C;
                if(tired<0){
                    tired=0;
                }
			}
			hour++;
		}
		System.out.println(task);
	}
}

