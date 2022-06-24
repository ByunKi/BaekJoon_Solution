'''
 * 제출 번호: 44936315
 * ID: adviate
 * 문제: 18409
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 260 B
'''

length = int(input())
str = input()
cnt = 0

for idx in str:
    if idx == 'a':
        cnt += 1
    elif idx == 'i':
        cnt += 1
    elif idx == 'u':
        cnt += 1
    elif idx == 'e':
        cnt += 1
    elif idx == 'o':
        cnt += 1

print(cnt)
