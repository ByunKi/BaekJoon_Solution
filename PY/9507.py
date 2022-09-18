"""
제출 번호: 49331794
아이디: adviate
문제: 9507
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 273 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def F(v, n):
    if v[n]:
        return v[n]
    v[n] = F(v, n-1) + F(v, n-2) + F(v, n-3) + F(v, n-4)
    return v[n]

a = [1, 1, 2, 4] + [0] * 64
F(a, 67)
for i in range(int(ip())):
    print(a[int(ip())])
