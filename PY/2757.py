"""
 * 제출 번호: 49923264
 * ID: adviate
 * 문제: 2757
 * 결과: 맞았습니다!!
 * 메모리: 33560 KB
 * 시간: 128 ms
 * 언어: Python 3
 * 코드 길이: 383 B
"""

from sys import stdin
from string import ascii_uppercase
def ip(): return stdin.readline().rstrip()

while 1:
    s = ip()[1:]
    r, c = map(int, s.split('C'))
    if r == 0 and c == 0: break

    t = []
    c -= 1
    al = list(ascii_uppercase)
    while c >= 0:
        t.insert(0, c % 26)
        c = c // 26 - 1
    a = ''
    for x in t: a += al[x]
    a += str(r)
    print(a)
