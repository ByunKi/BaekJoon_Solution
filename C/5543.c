/*
제출 번호: 33183358
아이디:	adviate
문제: 5543
결과: 맞았습니다!!
메모리: 1112
시간: 0
언어: C99
코드 길이: 1051
제출한 시간: 2021.09.09 23:18:09
*/

/*
1. 입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다.
2. 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다.
3. 모든 가격은 100원 이상, 2000원 이하이다.
4. 첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
*/

#include <stdio.h>

int main() {
	int hamburger[3], beverage[2], totalPrice = 0, minHamburger = 2100, minBeverage = 2100;

	for (int i = 0; i < 3; i++) {
		scanf("%d",&hamburger[i]);

		if (hamburger[i] < minHamburger) {
			minHamburger = hamburger[i];
		}
	}

	for (int i = 0; i < 2; i++) {
		scanf("%d", &beverage[i]);

		if (beverage[i] < minBeverage) {
			minBeverage = beverage[i];
		}
	}

	totalPrice = minHamburger + minBeverage - 50;
	printf("%d \n", totalPrice);

	return 0;
}
