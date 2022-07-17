package algorithm;
import java.util.*;
import java.io.*;

public class plus {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	int testcase = Integer.parseInt(br.readLine());
    	
    	for(int i=1; i<=testcase; i++) {
    		PriorityQueue<Long> pq = new PriorityQueue<Long>();
    		int count = Integer.parseInt(br.readLine());
    		st=new StringTokenizer(br.readLine());
    		while(st.hasMoreTokens()) {
    			pq.add(Long.parseLong(st.nextToken()));
    		}
    		
    		Long sum = 0L;
    		
    		while(pq.size()>1){
    			Long x = pq.poll();
    			Long y = pq.poll();
    			sum += x+y;
    			pq.add(x+y);
    		}
    		sb.append(sum).append("\n");
    	
    	}
    	System.out.println(sb);
    }
}
