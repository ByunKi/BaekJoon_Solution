"""
 * 제출 번호: 50327500
 * ID: adviate
 * 문제: 25703
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 64 ms
 * 언어: Python 3
 * 코드 길이: 268 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())

print('int a;')
for i in range(1, N+1):
    if i == 1: print('int *ptr = &a;')
    elif i == 2: print(f'int **ptr{i} = &ptr;')
    else: print('int ' + '*' * (i) + f'ptr{i} = &ptr{i-1};')
