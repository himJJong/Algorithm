import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int count = 0;
        int five = 0;
        while(n>0){
            if(n%5==0){
                five=n/5;
                n-=5*five;
                count+=five;
                
            }
            else{
                n-=2;
                count++;
        }
        }
        if(n<0){
            System.out.println(-1);
        }
        else
            System.out.println(count);
    }
}
