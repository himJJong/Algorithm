package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	static int A,B,C;
	static int answer=0;
	static int member;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num =0;
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		member = Integer.parseInt(st.nextToken());
		if(A==1||B==1||C==1) {
			System.out.println(1);
		}
		else {
			while(member!=0) {
				for(int i=0;i<member/A+1;i++) {
					for(int j=0; j<member/B+1 ;j++) {
						for(int k=0; k<member/C+1 ;k++) {
							if(member==(A*i)+(B*j)+(C*k)) {
								num=2022;
								member=0;
								break;
							}
							if(i==member/A && j==member/B && k==member/C) {
								member = 0;
							}
						}
					}
					
				}
				
			}
			if(num==2022) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
