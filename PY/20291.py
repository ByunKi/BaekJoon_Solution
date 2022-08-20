"""
 * 제출 번호: 48040886
 * ID: adviate
 * 문제: 20291
 * 결과: 맞았습니다!!
 * 메모리: 40828 KB
 * 시간: 232 ms
 * 언어: Python 3
 * 코드 길이: 213 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    e = ip().split('.')[1]
    dic[e] = dic[e]+1 if e in dic else 1

for k in sorted(dic.keys()):
    print(k, dic[k])
