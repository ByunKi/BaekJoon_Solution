"""
 * 제출 번호: 45876202
 * ID: adviate
 * 문제: 16205
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 991 B
"""

def toCamelCase(method, name):
    if method == '3':
        return name[0].lower() + name[1:]
    elif method == '2':
        tmp = ''
        flag = False
        for i in name:
            if i == '_':
                flag = True
            else:
                if flag:
                    tmp += i.upper()
                    flag = False
                else:
                    tmp += i
        return tmp
    else:
        return name

def toSnakeCase(name):
    tmp = ''
    for i in range(len(name)):
        if name[i].isupper():
            tmp += '_' + name[i].lower()
        else:
            tmp += name[i]

    return tmp[1:] if tmp[0] == '_' else tmp


def toPascalCase(method, name):
    if method == '1':
        return name[0].upper() + name[1:]
    elif method == '2':
        return name.title().replace('_', '')
    else:
        return name

method, name = input().split()
print(toCamelCase(method, name))
print(toSnakeCase(name))
print(toPascalCase(method, name))
