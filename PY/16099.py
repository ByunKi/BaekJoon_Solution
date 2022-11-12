"""
 * 제출 번호: 51615776
 * ID: adviate
 * 문제: 16099
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 250 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    l1, w1, l2, w2 = map(int, ip().split())

    if l1*w1 > l2*w2: print('TelecomParisTech')
    elif l1*w1 == l2*w2: print('Tie')
    else: print('Eurecom')
