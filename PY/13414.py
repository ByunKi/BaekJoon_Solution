"""
 * 제출 번호: 49782123
 * ID: adviate
 * 문제: 13414
 * 결과: 맞았습니다!!
 * 메모리: 77044 KB
 * 시간: 516 ms
 * 언어: Python 3
 * 코드 길이: 247 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic, c = {}, 0
K, L = map(int, ip().split())
for i in range(L): dic[ip()] = i
t = sorted(dic.items(), key=lambda x: x[1])
for i in t:
    if K == c: break
    print(i[0])
    c += 1
