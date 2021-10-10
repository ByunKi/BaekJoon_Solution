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


* 자연수 N이 주어졌을 때, 2의 제곱수면 1을 아니면 0을 출력하는 프로그램을 작성하시오.

* 첫째 줄에 N(1 ≤ N ≤ 230)이 주어진다.

* N이 2의 제곱수면 1을 아니면 0을 출력하는 프로그램을 작성하시오.
    
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
