"""
제출 번호: 47375354
아이디: adviate
문제: 22993
결과: 맞았습니다!!
메모리: 41532 KB 
시간: 136 ms
언어: Python 3
코드 길이: 259 B
"""

from sys import stdin
def input(): return stdin.readline().rstrip()

_, flag = int(input()), False
M, *A = map(int, input().split())

A.sort()
for i in A:
    if M > i:
        M += i
    else:
        flag = True
        break

print('No' if flag else 'Yes')


#수정 후
'''
from sys import stdin
def input(): return stdin.readline().rstrip()

_ = int(input())
M, *A = map(int, input().split())

A.sort()
for i in A:
    if M > i:
        M += i
    else:
        M = -1
        break

print('No' if M < 0 else 'Yes')
'''
