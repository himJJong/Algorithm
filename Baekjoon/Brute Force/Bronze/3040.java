import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer=0;
		int sub = 0;
		int[] result = new int[7];
		int[] nine = new int[9];
		
		for(int i=0; i<9 ;i++) {
			nine[i]=Integer.parseInt(br.readLine());
			answer+=nine[i];
		}
	
		Label: for(int i=0;i<nine.length-1;i++) {
			for(int j=i+1; j<nine.length;j++) {
				sub=nine[i]+nine[j];
				if(answer-sub==100) {
					nine[i]=0;
					nine[j]=0;
					break Label;
				}
			}
		}
		int num=0;
		for(int i=0; i<nine.length; i++) {
			if(nine[i]==0) {
				continue;
			}
			else {
				result[num] = nine[i];
				System.out.println(result[num]);
				num++;
			}
		}
		
	}
}
