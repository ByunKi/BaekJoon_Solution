"""
 * 제출 번호: 47892476
 * ID: adviate
 * 문제: 14670
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 402 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    e, n = ip().split()
    dic[e] = n

for _ in range(int(ip())):
    t = list(ip().split())
    a, flag = [], False
    for i in range(1, len(t)):
        if t[i] in dic:
            a.append(dic[t[i]])
        else:
            flag = True
            break
    print('YOU DIED' if flag else ' '.join(a))

