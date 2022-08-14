"""
제출 번호: 47686284
아이디: adviate
문제: 7656
결과: 맞았습니다!!
메모리: 33520 KB 
시간: 128 ms
언어: Python 3
코드 길이: 399 B
"""

import re
from sys import stdin
def ip(): return stdin.readline().rstrip()

s = re.split('([?.])', ip())
for i in range(0, len(s)-1, 2):
    t = s[i].strip()
    if len(t) < 7:
        continue
    if s[i+1] == "?" and t[:7] == "What is":
        tt = " ".join(t.split()[2:])
        if tt == "": 
            print("Forty-two is.")
        else: 
            print("Forty-two is ", tt, ".", sep="")
