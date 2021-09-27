"""
제출 번호: 33777812
아이디: adviate
문제: 16431
결과: 맞았습니다!!
메모리:	29200KB 
시간: 80ms
언어: Python 3
코드 길이: 475B
제출한 시간: 2021.09.27 14:29:27
"""

"""
* 베시와 데이지 두 소 모두 최단 경로로 존에게 갈 때 어떤 소가 더 빨리 도착할까요?

* 첫 번째 줄에 베시의 좌표 Br, Bc (1 ≤ Br, Bc ≤ 1,000) 이 주어집니다.
    두 번째 줄에 데이지의 좌표 Dr, Dc (1 ≤ Dr, Dc ≤ 1,000) 이 주어집니다.
    세 번째 줄에 존의 좌표 Jr, Jc (1 ≤ Jr, Jc ≤ 1,000) 이 주어집니다.

* 첫 번째 줄에 베시가 더 빨리 도착하면 'bessie',
    데이지가 더 빨리 도착하면 'daisy', 동시에 도착하면 'tie' 를 출력합니다.
"""
Br,Bc = map(int, input().split())
Dr,Dc = map(int, input().split())
Jr,Jc = map(int, input().split())

D = abs(Jc - Dc) + abs(Jr - Dr)
# 상하좌우만 움직임 → r값은 r값끼리, c값은 c값끼리 계산

B = max(abs(Jc - Bc), abs(Jr - Br))
# 대각선 이동을 어떻게 생각 하지?
    # 예제 분석 → 서로 빼서 큰수에 얼추 맞는 거 같은데?

if(D == B) :
    print("tie")
    
elif (D < B) :
    print("daisy")
    
else :
    print("bessie")
