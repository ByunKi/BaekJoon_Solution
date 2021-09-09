/*
* 제출 번호: 33189454
* 아이디: adviate
* 문제: 10101
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 746B
* 제출한 시간: 2021.09.10 03:35:14
*/

/*
* 총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다.
* 모든 정수는 0보다 크고, 180보다 작다.
*/

#include <iostream>

using namespace std;

int main() {
	int a, b, c;
	cin >> a >> b >> c;

	if (a == 60 && b == 60 && c == 60) {
		cout << "Equilateral" << endl;
		return 0;
	}

	if (a + b + c == 180) {
		if (a == b || c == b || a == c) {
			cout << "Isosceles" << endl;
			return 0;
		}

		else if ((a != b) || (b != c) || (a != c)) {
			cout << "Scalene" << endl;
			return 0;
		}
	}
	else {
		cout << "Error" << endl;
		return 0;
	}
}
