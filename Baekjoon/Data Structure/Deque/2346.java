//ArrayDeque 
package algorithm;
import java.util.*;

public class plus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Deque<Integer> d = new ArrayDeque<>();

        int N = s.nextInt(), a[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            d.add(i+1);
            a[i] = s.nextInt();
        }

        int n = 0;
        for(int i = 0 ; i < N-1 ; i++){
            System.out.print(d.poll() + " ");	// 크기만큼 move 
            if(a[n] > 0){	//앞에서 뒤로 움직여야할 때 
                for(int j = 0 ; j < a[n]-1 ; j++)
                    d.addLast(d.pollFirst());
            }
            else{			//뒤에서 앞으로 움직여야 할 때 
                for(int j = a[n] ; j < 0 ; j++) // 크기만큼 move 
                    d.addFirst(d.pollLast());
            }
            n = d.peek()-1;	 // 움직인 위치의 배열인덱스는 d.peek()-1
        }
        System.out.print(d.poll());
    }
}

//Deque LinkedList 
package algorithm;
import java.util.*;
import java.io.*;

public class plus {
	static int n; // 풍선개수 
	static Deque<Balloon> balloons = new LinkedList<>(); // 풍선정보 
	static boolean isPositive = true; //true : 양수, false : 음수  
    static class Balloon { //풍선 클래스 
    	int number; //풍선 번호
    	int value; //풍선 값 
    
    	Balloon(){}
    	Balloon(int number, int value){
			this.number = number;
			this.value = value;
		}
    }
    
    static void input() throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] tokens = br.readLine().split("\n");
    	n=Integer.parseInt(tokens[0]);
    	
    	tokens = br.readLine().split(" ");
    	for(int i=0; i<n ;i++) {
    		balloons.add(new Balloon(i+1, Integer.parseInt(tokens[i])));
    	}
    }
    
    static void burst() {
    	//풍선이 다 터질떄까지 돌릴거임 
    	while(true){
    		Balloon now = new Balloon();
    	
    	if(isPositive) {
    		now = balloons.pollFirst();
    	}
    	else {
    		now = balloons.pollLast();
    	}
    	
    	System.out.print(now.number + " ");
    	if(balloons.size()==0) break;
    	
    	if(0<now.value) {
    		isPositive = true;
    		for(int i=0; i<(now.value-1)%balloons.size();i++) {
    			balloons.addLast(balloons.pollFirst());
    		}
    		
    	}
    	else {
    		isPositive = false;
    		for(int i=0; i<(Math.abs(now.value)-1)%balloons.size(); i++) {
    			balloons.addFirst(balloons.pollLast());
    		}
    	}
    	}
    }
    
	public static void main(String[] args) throws Exception {
    	input();
    	burst();
    }
}
