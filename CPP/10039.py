/*
* 제출 번호: 33223729
* 아이디: adviate
* 문제: 10039
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 608B
* 제출한 시간: 2021.09.11 01:26:59
*/

/*
* 입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
* 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다. 
*/

#include <iostream>

using namespace std;

int main() {
	int scores[5] = { 0 }, rst = 0;
	
	for (int i = 0; i < 5; i++) {
		cin >> scores[i];
	}

	for (int i = 0; i < 5; i++) {
		if (scores[i] >= 40) {
			rst += scores[i];
		}
		else {
			rst += 40;
		}
	}

	cout << rst / 5 << endl;

	return 0;
}
