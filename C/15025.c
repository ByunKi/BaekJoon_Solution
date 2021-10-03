/*
제출 번호: 34000888
아이디: adviate
문제: 15025
결과: 맞았습니다!!
메모리:	1116KB
시간: 0ms
언어: C99
코드 길이: 308B
제출한 시간: 2021.10.03 11:47:28
*/

/*
* When determining the age of a bull moose, the number of tines (sharp points), extending from the main antlers, can be used.
	An older bull moose tends to have more tines than a younger moose. 
	However, just counting the number of tines can be misleading, as a moose can break off the tines, for example when fighting with other moose.
	Therefore, a point system is used when describing the antlers of a bull moose.

* The point system works like this: If the number of tines on the left side and the right side match, the moose is said to have the even sum of the number of points.
	So, “an even 6-point moose”, would have three tines on each side. 
	If the moose has a different number of tines on the left and right side, the moose is said to have twice the highest number of tines
	but it is odd. So “an odd 10-point moose” would have 5 tines on one side, and 4 or less tines on the other side.
	Can you figure out how many points a moose has, given the number of tines on the left and right side?

* The input contains a single line with two integers ℓ and r, where 0 ≤ ℓ ≤ 20 is the number of tines on the left, and 0 ≤ r ≤ 20 is the number of tines on the right.

* Output a single line describing the moose. For even pointed moose, output “Even x” where x is the points of the moose. 
	For odd pointed moose, output “Odd x” where x is the points of the moose. If the moose has no tines, output “Not a moose”
*/

#include <stdio.h>

int main() {
	int L, R;
	scanf("%d %d", &L, &R);

	if (L == 0 && R == 0) {
		printf("Not a moose \n");
	}
	else if (L > R || R > L) {
		if (L > R) {
			printf("Odd %d \n", L * 2);
		}
		else {
			printf("Odd %d \n", R * 2);
		}
	}

	else {
		printf("Even %d \n", R * 2);

	}

	return 0;
}
