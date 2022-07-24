package algorithm;
import java.util.*;
import java.io.*;

public class plus {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();			//크기 순서 입력 
    	
    	int count = 0;					//올라가는 count 세기 
    	int index= 0;
    	
    	while(num!=count) {
    		index++;
    		String str = Integer.toString(index);
    		if(str.contains("666")) {
    			count++;
    		}
    	}
    	System.out.println(index);
    }
}
