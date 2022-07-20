import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> ar = new ArrayList<Long>();
		int fibo = Integer.parseInt(br.readLine());
		int[] arr = new int[2];
		long answer = 0L;
		
		ar.add((long) 0);
		ar.add((long) 1);
		
		if(fibo == 1) {
			System.out.println(1);
			
		}
		else {
			for(int i=2 ; i<fibo+1;i++) {
				ar.add(ar.get(i-2)+ar.get(i-1));
				answer=ar.get(ar.size()-1);
			}
			System.out.println(answer);
		}
		}
			
		}
