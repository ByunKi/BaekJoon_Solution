"""
 * 제출 번호: 51099700
 * ID: adviate
 * 문제: 1935
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 440 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())
ME = ip()
tmp, stack = [int(ip()) for _ in range(N)], []
for i in ME:
    if i.isalpha(): stack.append(tmp[ord(i)-ord('A')])
    else:
        a, b = stack.pop(), stack.pop()
        if i == '+': stack.append(b+a)
        elif i == '-': stack.append(b-a)
        elif i == '*': stack.append(b*a)
        elif i == '/': stack.append(b/a)
print('%.2f' %stack[0])
