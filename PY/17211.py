"""
 * 제출 번호: 47571689
 * ID: adviate
 * 문제: 17211
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 84 ms
 * 언어: Python 3
 * 코드 길이: 365 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

N, f = map(int, ip().split())
a, b, c, d = map(float, ip().split())
A, B = [0] * N, [0] * N

if f == 0:
    A[0] = a
    B[0] = b
else:
    A[0] = c
    B[0] = d

for i in range(1, N):
    A[i] = A[i-1]*a + B[i-1]*c
    B[i] = A[i-1]*b + B[i-1]*d

print(round(A[N-1]*1000))
print(round(B[N-1]*1000))
