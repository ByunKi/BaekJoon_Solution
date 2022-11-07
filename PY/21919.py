"""
 * 제출 번호: 51443944
 * ID: adviate
 * 문제: 21919
 * 결과: 맞았습니다!!
 * 메모리: 46984 KB
 * 시간: 432 ms
 * 언어: Python 3
 * 코드 길이: 407 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())
arr = set(map(int, ip().split()))

is_primes = [False, False] + [True] * (1000000-1)
for i in range(2, len(is_primes)):
    if not is_primes[i]: continue
    for j in range(2 * i, len(is_primes), i): is_primes[j] = False

r = 1
for i in arr:
    if is_primes[i]: r *= i
print(-1 if r == 1 else r)
