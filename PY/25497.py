"""
 * 제출 번호: 49287458
 * ID: adviate
 * 문제: 25497
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 136 ms
 * 언어: Python 3
 * 코드 길이: 327 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

c = 0
dic = {'L':0, 'S':0}
_ = ip()
for i in ip():
    if i.isdigit(): c += 1
    elif i == 'L' or i == 'S': dic[i] += 1
    elif i == 'R' and dic['L'] > 0: c += 1; dic['L'] -= 1
    elif i == 'K' and dic['S'] > 0: c += 1; dic['S'] -= 1
    else: break
print(c)
