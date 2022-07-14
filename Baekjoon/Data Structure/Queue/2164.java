import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int testcase = Integer.parseInt(br.readLine());
		int num =0;
		for(int i=1; i<testcase+1 ;i++) {
			queue.offer(i);
		}
		
		while(queue.size()>1) {
			if(num%2==0) {
				queue.poll();			}
			else {
				queue.add(queue.poll());
			}
			num++;
		}
		System.out.println(queue.poll());
}
}
