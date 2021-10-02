/*
제출 번호: 33972916
아이디: adviate
문제: 14173
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 676B
제출한 시간: 2021.10.02 15:16:22
*/

/*
* Farmer John has decided to update his farm to simplify its geometry. 
	Previously, his cows grazed in two rectangular fenced-in pastures. 
	Farmer John would like to replace these with a single square fenced-in pasture of minimum size 
	that still covers all the regions of his farm that were previously enclosed by the former two fences.

* minimum area he needs to make his new square pasture
	it can still cover all the area formerly covered by the two older rectangular pastures.
	The square pasture should have its sides parallel to the x and y axes.

* The first line in the input file specifies one of the original rectangular pastures with four space-separated integers x1 y1 x2 y2
	each in the range 0…10
	lower-left corner of the pasture is at the point (x1,y1)
	the upper-right corner is at the point (x2,y2), where x2>x1 and y2>y1.
	The second line of input has the same 4-integer format as the first line, and specifies the second original rectangular pasture.
	This pasture will not overlap or touch the first pasture.

* The output should consist of one line containing the minimum area required of a square pasture
	that would cover all the regions originally enclosed by the two rectangular pastures.
*/

#include <stdio.h>

typedef struct {
	int x1, y1;
	int x2, y2;
} rect; // 직사각형 구조체

int main() {
	rect r1, r2;
	scanf("%d %d %d %d", &r1.x1, &r1.y1, &r1.x2, &r1.y2); // 1번 직사각형
	scanf("%d %d %d %d", &r2.x1, &r2.y1, &r2.x2, &r2.y2); // 2번 직사각형
	
	int SQx, SQy;

	if (r2.x2 >= r1.x2) {
		SQx = r2.x2;
	}
	else {
		SQx = r1.x2;
	}

	if (r2.x1 <= r1.x1) {
		SQx -= r2.x1;
	}
	else {
		SQx -= r1.x1;
	}

	if (r2.y2 >= r1.y2) {
		SQy = r2.y2;
	}
	else {
		SQy = r1.y2;
	}

	if (r2.y1 <= r1.y1) {
		SQy -= r2.y1;
	}
	else {
		SQy -= r1.y1;
	}

	if (SQx >= SQy) {
		printf("%d \n",SQx * SQx);
	}
	else {
		printf("%d \n", SQy * SQy);
	}

	return 0;
}
