"""
 * 제출 번호: 50918519
 * ID: adviate
 * 문제: 17390
 * 결과: 맞았습니다!!
 * 메모리: 63208 KB
 * 시간: 784 ms
 * 언어: Python 3
 * 코드 길이: 329 B
"""

from sys import stdin, stdout
from itertools import accumulate as acc
def ip(): return stdin.readline().rstrip()
def w(n): return stdout.write(str(n) + '\n')

N, Q = map(int, ip().split())
A = [0]+[i for i in acc(sorted(list(map(int, ip().split()))))]
for _ in range(Q):
    L, R = list(map(int, ip().split()))
    w(A[R]-A[L-1])
