//프로그머스 예산 문제

import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {

        int count = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length;i++) {
            budget-=d[i];
            count++;
            if(budget<0) {
                count--;
                break;
            }
            else
                continue;
        }
        return count;
    }
}

