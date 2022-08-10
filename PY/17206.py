"""
 * 제출 번호: 47472707
 * ID: adviate
 * 문제: 17206
 * 결과: 맞았습니다!!
 * 메모리: 42132 KB
 * 시간: 168 ms
 * 언어: Python 3
 * 코드 길이: 254 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

_ = int(ip())
arr = list(map(int, ip().split()))
dp = [0] * 80001
acc = 0

for i in range(80001):
    if i % 3 == 0 or i % 7 == 0:
        acc += i
    dp[i] = acc

for i in arr:
    print(dp[i])
