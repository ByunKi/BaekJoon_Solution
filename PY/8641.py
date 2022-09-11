"""
 * 제출 번호: 48991384
 * ID: adviate
 * 문제: 8641
 * 결과: 맞았습니다!!
 * 메모리: 136316 KB
 * 시간: 2120 ms
 * 언어: Python 3
 * 코드 길이: 248 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
for _ in range(int(ip())):
     i = ip().split()
     dic[i[0]] = dic[i[0]]+int(i[1]) if i[0] in dic else int(i[1])
print(len(dic))
for k, v in dic.items():
     print(k, v)
