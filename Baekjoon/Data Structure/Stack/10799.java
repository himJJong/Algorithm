package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String data = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			int result = 0;
			for(int i=0; i<data.length();i++) {	
				if(data.charAt(i)=='(') {	//열린 괄호라면 
					stack.push('(');		//stack에 열린괄호 push
					continue;
				}
				else if(data.charAt(i)==')') {	//닫힌 괄호라면 
					stack.pop();				//stack에 제일위 열린괄호 뽑고  
					
					if(data.charAt(i-1)=='(') {	//stack.pop()전 data가 열린 괄호라면 
						result+=stack.size();
					}
					else {						//닫힌 괄호라면 
						result++;
					}
					
				}
			}
			bw.write(result+"\n");
			bw.flush();
			br.close();
			bw.close();
	}
}
