"""
 * 제출 번호: 45587926
 * ID: adviate
 * 문제: 1526
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 956 ms
 * 언어: Python 3
 * 코드 길이: 133 B
"""

num = 0
for i in range(4, int(input()) + 1):
    if str(i).count("4") + str(i).count("7") == len(str(i)):
        num = i

print(num)
