import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int num =0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //lost와 reserve 같은것 1000으로 초기화하고 num개수 세
        for(int i=0; i<lost.length;i++) {
            for(int j=0; j<reserve.length;j++) {
                if(lost[i]==reserve[j]) {
                    lost[i]=1000;
                    reserve[j]=1000;
                    num++;
                    break;
                }
            }
        }
        //결과값의 최솟값 answer
        int answer = n-lost.length+num;
        int count=0;

        // lost와 reserve 비
        Label :for(int i=0; i<lost.length;i++) {
            for(int j=0; j<reserve.length;j++) {
                if(lost[i]==1000) {
                    break;
                }
                else if(count==lost.length) {
                    break Label;
                }
                else if(Math.abs(lost[i]-reserve[j])==1) {
                    reserve[j]=1000;
                    count++;
                    break;
                }

            }
            }
        return (answer+count);
    }
}
