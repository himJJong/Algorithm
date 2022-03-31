//프로그래머스 문자여 내림차순을 배치하기

import java.util.*;

class Solution {
    public String solution(String s) {

        String[] arr = s.split("");
        String answer = "";
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<s.length();i++) {
            answer+=arr[i];
        }
        return answer;

    }
}
