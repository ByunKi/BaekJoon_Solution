/*
제출 번호: 33181548
아이디:	adviate
문제: 4299
결과: 맞았습니다!!
메모리: 1116KB
시간: 0ms
언어: C99
코드 길이: 771B
제출한 시간: 2021.09.09 22:37:53
*/

/*
1. 첫째 줄에 두 팀 점수의 합과 차가 빈 칸으로 구분되어 주어진다. 축구 점수는 항상 음이 아닌 정수이고, 합과 차는 1000보다 작거나 같은 음이 아닌 정수이다.
2. 첫째 줄에 두 팀의 경기 결과를 출력한다. 득점을 많이 한 쪽을 먼저 출력한다. 만약, 그러한 합과 차를 갖는 경기 결과가 없다면, -1을 출력한다.
*/

#include <stdio.h>

int main() {
	int sum, sub, a, b, max, min;
	scanf("%d %d", &sum, &sub);

	b = (sum - sub) / 2;
	a = sum - b;
	
	if (a > b) {
		max = a;
		min = b;
	}
	else {
		max = b;
		min = a;
	} // 크기 비교

	if (sum - sub < 0 || (sum - sub) % 2 != 0) {
		printf("-1 \n");
		return 0;
	}

	printf("%d %d \n", max, min);
	return 0;
}
