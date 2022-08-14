"""
제출 번호: 47686873
아이디: adviate
문제: 22113
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 80 ms
언어: Python 3
코드 길이: 265 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, M = map(int, ip().split())
b, t, s = list(map(int, ip().split())), [], 0

for _ in range(N):
    t.append(list(map(int, ip().split())))

for i in range(1, M):
    s += t[b[i-1]-1][b[i]-1]
print(s)
