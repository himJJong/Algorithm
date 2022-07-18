import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    	int testcase = Integer.parseInt(br.readLine());
    	int answer = 0;
    	int prev = 0;
    	
    	for(int i=0; i<testcase ; i++) {
    		pq.add(Integer.parseInt(br.readLine()));
    	}
    	
    	while(pq.size()>1) {
    		prev =pq.poll()+pq.poll();
    		pq.add(prev);
    		answer+=prev;
    		
    	}
    	
    	System.out.println(answer);
    }
}
