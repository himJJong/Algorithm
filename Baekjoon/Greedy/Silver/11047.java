import java.io.*;
import java.util.*;

public class Main { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(st1.nextToken());
		long money = Long.parseLong(st1.nextToken());
		
		int arr[] = new int[cnt];
		long total = 0;
		
		for(int i=0; i<cnt ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        
		Arrays.sort(arr); 		
		int num = 0;
		int charge =0;
		for(int i=cnt-1; i>=0 ;i--) {
			if(money/arr[i]>=1) {
				num += money/arr[i];
				charge = (int) (money/arr[i]);
				money-=charge*arr[i];
				}
			else
				continue;
		}
		System.out.println(num);
	}
}
