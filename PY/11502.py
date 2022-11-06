"""
제출 번호: 51375301
아이디: adviate
문제: 11502
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 824 ms
언어: Python 3
코드 길이: 591 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def init(n):
    arr = [False, False] + [True] * (n+1)
    for i in range(2, int((n+1)**0.5)+1):
        for j in range(2*i, n+1, i): arr[j] = False
    return [x for x in range(2, n+1) if arr[x]]

def func(n):
    for i in primes:
        for j in primes:
            for k in primes:
                if i + j + k == num:
                    return sorted([i, j, k], key=lambda x: x)
    return [0]
    
primes = init(1000)
for _ in range(int(ip())):
    num = int(ip())
    for i in func(num): print(i, end=' ')
    print()
