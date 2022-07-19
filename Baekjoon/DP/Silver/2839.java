import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int answer = 0;
        int nochange = sugar;
        int thr = 1;
        int five = 1;
        int judge = 0;
        int val = 0;
        
        if(sugar<=5) {
        	if(sugar==3) {
        		System.out.println(1);
        	}
        	else if(sugar==5) {
        		System.out.println(1);
        	}
        	else {
        		System.out.println(-1);
        	}
        }
        else {
        	for(int i=sugar/5; i>=0 ;i--) {
        		val = 5*i;
        		sugar-=val;
        		if(sugar%3==0) {
        			five = i;
        			thr = sugar/3;
        			judge = -1;
        			System.out.println(thr+five);
        			break;
        		}
        		sugar=nochange;
        	}
        	if(judge!=-1) {
        		if(sugar%3==0) {
        			System.out.println(sugar/3);
        		}
        		else {
        			System.out.println(-1);
        		}
        	}
        	
        	}
        }
    }
