"""
제출 번호: 47312958
아이디: adviate
문제: 15624
결과: 맞았습니다!! (201/201)
메모리: 30840 KB 
시간: 300 ms
언어: Python 3
코드 길이: 132 B
"""

import sys
input = sys.stdin.readline

a, b = 0, 1
for _ in range(int(input())):
    a, b = (a+b)%1000000007, a%1000000007

print(a)
