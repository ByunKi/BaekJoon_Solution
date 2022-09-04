"""
 * 제출 번호: 48738895
 * ID: adviate
 * 문제: 10211
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 267 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    n = int(ip())
    l = list(map(int, ip().split()))
    dp = [0] * n
    dp[0] = l[0]

    for i in range(1, n):
        dp[i] = max(dp[i-1]+l[i], l[i])
    print(max(dp))
