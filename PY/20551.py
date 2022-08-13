"""
제출 번호: 47641794
아이디: adviate
문제: 20551
결과: 맞았습니다!!
메모리: 40912 KB 
시간: 1212 ms
언어: Python 3
코드 길이: 500 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def lb(a, t):
    l, r = 0, len(a) - 1
    while l <= r:
        m = (l + r) // 2
        if a[m] > t:
            r = m - 1
        elif a[m] < t:
            l = m + 1
        else:
            if r == m:
                break
            r = m
    if a[m] == t:
        return m
    else:
        return -1

N, M = map(int, ip().split())
arr = sorted([int(ip()) for _ in range(N)])

for _ in range(M):
    print(lb(arr, int(ip())))
