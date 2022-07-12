"""
 * 제출 번호: 45954173
 * ID: adviate
 * 문제: 9012
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 387 B
"""

for _ in range(int(input())):
    VPS = input()
    stack = []
    flag = True

    for s in VPS:
        if s == '(':
            stack.append('(')
        elif s == ')' and len(stack) == 0:
            flag = False
            stack.clear()
            break
        elif s == ')':
            stack.pop()

    if len(stack) > 0:
        flag = False
    print('YES' if flag else 'NO')
