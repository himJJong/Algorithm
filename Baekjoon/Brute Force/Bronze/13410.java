package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	static int Max;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[2];
		for(int i=0; i<2 ;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}		
		//arr[0]은 기준이 되는 수, arr[1]은 몇까지 곱할지 나타내는 수.
		Max = 0;
		int total = 0;
		
		for(int i=0; i<arr[1];i++) {
			total=arr[0]*(i+1);
			Max = reverse(total);
		}
		System.out.println(Max);
		
	}
	
	public static int reverse(int num) {
		String arr = "";
		String sen = "";
		String[] arrto;
		arr = Integer.toString(num);
		arrto = arr.split("");
		int change = 0;
		String[] arrtwo = new String[arrto.length];
		
		for(int i=arrto.length-1;i>=0;i--) {
			sen+=arrto[i];
		}
		change = Integer.parseInt(sen);
		if(change<Max) {
			return Max;
		}
		else {
			Max=change;
			return Max;
		}
	}
}
