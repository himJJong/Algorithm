//https://chlee21.tistory.com/174

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            int min = arr[0];
            
            for(int i=0; i<arr.length; i++){
                min = Math.min(min, arr[i]);
            }
            int index = 0;
            for(int i=0; i<arr.length; i++){
                if(min == arr[i]){
                    continue;
                }
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}

// 프로그래머스 제일 작은 수 빼기
// list, arraylist return 출려 변환 error 

// 처음 짜 코드
package programmers;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
				
				int[] arr = {4,3,2,1};
				int[] arr1 = new int[arr.length];
				int count =0;
				int compare =arr[0];
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				if(arr.length==1) {
					list.add(-1);
					int[] answer = new int[list.size()];
					for (int j=0; j<answer.length;j++) {
						answer[j] = list.get(j).intValue();
		            }
					System.out.println(answer);
		        }
				
				else {
					for(int i=1; i<arr.length;i++) {
						compare = Math.min(compare,arr[i]);
					}
					for(int i=0; i<arr.length;i++) {
						list.add(arr[i]);
					}
		            
				
				    for(int i=0; i<arr.length;i++) {
					    if(compare==arr[i]) {
						    count = i;
					    }
					    else {
						    continue;
					    }
		            
				    list.remove(count);
				    int[] answer = new int[list.size()];
		        
				    for (int j=0; j<answer.length;j++) {
					    answer[j] = list.get(j).intValue();
					    System.out.println(answer[j]);
				    }
		            
				    
		            }
		        }
		    }
		}
