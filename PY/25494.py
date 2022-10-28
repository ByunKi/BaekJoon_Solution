"""
 * 제출 번호: 51030880
 * ID: adviate
 * 문제: 25494
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 147 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    a = list(map(int, ip().split()))
    print(min(a))
