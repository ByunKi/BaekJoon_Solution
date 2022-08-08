"""
제출 번호: 47373365
아이디: adviate
문제: 14544
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 72 ms
언어: Python 3
코드 길이: 620 B
"""

from sys import stdin
def input(): return stdin.readline().rstrip()

num = 1
for _ in range(int(input())):
    n, m = map(int, input().split())

    dic = {}
    for _ in range(n):
        dic[input()] = 0

    for _ in range(m):
        tmp = input().split()
        dic[tmp[0]] += int(tmp[1])

    name, mV, flag = '', -1, False
    for k, v in dic.items():
        if mV == v:
            flag = True
        if mV < v:
            mV = v
            name = k

    if flag:
        print(f'VOTE {num}: THERE IS A DILEMMA')
    else:
        print(f'VOTE {num}: THE WINNER IS {name} {mV}')
    num += 1
