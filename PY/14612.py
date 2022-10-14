"""
 * 제출 번호: 50561840
 * ID: adviate
 * 문제: 14612
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 506 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

l = []
dic = {}
n, m = map(int, ip().split())
for _ in range(n):
    tmp = ip().split()
    if tmp[0] == 'order':
        dic[int(tmp[1])] = int(tmp[2])
        l.append(int(tmp[1]))
    elif tmp[0] == 'sort': l.sort(key=lambda x: (dic[x], x))
    elif tmp[0] == 'complete':
        dic.pop(int(tmp[1]))
        l.remove(int(tmp[1]))

    if len(l) > 0:
        for i in l: print(i, end=' ')
        print()
    else:
        print('sleep')
