"""
 * 제출 번호: 48526627
 * ID: adviate
 * 문제: 7586
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 590 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

t = {'L': 120, 'S': 150, 'B': 150, 'N': 40, 'C': 160, 'D': 100, 'R': 100, 'O': 100}
while 1:
    f = ip()
    if f == '#':
        break
    dic, cnt = {}, 0
    while 1:
        i = ip()
        if i == '00A':
            break
        tmp = i.split()
        if tmp[0] in dic:
            if tmp[1] in t:
                dic[tmp[0]] += t[tmp[1]]
        else:
            if tmp[1] in t:
                dic[tmp[0]] = t[tmp[1]]

    for i in dic.values():
        if i >= 200:
            cnt += 1

    print(f'{f} {cnt}')
