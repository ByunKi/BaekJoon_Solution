"""
 * 제출 번호: 51558462
 * ID: adviate
 * 문제: 17264
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 457 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, P = map(int, ip().split())
W, L, G = map(int, ip().split())
dic = {}
for _ in range(P):
    name, r = ip().split()
    dic[name] = r

score = 0
f = False
for _ in range(N):
    s = ip()
    if s in dic and dic[s] == 'W': score += W
    else:
        if score < L: score = 0
        else: score -= L
    if score >= G: f = True; break
print('I AM NOT IRONMAN!!' if f else 'I AM IRONMAN!!')
