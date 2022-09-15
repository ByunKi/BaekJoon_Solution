"""
제출 번호: 49159480
아이디: adviate
문제: 20733
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 274 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

s, dic = ip(), {}
l = len(s)//3
for i in range(0, len(s), l):
    t = s[i:i+l]
    dic[t] = dic[t]+1 if t in dic else 1 
m, V = 0, 0
for k, v in dic.items():
    if v > m:
        m = v
        V = k
print(V)
