"""
제출 번호: 48403680
아이디: adviate
문제: 12788
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 309 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, cnt, f = int(ip()), 0, False
M, K = map(int, ip().split())
arr = sorted(list(map(int, ip().split())), reverse=True)
p = M * K

for i in arr:
    cnt += 1
    p -= i
    if p < 1:
        f = True
        break

print(cnt if f else 'STRESS')
