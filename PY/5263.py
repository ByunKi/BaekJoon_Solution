"""
 * 제출 번호: 50288539
 * ID: adviate
 * 문제: 5263
 * 결과: 맞았습니다!!
 * 메모리: 83068 KB
 * 시간: 768 ms
 * 언어: Python 3
 * 코드 길이: 242 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
n, k = map(int, ip().split())
for _ in range(n):
    s = ip()
    dic[s] = dic[s]+1 if s in dic else 1

for s, v in dic.items():
    if not v % k == 0: print(s); break
