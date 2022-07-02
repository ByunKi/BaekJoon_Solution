"""
 * 제출 번호: 45402072
 * ID: adviate
 * 문제: 17478
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 923 B
"""


def func(parameter, cnt):
    s = "____"
    print((s * cnt) + "\"재귀함수가 뭔가요?\"")
    if parameter == 0:
        print((s * cnt) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"")
        print((s * cnt) + "라고 답변하였지.")
        return
    print((s * cnt) + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.")
    print((s * cnt) + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")
    print((s * cnt) + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"")
    func(parameter - 1, cnt + 1)
    print((s * cnt) + "라고 답변하였지.")
    return


num = int(input())
print("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
func(num, 0)
