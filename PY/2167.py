"""
제출 번호: 47785757
아이디: adviate
문제: 2167
결과: 맞았습니다!!
메모리: 36484 KB 
시간: 164 ms
언어: Python 3
코드 길이: 452 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, M = map(int, ip().split())
arr = [list(map(int, ip().split())) for _ in range(N)]

K = int(ip())
dp = [[0] * (M+1) for _ in range(N+1)]

for i in range(1, N+1):
    for j in range(1, M+1):
        dp[i][j] = arr[i-1][j-1] + dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1]

for _ in range(K):
    i, j, x, y = map(int, ip().split())
    print(dp[x][y] - dp[x][j-1] - dp[i-1][y] + dp[i-1][j-1])
