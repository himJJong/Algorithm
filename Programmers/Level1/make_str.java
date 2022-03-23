//프로그래머스 이상한 문자 만들기
// 내 첫번째 풀이
package programmers;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		String s = "try hello world";
		
		String answer = "";
		String[] arr = new String[s.length()]; 
		arr = s.split("");
		
		for(int i=0; i<s.length() ; i++) {
			if(i%2==0) {
				answer+=arr[i].toUpperCase();
			}
			else {
				answer+=arr[i];
			}
		}
	   System.out.println(answer);
	}	
}

// 두번째 풀이
package programmers;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		String s = "abcd efghijk lmnopqrstuv wxyz";
		String answer = "";
		
		String[] arr = new String[s.length()];
		arr=s.split("");
		
		for(int i=0; i<s.length(); i+=2) {
			
			arr[i] =arr[i].toUpperCase();
		}
		
		for(int i=0; i<s.length() ; i++) {
			answer+=arr[i];
		}
		System.out.println(answer);
	}
}

// 다른 사람 풀이

class Solution {
  public String solution(String s) {
      String answer = "";
      
      String str[] = s.split("");
      String space = " ";
      int cnt = 0;
      
      for(int i = 0; i < str.length; i++){
          if(str[i].equals(space)){
             cnt = 0;
          }else{
             if(cnt % 2 == 0){
                cnt++;
                str[i] = str[i].toUpperCase();
             }else{
                 cnt++;
                 str[i] = str[i].toLowerCase();
             }
          }
          answer += str[i];
      }
      
      System.out.println(answer);
      
      return answer;
  }
  
  //어떤 부분에서 내 코드가 더 비효율적인지
