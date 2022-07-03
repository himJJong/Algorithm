package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int n;
    static List<BaseBallData> inputData = new ArrayList<>();
    
    public static void main(String args[]) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {					//count 만큼 입력 
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int data = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            BaseBallData baseBallData = new BaseBallData(data, strike, ball);	 //BaseBallData인 baseBallData 생성 
            inputData.add(baseBallData);					// baseBallData의 정보를 List에 add
        }

        System.out.println(calBaseBall());
    }
    
    static int calBaseBall() {
        int result = 0;
        int num = 0;
        for (int i = 123; i <= 987; i++) {
            if (!checkSameNum(i)) continue; // 중복숫자확인하여 있으면 다음으로, 없으면 for문 실행  

            int allTestPass = 0;

            for (int j = 0; j < n; j++) {
                int strikeCount = 0;
                int ballCount = 0;

                BaseBallData current = inputData.get(j);			//현재 비교할 정보 하나씩 꺼내서  
                String currentDataString = Integer.toString(current.data);	//current의 data값 
                String myDataString = Integer.toString(i);					//Brute_force를 이용한 값 비교를 위해 

                for (int k = 0; k < 3; k++) { // strike++;
                    if (currentDataString.charAt(k) == myDataString.charAt(k)) {
                        strikeCount++;
                    }
                }

                for (int h = 0; h < 3; h++) {
                    for (int u = 0; u < 3; u++) {
                        if (myDataString.charAt(h) == currentDataString.charAt(u)) { // ball++;
                            if (h != u)
                                ballCount++;
                        }
                    }
                }
       
                if (current.strike == strikeCount && current.ball == ballCount) {	//입력정보와 비교 개수가 같아야함. 
                    allTestPass++;
                }
            }
            if (allTestPass == n) {		// 모든 조건이 맞고, 가능성 있는 숫자들은 result++;
                result++;
            }
        }
        return result;
    }

    static boolean checkSameNum(int num) {				//다른 자리끼리의 자연수가 같으면 안되고, 0이 있으면 안됌 

        String numString = Integer.toString(num);

        if (numString.charAt(0) == numString.charAt(1)) {
            return false;
        }

        if (numString.charAt(1) == numString.charAt(2)) {
            return false;
        }

        if (numString.charAt(0) == numString.charAt(2)) {
            return false;
        }
        if (numString.charAt(0) == '0' || numString.charAt(1) == '0' || numString.charAt(2) == '0')
            return false;

        return true;
    }

    static class BaseBallData {
        int data;
        int strike;
        int ball;

        public BaseBallData(int data, int strike, int ball) {
            this.data = data;
            this.strike = strike;
            this.ball = ball;
        }
    }
}

        
        

    
