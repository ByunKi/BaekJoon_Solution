"""
제출 번호: 48430157
아이디: adviate
문제: 11645
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 175 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    s = set()
    for _ in range(int(ip())):
        s.add(ip())
    print(len(s))
