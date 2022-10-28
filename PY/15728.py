"""
 * 제출 번호: 51069900
 * ID: adviate
 * 문제: 15728
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 132 ms
 * 언어: Python 3
 * 코드 길이: 394 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, K = map(int, ip().split())
s = list(map(int, ip().split()))
t = set(map(int, ip().split()))
for _ in range(K):
    n, x = -int(1e9), 0
    for i in t:
        for j in s:
            if n <= i*j:
                n = i*j
                x = i
    t.remove(x)

M = -int(1e9)
for i in t:
    for j in s: M = max(i*j, M)
print(M)
