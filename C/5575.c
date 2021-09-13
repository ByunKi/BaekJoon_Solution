/*
제출 번호: 33306315
아이디: adviate
문제: 5575
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 996B 
제출한 시간: 2021.09.13 18:40:39
*/

#include <stdio.h>

typedef struct WH {
	int StartingHour, StartingMinute, StartingSecond;
	int EndingHour, EndingMinute, EndingSecond;
} WH;

int main() {
	WH ary[3];

	for (int  i = 0; i < 3; i++) {
		scanf("%d %d %d %d %d %d", &ary[i].StartingHour, &ary[i].StartingMinute, &ary[i].StartingSecond, &ary[i].EndingHour, &ary[i].EndingMinute, &ary[i].EndingSecond);
		
		if (ary[i].StartingSecond > ary[i].EndingSecond) {
			ary[i].EndingMinute--;
			ary[i].EndingSecond += 60;
		}

		if (ary[i].StartingMinute > ary[i].EndingMinute) {
			ary[i].EndingHour--;
			ary[i].EndingMinute += 60;
		}

		ary[i].EndingHour -= ary[i].StartingHour;
		ary[i].EndingMinute -= ary[i].StartingMinute;
		ary[i].EndingSecond -= ary[i].StartingSecond;
	}

	for (int i = 0; i < 3; i++) {
		printf("%d %d %d \n", ary[i].EndingHour, ary[i].EndingMinute, ary[i].EndingSecond);
	}

	return 0;
}
