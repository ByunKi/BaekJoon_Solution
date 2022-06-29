"""
 * 제출 번호: 45235578
 * ID: adviate
 * 문제: 16360
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 555 B
"""

for _ in range(int(input())):
    word = input()

    if word[-1] == 'a' or word[-1] == 'o' or word[-1] == 'u':
        print(word + 's')
    elif word[-1] == 'i' or word[-1] == 'y':
        print(word[:-1] + 'ios')
    elif word[-2] == 'n' and word[-1] == 'e':
        print(word[:-2] + 'anes')
    elif word[-1] == 'n':
        print(word[:-1] + 'anes')
    elif word[-1] == 'l' or word[-1] == 'r' or word[-1] == 'v':
        print(word + 'es')
    elif word[-1] == 'w' or word[-1] == 't':
        print(word + 'as')
    else:
        print(word + 'us')
