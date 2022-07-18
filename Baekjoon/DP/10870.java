package algorithm;
import java.util.*;
import java.io.*;

public class plus {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	ArrayList<Integer> ar = new ArrayList<Integer>();
    	
    	int testcase = Integer.parseInt(br.readLine());
		int answer = 0;
		
		ar.add(0);
		ar.add(1);
		
		for(int i = 2 ; i<=testcase;i++) {
			ar.add(ar.get(i-2)+ar.get(i-1));
			System.out.println(ar.get(i));
		}
		
		
		
		if(testcase==0) {
			System.out.println(ar.get(0));
		}
		else if(testcase==1) {
			System.out.println(ar.get(1));
		}
		else {
			System.out.println(ar.get(testcase));
		}
    }
}
