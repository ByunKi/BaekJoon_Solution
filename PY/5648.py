"""
 * 제출 번호: 47832964
 * ID: adviate
 * 문제: 5648
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 500 ms
 * 언어: Python 3
 * 코드 길이: 323 B
"""

li = []
while 1:
    try:
        ins = input()
        if ins == -1:
            break
        else:
            i_sp = ins.split()
            for i in i_sp:
                li.append(int(''.join(reversed(i)).lstrip('0')))

    except EOFError:
        break

del li[0]
li.sort()
for i in li:
    print(i)
