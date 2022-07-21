"""
 * 제출 번호: 46399771
 * ID: adviate
 * 문제: 25329
 * 결과: 맞았습니다!!
 * 메모리: 33976 KB
 * 시간: 100 ms
 * 언어: Python 3
 * 코드 길이: 516 B
"""

import sys
from math import ceil
input = sys.stdin.readline

n = int(input())
dic = {}

for _ in range(n):
    tmp = list(input().split())
    h, m = map(int, tmp[0].split(':'))
    m = h * 60 + m
    dic[tmp[1]] = (dic[tmp[1]] + m) if tmp[1] in dic else m

keys = list(dic.keys())
for i in range(len(dic)):
    fee = 10
    tmp = dic[keys[i]] - 100
    fee += ceil(tmp/50) * 3 if tmp > 0 else 0
    dic[keys[i]] = fee

dic = sorted(dic.items(), key=lambda x: (-x[1], x[0]))
for i in dic:
    print(f"{i[0]} {i[1]}")
