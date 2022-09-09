"""
제출 번호: 48815468
아이디: adviate
문제: 1120
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 76 ms
언어: Python 3
코드 길이: 245 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

A, B = ip().split()
ans = []
for i in range(len(B)-len(A)+1):
    c = 0
    for j in range(len(A)):
        if A[j] != B[i+j]:
            c += 1
    ans.append(c)
print(min(ans))
