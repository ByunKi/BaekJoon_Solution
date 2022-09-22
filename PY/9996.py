"""
 * 제출 번호: 49547586
 * ID: adviate
 * 문제: 9996
 * 결과: 맞았습니다!!
 * 메모리: 33512 KB
 * 시간: 132 ms
 * 언어: Python 3
 * 코드 길이: 273 B
"""

import re
from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())
a = ip().split('*')
p = re.compile('^{0}[a-z]*{1}$'.format(a[0], a[1]))
l = [ip() for _ in range(N)]

for i in l:
    r = p.findall(i)
    if len(r): print('DA')
    else: print('NE')
