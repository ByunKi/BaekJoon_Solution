"""
제출 번호: 49159463
아이디: adviate
문제: 14469
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 292 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

l, t = [], 0
N = int(ip())
for _ in range(N):
    l.append(list(map(int, ip().split())))
l.sort(key=lambda x:(x[0]))
t = l[0][0] + l[0][1]
for i in range(1, N):
    if l[i][0] > t:
        t = l[i][0]
    t += l[i][1]
print(t)
