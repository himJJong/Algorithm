import java.io.*;
import java.util.*;

public class Main { 
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long count = 0;
		
		while(b>a) {
			if(b%2==0) {
				b=b/2;
				count++;
			}
			else if(b%10==1) {
				b=b/10;
				count++;
			}	
			else
				b=0;
		}
		
		if(b<a) {
			System.out.println(-1);
		}
		else {
			System.out.println(count+1);
		}
	}
}

