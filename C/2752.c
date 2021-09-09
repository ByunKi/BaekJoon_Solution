/*
제출 번호: 33182921
아이디:	adviate
문제: 2752
결과: 맞았습니다!!
메모리: 1112
시간: 0
언어: C99
코드 길이: 734
제출한 시간: 2021.09.09 22:37:53
*/

/*
1. 숫자 세 개가 주어진다. 이 숫자는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 숫자는 모두 다르다.
2. 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
3. 
*/

#include <stdio.h>

int main() {
	int ary[3], tmp;
	scanf("%d %d %d", &ary[0], &ary[1], &ary[2]);
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2 - i; j++) {
			if (ary[j] > ary[j + 1]) {
				tmp = ary[j];
				ary[j] = ary[j + 1];
				ary[j + 1] = tmp;
			}
		}
	}

	printf("%d %d %d \n", ary[0], ary[1], ary[2]);

	return 0;
}
