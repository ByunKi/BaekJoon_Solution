"""
 * 제출 번호: 45071346
 * ID: adviate
 * 문제: 20833
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 72 B
"""

rst = 0
for i in range(int(input())):
    rst += pow(i+1, 3)

print(rst)
