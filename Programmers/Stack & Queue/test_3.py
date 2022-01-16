# 프로그래머스 고득점 Kit _ Stack & Queue 3번문제


def solution(bridge_length, weight, truck_weights):                 # 다리위 올라갈 수 있는 트럭 수 , 제한된 무게, 트럭의 각각 무게
    answer = 0                                                      # 트럭이 지나갈 때 걸리는 시간 변수
    trucks_on_bridge = [0] * bridge_length                          # trucks_on_bridge 라는 다리위의 트럭을 처리할 리스트  
    while len(trucks_on_bridge):                                    # trucks_on_bridge의 존재한다면
        answer += 1                                                 # +1 초 증가
        trucks_on_bridge.pop(0)                                     # 트럭위의 첫번째 항을 pop하는데
        if truck_weights:                                           # 기다리는 트럭이 존재 한다면
            if sum(trucks_on_bridge) + truck_weights[0] <= weight:  # trucks_on_bridge 무게와 + truck_weights 첫번째 트럭의 합이 <= weight 보다 작다면
                trucks_on_bridge.append(truck_weights.pop(0))           # trucks_on_bridge의 리스트에 , 대기하고 있는 truck_weights를 뽑아내 뒤쪽에 추가해준다.
            else:                                                   # trucks_on_bridge 무게와 + truck_weights 첫번째 트럭의 합이 <= weight 보다 크다면
                trucks_on_bridge.append(0)                              # trucks_on_bridge의 리스트에 0을 추가
    return answer                                                   # 끝으로 트럭이 모두 지나가면 걸리는 answer값 추가
  
  
  
  
  """
  
  1) 내가 이끌어 낸 지점 :
  
  - 대기하는 트럭을 pop(0)하여 다리위에있는 트럭에 추가한 후 if문을 통해 weight 이하라면 대기하는 트럭을 뺴내어 trucks_on_bridge에 추가 해주는 생각
  
  2) 이끌어내지 못한 지점 :
  
  - 다리위에 있을 수 있는 새로운 리스트를 만들어 활용하는 생각
  
  3) 느낀점 :
  
  - 뭔가 앞에 풀어보았던 1,2번 문제와 느낌이 비슷하여 어렵지는 않았다. 하나씩 추가되는 사항이 있는데 그 부분을 잘 보완하면 좋아질 것 같다.
  
  
  # 프로그래머스 문제 링크 - https://programmers.co.kr/learn/courses/30/lessons/42583
  
  """
  
