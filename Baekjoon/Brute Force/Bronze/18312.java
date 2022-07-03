package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
int count=0;
		
		for(int hour=0;hour<=N;hour++) {
			for(int min=0;min<60;min++) {
				for(int sec=0;sec<60;sec++) {
					// 시간을 문자열로 표현, 시,분,초가 10 미만일 경우 앞에 0을 붙인다.
					String time=((hour<10)?"0"+hour:""+hour)+
							((min<10)?"0"+min:""+min)+
							((sec<10)?"0"+sec:""+sec);
					
					// 시간에 k가 포함되어 있다면 count
					if(time.contains(Integer.toString(K)))
						count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
