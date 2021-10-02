/*
제출 번호: 33974667
아이디: adviate
문제: 16600
결과: 맞았습니다!!
메모리: 1128KB
시간: 0ms
언어: C99
코드 길이: 138B
제출한 시간: 2021.10.02 15:59:44
*/

/*
*Today we are exploring whether we can modify one of our perfectly-square picture frames to include an electrical filament.
	The purpose of this filament is so that the image can set itself alight at some opportune and hilarious moment—for example, in the middle of a sale by auction.
	You will be responsible for buying the filament to run around the entire perimeter of the artwork.
	How many centimetres will you need to obtain?

* One line with an integer a (1 ≤ a ≤ 10^18), the area of the image in square centimetres.

* Output the total length of filament needed for the frame, in centimetres. 
	Your answer should have an absolute or relative error of at most 10^−6.
*/

#include <stdio.h>
#include <math.h>

int main() {
	double area;
	scanf("%lf", &area);

	printf("%.8lf \n", sqrt(area) * 4);

	return 0;
}
