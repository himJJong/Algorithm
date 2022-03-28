//프로그래머스 두 개 뽑아서 더하기

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {


        int sum = 0;
        int num = 0;
        int size =0;


        for(int i=0; i<numbers.length; i++) {
            sum+=i;
        }

        int[] compare = new int[sum];

        for(int i=0; i<numbers.length;i++) {
            for(int j=1+i; j<numbers.length ; j++) {
                compare[num]=numbers[i]+numbers[j];
                if(num!=sum) {
                    num++;
                }
                else {
                    break;
                }
            }
        }
        Arrays.sort(compare);

        for(int i=0; i<compare.length-1 ;i++) {
            if(compare[i]==compare[i+1]) {
                size++;
            }
        }
        int[] answer = new int[compare.length-size];


        for(int i=0,j=0; i<compare.length-1 ;i++) {
            if(compare[i]==compare[i+1]) {
                continue;
            }
            else {
                answer[j]=compare[i];
                j++;
            }
        }
        answer[(compare.length-size)-1] = compare[compare.length-1];

        return answer;
    }
}
