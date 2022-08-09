"""
제출 번호: 47433406
아이디: adviate
문제: 18679
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 72 ms
언어: Python 3
코드 길이: 308 B
"""

from sys import stdin
def input(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(input())):
    k, v = input().split('=')
    dic[k.strip()] = v.strip()
    
for _ in range(int(input())):
    _ = int(input())
    s = input().split()

    for i in s:
        print(dic[i], end=' ')
    print()
