"""
제출 번호: 48301993
아이디: adviate
문제: 11235
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 290 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    i = ip()
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

m = max(dic.values())
for k, v in sorted(dic.items(), key = lambda x: x[0]):
    if m == v:
        print(k)
