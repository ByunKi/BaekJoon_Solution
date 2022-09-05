"""
 * 제출 번호: 48796074
 * ID: adviate
 * 문제: 2670
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 225 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n = int(ip())
l = [float(ip()) for i in range(n)]
dp = [0] * n
dp[0] = l[0]

for i in range(1, n):
    dp[i] = max(dp[i-1]*l[i], l[i])

print('%.3f' % max(dp))
