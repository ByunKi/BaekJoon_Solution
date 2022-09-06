"""
제출 번호: 48815468
아이디: adviate
문제: 16061
결과: 맞았습니다!!
메모리: 32884 KB 
시간: 84 ms
언어: Python 3
코드 길이: 423 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, d, k = map(int, ip().split())
arr = sorted([ip().split() for _ in range(n)], key=lambda x: -int(x[1]))
l, t, c = [], 0, 0

for i in range(k):
    t += int(arr[i][1])
    l.append(arr[i][0])
    c += 1
    if t >= d:
        t = -1
        break

if t == -1:
    print(c)
    for i in l:
        print(f'{i}, YOU ARE FIRED!')
else:
    print('impossible')
