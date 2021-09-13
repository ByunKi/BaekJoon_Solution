/*
제출 번호: 33314018
아이디: adviate
문제: 10768
결과: 맞았습니다!!
메모리: 1116KB
시간: 0ms
언어: C99
코드 길이: 608B 
제출한 시간: 2021.09.13 22:01:57
*/

/*
* 사용자로부터 정수인 월과 일을 입력받아 날짜가 2월 18일인지 전인지 후인지를 출력하는 프로그램이다.
* 만약 날짜가 2월 18일 전이면, "Before"을 출력한다. 만약 날짜가 2월 18일 후면, "After"을 출력한다. 만약 2월 18일이라면 "Special" 을 출력한다.
* 첫 번째 줄은 1에서 12사이의 월을 입력한다.
  두 번째 줄은 1에서 31사이의 그 달에 들어있는 날짜를 입력한다 .
* 마지막 줄에 "Before", "After"나 "Special"을 출력한다.
*/

#include <stdio.h>

int main() {
	int a, b;
	scanf("%d", &a);
	scanf("%d", &b);

	if (a > 2) {
		printf("After \n");
		return 0;
	}

	else if (a > 1) {
		if (a == 2 && b == 18) {
			printf("Special \n");
			return 0;
		}

		else if (a >= 2 && b > 18) {
			printf("After \n");
			return 0;
		}

		else if (a <= 2 && b < 18) {
			printf("Before \n");
			return 0;
		}
	}

	else {
		printf("Before \n");
		return 0;
	}
}
