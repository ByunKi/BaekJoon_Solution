/*
1. X,Y 는 -10000 ~ 10000 사이의 정수
2. R은 1 ~ 10000 사이의 자연수
3. 접점이 무한대인 경우 -1을 출력한다. → 여기에서 혼동(접점이 없다고 생각해 버림. 아예 겹치는 것이 접점이 무한대임을 늦게 깨달음.)
*/

#include <stdio.h>
#include <math.h>

int main() {
	int T, rst; // 테스트 케이스 및 전달 정수
	int x1, y1, r1; // 조규현 좌표
	int x2, y2, r2; // 백승환 좌표
	double distance, diff; // 두점 사이의 거리 및 반지름의 차

	scanf("%d", &T);

	while (T--) {
		scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);

		distance = (pow((x1 - x2), 2) + pow((y1 - y2), 2)); // 2번째 정답 (자료형이 달라서 오류가 날 수도 있다. → 루트를 사용하지 않고 비교)
		diff = pow((r1 - r2),2);

		if (distance == 0 && pow(r1, 2) == pow(r2, 2)) {
			rst = -1;
		} // 접점이 무수히 많다.
		else if (distance <  pow((r1 + r2), 2) && distance > diff) {
			rst = 2;
		} // 접점이 2개인 경우
		else if (distance == pow((r1 + r2), 2) || distance == diff) {
			rst = 1;
		} // 접점이 1개인 경우, 내접하는 경우
		else {
			rst = 0;
		} // 접점이 없다.

		printf("%d\n",rst);
	}

	return 0;
}
