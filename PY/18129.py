"""
 * 제출 번호: 47890991
 * ID: adviate
 * 문제: 18129
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 338 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

s, K = ip().split()
s, K = s.upper() + ' ', int(K)

dic, cnt, prev = {}, 0, s[0]
for i in s:
    if prev == i:
        cnt += 1
    else:
        if prev not in dic:
            dic[prev] = '1' if cnt >= K else '0'
        cnt = 1
    prev = i

print(''.join(list(dic.values())))
