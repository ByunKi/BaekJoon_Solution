"""
제출 번호: 47365107
아이디: adviate
문제: 11149
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 80 ms
언어: Python 3
코드 길이: 425 B
"""

import sys
input = sys.stdin.readline

arr = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ']

for _ in range(int(input())):
    s = input().split()
    b = []
    
    for i in s:
        tmp = 0
        for j in i:
            tmp += ord(j) - ord('a')
        tmp %= 27
        b.append(arr[tmp])
        
    print(''.join(b))
