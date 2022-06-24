'''
 * 제출 번호: 44937612
 * ID: adviate
 * 문제: 6783
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 476 ms
 * 언어: Python 3
 * 코드 길이: 238 B
'''

Tt = 0
Ss = 0

N = int(input())
for i in range(N):
    s = input()
    for ch in s:
        if ch == 'T' or ch == 't':
            Tt += 1
        elif ch == 'S' or ch == 's':
            Ss += 1

print("English" if Tt > Ss else "French")
