// 프로그래머스 정수 내림차순으로 배치하기


import java.util.*;

class Solution {
    public long solution(long n) {

        StringBuilder sb  = new StringBuilder();
        String arr = Long.toString(n);
        String[] str_arr = arr.split("");

        Arrays.sort(str_arr,Collections.reverseOrder());
        for(int i=0; i<str_arr.length;i++) {
            sb.append(str_arr[i]);
        }
        String concat = sb.toString();

        long answer = Long.parseLong(concat);
        return answer;
    }
}
