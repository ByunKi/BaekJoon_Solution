/*
제출 번호: 33089874
아이디: adviate
문제: 15964
결과: 100점
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 368B
제출한 시간: 2021.09.07 17:52:43
*/

/*
1. 연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
2. 첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)
3. 첫째 줄에 A＠B의 결과를 출력한다.
*/

#include <stdio.h>

int main() {
	long long A, B, rst;
	scanf("%lld %lld", &A, &B);
	rst = (A + B) * (A - B);

	printf("%lld \n",rst);

	return 0;
}
