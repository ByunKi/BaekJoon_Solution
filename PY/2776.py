"""
제출 번호: 47686525
아이디: adviate
문제: 2776
결과: 맞았습니다!!
메모리: 221892 KB 
시간: 1532 ms
언어: Python 3
코드 길이: 261 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    _ = int(ip())
    d1 = set(list(map(int, ip().split())))
    _= int(ip())
    d2 = list(map(int, ip().split()))

    for i in d2:
        print(1 if i in d1 else 0)
