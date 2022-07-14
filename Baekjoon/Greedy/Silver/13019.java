package algorithm;
import java.io.*;
import java.util.*;

public class plus{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		String[] arr_A = A.split("");
		String[] arr_B = B.split("");
		Arrays.sort(arr_A);
		Arrays.sort(arr_B);
		
		if(A.length() != B.length() || !Arrays.equals(arr_A,arr_B)){
			System.out.println(-1);
		}else{
			int size = A.length();
			int cnt = 0;
			for(int i=size-1;i>=0;i--){
				if(A.charAt(i) == B.charAt(size-1-cnt)){
					cnt++;
				}
			}
			System.out.println(size-cnt);
		}
	}
}
