"""
 * 제출 번호: 50961454
 * ID: adviate
 * 문제: 17499
 * 결과: 맞았습니다!!
 * 메모리: 52448 KB
 * 시간: 676 ms
 * 언어: Python 3
 * 코드 길이: 329 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, Q = map(int, ip().split())
a = list(map(int, ip().split()))
p = 0
for _ in range(Q):
    t = list(map(int, ip().split()))
    if t[0] == 1: a[(p+t[1]-1)%N] += t[2]
    elif t[0] == 2: p -= t[1]
    else: p += t[1]
for i in range(p, N+p): print(a[i%N], end=' ')
