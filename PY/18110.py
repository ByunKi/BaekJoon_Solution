"""
제출 번호: 47723343
아이디: adviate
문제: 18110
결과: 맞았습니다!!
메모리: 36848 KB 
시간: 236 ms
언어: Python 3
코드 길이: 329 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def myRound(n):
    if n - int(n) >= 0.5:
        return int(n) + 1
    return int(n)

N = int(ip())
if N == 0:
    print(0)
else:
    arr = sorted([int(ip()) for _ in range(N)])
    t = myRound(N * 0.15)
    arr = arr[t:N-t]
    print(myRound(sum(arr)/len(arr)))
