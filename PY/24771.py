"""
제출 번호: 47226306
아이디: adviate
문제: 24771
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 389 B
"""

import sys
input = sys.stdin.readline

num = 1
while(True):
    n = int(input())
    if n == 0:
        break
        
    dic = {}
    for i in range(n):
        animal = input().split()[-1].lower()
        dic[animal] = 1 if animal not in dic else dic[animal] + 1

    print('List {}:'.format(num))
    for i in sorted(dic.keys()):
        print('{} | {}'.format(i, dic[i]))
    num += 1
