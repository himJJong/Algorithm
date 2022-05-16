import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
       Queue<Integer> queue = new LinkedList<>();
        int sum = 0;            // 중간마다 truck값 저장을 위한 변수
        int time = 0; 

        for(int i = 0; i < truck_weights.length; i++) { 
            int truck = truck_weights[i];

            while(true) {
                if(queue.isEmpty()) { // 큐에 아무것도 없는 경우
                    queue.add(truck);
                    sum += truck;     // truck 값 저장
                    time++;           // 다리에 오를 때만 시간 추가 
                    break;
                } else if(queue.size() == bridge_length) { // 큐에 다리 길이만큼 트럭이 다 찬 경우 
                    sum -= queue.poll();
                } else  {                                 // 다리 길이만큼 큐가 차지않았음 -> weight값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌 
                    if(sum + truck <= weight) {           // 아직 들어오지 않은 truck + 큐 위에 남은 truck <= weight
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {                              // weight를 넘는다면 0 대입으로 한칸 땡겨주기 
                        queue.add(0);
                        time++;
                    }
                }
            }
        }

        // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이 
        return time + bridge_length; 
    }

}
