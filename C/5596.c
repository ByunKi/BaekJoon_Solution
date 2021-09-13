/*
제출 번호: 33307097
아이디: adviate
문제: 5596
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 580B 
제출한 시간: 2021.09.13 19:09:02
*/

#include <stdio.h>

int main() {
	int ary1[4], ary2[4], rst1 = 0, rst2 = 0;
	scanf("%d %d %d %d", &ary1[0], &ary1[1], &ary1[2], &ary1[3]);
	scanf("%d %d %d %d", &ary2[0], &ary2[1], &ary2[2], &ary2[3]);

	for (int i = 0; i < 4; i++) {
		rst1 += ary1[i];
		rst2 += ary2[i];
	}

	if (rst1 > rst2) {
		printf("%d \n",rst1);
	}
	else if (rst2 >= rst1) {
		printf("%d \n", rst2);
	}

	return 0;
}
