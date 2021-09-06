/*
*	ID: adviate
*	문제번호: 15727
* 	결과: 맞았습니다!!
* 	메모리: 1112KB
* 	시간: 0ms
* 	언어: C99
* 	제출일시: 2021.09.06 22:37:35
*/

/*
1. 첫째 줄에 성우의 현재 위치와 민건이의 집까지의 거리 L(1 ≤ L ≤ 1,000,000)가 주어진다.
2. 성우는 1분에 1에서 5까지의 거리를 이동할 수 있다.
3. 성우가 최소 t분만에 민건이를 찾을 수 있을 때, t 이상의 가장 작은 정수를 출력한다.
	3-1. 최소시간을 찾아야 되기때문에, speed는 5로 고정
*/

#include <stdio.h>

/*
int main() {
	int L, speed = 0;
	scanf("%d", &L);
	
	for (int i = 5; i > 0; i--) {
		if (L % i == 0) {
			speed = i;
			break;
		}
	}

	printf("%d \n", L/speed);

	return 0;
}
속력을 최대로 두고 풀어야함. */

int main() {
	int L, speed = 5;
	scanf("%d", &L);

	if (!(L % speed)) { // 최대속력의 배수, L이 여기에 속하면 정확한 값이 나온다.
		printf("%d \n", L / speed);
	}
	else { // 나머지도 거리에 포함이 되기때문에 그에따른 보정으로 1을 더해준다.
		printf("%d \n", (L / speed) + 1);
	}

	return 0;
}
