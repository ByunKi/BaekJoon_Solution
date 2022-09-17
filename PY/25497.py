"""
 * 제출 번호: 49287173
 * ID: adviate
 * 문제: 25497
 * 결과: 맞았습니다!!
 * 메모리: 31716 KB
 * 시간: 140 ms
 * 언어: Python 3
 * 코드 길이: 491 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

_ = ip()
s = ip()
ls, ss, c = [], [], 0
for i in s:
    if i.isdigit(): c += 1
    else:
        if i == 'L': ls.append(i)
        if i == 'S': ss.append(i)
        if i == 'R':
            if ls:
                c += 1
                del ls[-1]
            else:
                break
        if i == 'K':
            if ss:
                c += 1
                del ss[-1]
            else:
                break
print(c)
