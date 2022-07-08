package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int answer;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int people = Integer.parseInt(br.readLine());
		int[][] data = new int[people][2];
		
		//people의 (x,y)에 대한 정보 
		for(int i=0; i<people ; i++) {
			st = new StringTokenizer(br.readLine());
			data[i][0]=Integer.parseInt(st.nextToken());
			data[i][1]=Integer.parseInt(st.nextToken());
		}
		//Brute force이용하기 
		for(int i=0 ;i<people;i++) {
			int rank = 1;
			for(int j=0;j<people;j++) {
				if(i==j)		// 자기자신일때는 continue 
				{
					continue;
				}
				//조건에 맞을 때 하나씩 비교하며 등수 내리기 
				else if(data[i][0]<data[j][0]&&data[i][1]<data[j][1]) {
					rank++;
				}
		}
		System.out.print(rank+" ");
	}
}
}
