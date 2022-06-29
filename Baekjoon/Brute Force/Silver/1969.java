import java.io.*;
import java.util.*;

public class Main { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken()); // DNA의 수
		int size = Integer.parseInt(st.nextToken()); // 문자열의 길이
		
		String[] arr = new String[count];
		for(int i=0; i<count; i++) {
			arr[i] = br.readLine();
		}
		
		
		String[][] arr2 = new String[count][size];
		for(int i=0; i<count ; i++) {
			arr2[i]=arr[i].split("");
		}
		
		String total = "";
		String val = "";
		String blank = "";
		
		int Max = 0;
		int sum = 0;
		
		for(int i=0; i<size ; i++) {
			int T = 0;
			int A = 0;
			int G = 0;
			int C = 0;
			for(int j=0; j<count ; j++) {
				switch(arr2[j][i]) {
					case "T" :
						T++;
						break;
					case "A" :
						A++;
						break;
					case "G" :
						G++;
						break;
					case "C" :
						C++;
						break;
					
				}	
			}
			Max=Math.max(A,C);
			Max=Math.max(Max,G);
			Max=Math.max(Max,T);
			sum+=count-Max;
			
			if(Max==A) {
				total+="A";
			}
			else if(Max==C) {
				total+="C";
			}
			else if(Max==G) {
				total+="G";
			}
			else
				total+="T";
			
			Max = 0;
			
		}
		System.out.println(total);
		System.out.println(sum);
	}
}
