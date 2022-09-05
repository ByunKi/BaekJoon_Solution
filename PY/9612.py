"""
 * 제출 번호: 48776084
 * ID: adviate
 * 문제: 9612
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 234 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
    n = ip()
    dic[n] = dic[n]+1 if n in dic else 1

t = sorted(dic.items(), key=lambda x: (x[1], x[0]))
print(t[-1][0], t[-1][1])
