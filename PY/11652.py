"""
제출 번호: 47961137
아이디: adviate
문제: 11652
결과: 맞았습니다!!
메모리: 53908 KB 
시간: 200 ms
언어: Python 3
코드 길이: 255 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    n = int(ip())
    if n in dic:
        dic[n] += 1
    else:
        dic[n] = 1

t = sorted(dic.items(), key = lambda x:(-x[1], x[0]))
print(t[0][0])
