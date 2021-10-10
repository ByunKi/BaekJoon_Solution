"""
제출 번호: 34262965
아이디: adviate
문제: 10886
결과: 맞았습니다!!
메모리:	29200KB 
시간: 80ms
언어: Python 3
코드 길이: 204B
제출한 시간: 2021.10.10 16:39:52


* 첫 번째 줄에 설문조사를 한 사람의 수 N (1 ≤ N ≤ 101, N은 홀수)가 주어진다.
    다음 N개의 줄에는 각 줄마다 각 사람이 설문 조사에 어떤 의견을 표명했는지를 나타내는 정수가 주어진다.
    0은 준희가 귀엽지 않다고 했다는 뜻이고, 1은 준희가 귀엽다고 했다는 뜻이다.

* 준희가 귀엽지 않다는 의견이 더 많을 경우 "Junhee is not cute!"를 출력하고
    귀엽다는 의견이 많을 경우 "Junhee is cute!"를 출력하라.
   
"""
TC = int(input())
cnt = 0

for i in range(TC) :
    f = int(input())
    
    if (f == 1) :
        cnt += 1

if(cnt > TC - cnt) :
    print("Junhee is cute!")
    
else :
    print("Junhee is not cute!")
