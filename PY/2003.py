"""
 * 제출 번호: 48483048
 * ID: adviate
 * 문제: 2003
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 317 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

c, l, r, s = 0, 0, 0, 0
N, M = map(int, ip().split())
a = list(map(int, ip().split()))

while 1:
    if s >= M:
        s -= a[l]
        l += 1
    elif r == N:
        break
    else:
        s += a[r]
        r += 1
    if s == M:
        c += 1

print(c)
