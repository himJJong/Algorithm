// 프로그래머스 소수찾기
// 처음 짠 코드 - 시간 초과 + 비효율적

public class Test1 {
	public static void main(String[] args) {
		int n = 30;
		int answer =0;
		if(n<10) {
			for(int i=2; i<n+1;i++) {
				if(i==2) {
					answer+=1;
				}
				else if(i==3) {
					answer+=1;
				}
				else if(i==5) {
					answer+=1;
				}
				else if(i==7) {
					answer+=1;
				}
			}
		}
		else {
			answer=4;
			for(int i=10;i<n+1;i++) {
				if(!(i%2==0) && !(i%3==0) && !(i%5==0) && !(i%7==0)) {
					answer+=1;
				}
			}
		}
		System.out.println(answer);
    }
}

//에라토스테네스의 체 이용법 이해 + 공부
