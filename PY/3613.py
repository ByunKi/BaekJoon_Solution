"""
 * 제출 번호: 49491293
 * ID: adviate
 * 문제: 3613
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 824 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def check(s):
    if s[-1] == '_' or s[0] == '_' or s[0].isupper(): return False
    f = True if '_' in s else False
    for i in range(len(s)):
        if s[i:i+2] == '__' or (s[i].isupper() and f): return False
    return True

def CTJ(s):
    t, f = [], False
    for e in s:
        if f:
            t.append(e.upper())
            f = False
            continue
        if e == '_':
            f = True
            continue
        t.append(e)
    return ''.join(t)

def JTC(s):
    t = []
    for e in s:
        if e.isupper():
            t.append('_' + e.lower())
            continue
        t.append(e)
    return ''.join(t)

s = ip()
if check(s):
    if '_' in s: print(CTJ(s))
    else: print(JTC(s))
else: print('Error!')
