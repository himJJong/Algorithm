import java.io.*;
import java.util.*;

public class Main {
	
	

    public static void main(String[] args) throws IOException {
	 
    	Scanner sc = new Scanner(System.in);
    	long testcase = sc.nextLong();
    	long answer = 0;
    	int middle = (int) (testcase/2);
    	
    	long[] x = new long[(int) testcase];
    	long[] y = new long[(int) testcase];
    	
    	for(int i=0; i<testcase ;i++) {
    		
    		x[i]=sc.nextLong();
    		y[i]=sc.nextLong();
    	}
    	
    	Arrays.sort(x);
    	Arrays.sort(y);
    	
    	if(testcase%2==1) {
    		long a = x[(int)middle];
        	long b = y[(int)middle];
        	
        	for(int i=0; i<testcase; i++) {
        		answer+=Math.abs(a-x[i]);
        		answer+=Math.abs(b-y[i]);
        	}
       
        	System.out.println(answer);
    	}
    	else {
    		long first = 0;
    		long second =0;
    		long result=0;
    		
    		first = x[(int)middle];
    		second = y[(int)middle];
    		
    		for(int i=0; i<testcase; i++) {
        		answer+=Math.abs(first-x[i]);
        		answer+=Math.abs(second-y[i]);
    		}
        	first = x[(int)middle-1];
    		second = y[(int)middle-1];
    		
    		for(int i=0; i<testcase; i++) {
        		result+=Math.abs(first-x[i]);
        		result+=Math.abs(second-y[i]);
        	}
        	if(result>answer) {
        		System.out.println(answer);
        	}
        	else
        		System.out.println(result);
        	
    	}
    }
}
