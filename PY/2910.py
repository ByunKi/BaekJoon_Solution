"""
 * 제출 번호: 50787552
 * ID: adviate
 * 문제: 2910
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 322 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
N, C = map(int, ip().split())
l, a = [int(x) for x in ip().split()], []
for i in l:
    dic[i] = dic[i] + 1 if i in dic else 1
for k, v in sorted(dic.items(), key=lambda x: -x[1]):
    for i in range(v):
        a.append(str(k))
print(' '.join(a))
