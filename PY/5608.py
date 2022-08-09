"""
제출 번호: 47433781
아이디: adviate
문제: 5608
결과: 맞았습니다!!
메모리: 31620 KB 
시간: 116 ms
언어: Python 3
코드 길이: 292 B
"""

from sys import stdin
def input(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(input())):
    k, v = input().split()
    dic[k.strip()] = v.strip()

buf = []
for _ in range(int(input())):
    ch = input()
    buf.append(dic[ch] if ch in dic else ch)
    
print(''.join(buf))
