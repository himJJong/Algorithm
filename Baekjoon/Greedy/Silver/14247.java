package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int treecount;
	static int[] tree;
	static int[] grow;
	static int answer;
    public static void main(String[] args) throws IOException {
	 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	treecount = Integer.parseInt(br.readLine());
    	tree = new int[treecount];
    	grow = new int[treecount];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	//초기 나무의 크기 대입 
    	for(int i=0; i<treecount ; i++) {
    		tree[i] = Integer.parseInt(st.nextToken());
    		answer+=tree[i];    	}
    	
    	//나무마다 자라는 속도 
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	for(int i=0; i<treecount ; i++) {
    		grow[i] = Integer.parseInt(st1.nextToken());
    	}
    	
    	Arrays.sort(grow);
    	
    	for(int i=2; i<treecount+1;i++) {
    		answer+=(i-1)*grow[i-1];
    	}
    	
    	System.out.println(answer);
  
    }
}
    
