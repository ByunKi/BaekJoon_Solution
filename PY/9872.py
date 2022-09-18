"""
제출 번호: 49332055
아이디: adviate
문제: 9872
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 72 ms
언어: Python 3
코드 길이: 209 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    i = tuple(sorted(list(ip().split())))
    dic[i] = dic[i]+1 if i in dic else 1
print(max(dic.values()))
