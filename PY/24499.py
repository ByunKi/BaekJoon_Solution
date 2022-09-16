"""
 * 제출 번호: 49248409
 * ID: adviate
 * 문제: 24499
 * 결과: 맞았습니다!!
 * 메모리: 38548 KB
 * 시간: 152   ms
 * 언어: Python 3
 * 코드 길이: 342 B
"""

from sys import stdin
from itertools import accumulate
def ip(): return stdin.readline().rstrip()

N, K = map(int, ip().split())
l, v, t = [int(i) for i in ip().split()], [], 0
l = [0] + list(accumulate(l))
for i in range(N):
    if i+K <= N:
        t = max(t, l[i+K]-l[i])
    else:
        t = max(t, l[N] - l[i] + l[(i + K) % N])
print(t)
