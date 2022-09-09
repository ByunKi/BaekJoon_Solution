"""
제출 번호: 48964474
아이디: adviate
문제: 20044
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 76 ms
언어: Python 3
코드 길이: 219 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, b, e, a = int(ip()), 0, -1, []
l = sorted(list(map(int, ip().split())))
for _ in range(n):
    a.append(l[b]+l[e])
    b += 1
    e -= 1
print(min(a))
