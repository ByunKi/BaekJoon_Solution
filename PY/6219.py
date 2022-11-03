"""
 * 제출 번호: 51299468
 * ID: adviate
 * 문제: 6219
 * 결과: 맞았습니다!!
 * 메모리: 67300 KB
 * 시간: 3880 ms
 * 언어: Python 3
 * 코드 길이: 313 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

A, B, D = map(int, ip().split())
arr, c = [True] * (B+1), 0

for i in range(2, int(B**0.5)+1):
    for j in range(2*i, B+1, i): arr[j] = False

primes = [x for x in range(A, B+1) if arr[x]]
for i in primes:
    if str(D) in str(i): c += 1
print(c)
