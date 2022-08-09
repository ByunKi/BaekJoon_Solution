"""
 * 제출 번호: 47461770
 * ID: adviate
 * 문제: 8620
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 944 ms
 * 언어: Python 3
 * 코드 길이: 250 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    k, v = ip().split()

    if k not in dic:
        dic[k] = int(v)
    else:
        dic[k] += int(v)

for i in sorted(dic.keys()):
    print(i, dic[i])
