"""
 * 제출 번호: 49594207
 * ID: adviate
 * 문제: 5545
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 298 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())
A, B = map(int, ip().split())
C = int(ip())
D = sorted([int(ip()) for _ in range(N)], reverse=True)
a = [int(C/A)]

for i in range(N):
    p = A + B * (i+1)
    c = C + sum(D[0:i+1])
    a.append(int(c/p))
    
print(max(a))
