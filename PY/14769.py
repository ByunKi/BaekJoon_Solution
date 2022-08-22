"""
제출 번호: 48102798
아이디: adviate
문제: 14769
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 273 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    a, b = ip().split()

    if a.isdigit():
        dic[b] = int(a)//2
    else:
        dic[a] = int(b)

for k, v in sorted(dic.items(), key=lambda x:x[1]):
    print(k)
