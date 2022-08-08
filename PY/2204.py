"""
제출 번호: 47362584
아이디: adviate
문제: 2204
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 253 B
"""

import sys
input = sys.stdin.readline

while(True):
    N = int(input())
    if N == 0:
        break

    dic = {}
    for i in range(N):
        s = input().rstrip()
        dic[s.lower()] = s

    tmp = sorted(list(dic.keys()))
    print(dic[tmp[0]])
