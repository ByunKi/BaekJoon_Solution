"""
제출 번호: 33779639
아이디: adviate
문제: 14264
결과: 맞았습니다!!
메모리:	31312KB 
시간: 76ms
언어: Python 3
코드 길이: 63B
제출한 시간: 2021.09.27 15:12:09
"""

"""
* 한 변의 길이가 L인 정육각형을 가지고 있다.
    오늘은 이 정육각형에 세 개의 겹치지 않는 대각선을 그리려고 한다.
    대각선은 정육각형을 4개의 삼각형으로 나눈다.
   4개의 삼각형 중에 면적이 제일 작은 삼각형의 면적을 S라고 한다.
   
* 가능한 S중에서 최댓값을 구하는 프로그램을 작성하시오.


* 첫째 줄에 정육각형 한 변의 길이 L이 주어진다. (1 ≤ L ≤ 1,000,000, L은 정수)

* 첫째 줄에 S의 최댓값을 출력한다. 절대/상대 오차는 10-9까지 허용한다.
"""
import math

L = int(input())
print((math.sqrt(3) * math.pow(L,2)) / 4)