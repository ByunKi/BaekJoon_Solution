/*
* 제출 번호: 33522364
* 아이디: adviate
* 문제: 20673
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 241B
* 제출한 시간: 2021.09.19 15:47:39
*/

/*
* The input consists of two lines. The first line contains an integer p (0 ⩽ p ⩽ 1000),
  showing the average number of new cases per day in every one million population in Hana’s city over the past two weeks. 
  The second line contains an integer q (0 ⩽ q ⩽ 500), 
  showing the average number of new hospitalizations per day in every one million population over the past two weeks in that city. 
  Note that q ⩽ p.

* In the output, print the color-code of Hana’s city. It must be either White, Yellow, or Red.
*/

#include <iostream>

using namespace std;

int main() {
	int p, q;
	cin >> p >> q;

	if (p <= 50 && q <= 10) {
		cout << "White" << endl;
	}
	else if (q >= 30) {
		cout << "Red" << endl;
	}
	else {
		cout << "Yellow" << endl;
	}
	return 0;
}
