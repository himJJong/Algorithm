//프로그래머스 같은 숫자는 싫어

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        int count = 0;      
        for(int i=0; i<arr.length-1;i++) {
            if(arr[i]==arr[i+1]) {
                continue;
            }
            else
                count++;
        }

        int[] answer = new int[count+1];

        for(int i=0,j=0; i<arr.length-1;i++) {
            if(arr[i]!=arr[i+1]) {
                answer[j]=arr[i];
                j++;
            }
        }
        answer[count]=arr[arr.length-1];
        return answer;
    }
}
