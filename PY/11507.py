"""
 * 제출 번호: 48196190
 * ID: adviate
 * 문제: 11507
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 80 ms
 * 언어: Python 3
 * 코드 길이: 361 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

s, g = ip(), False
dic = {'P': set(), 'K': set(), 'H': set(), 'T': set()}

for i in range(0, len(s), 3):
    t = s[i:i+3]
    if t[1:] in dic[t[0]]:
        g = True
        break

    dic[t[0]].add(t[1:])

if g:
    print('GRESKA')
else:
    for i in dic.keys():
        print(13-len(dic[i]), end=' ')
