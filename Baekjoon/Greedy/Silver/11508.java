import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int arr[] = new int[cnt];
		long total = 0;
		int var = 1;
		
		for(int i=0; i<cnt ; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr); 		// 팁을 많이 주고 싶은 순서 
		
		for(int i=cnt-1 ; i>=0 ; i--) {
			if(var==3){
                var=0;
            }
			else{
				total+=arr[i];
            }
			var++;
		}
		System.out.println(total);
	}
}
