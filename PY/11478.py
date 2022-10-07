"""
 * 제출 번호: 50247831
 * ID: adviate
 * 문제: 11478
 * 결과: 맞았습니다!!
 * 메모리: 240036 KB
 * 시간: 916 ms
 * 언어: Python 3
 * 코드 길이: 176 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

S = ip()
s = set()
for k in range(len(S)):
    for i in range(len(S)+1):
        s.add(S[i:i+k])
print(len(s))
