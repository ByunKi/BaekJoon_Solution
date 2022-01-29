/*
* 제출 번호: 38302707
* 아이디: adviate
* 문제: 18883
* 결과: 맞았습니다!!
* 메모리: 2020 KB
* 시간: 100 ms
* 언어: C++17
* 코드 길이: 304 B
*/

#include <iostream>

using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int p, q, num = 1;
	cin >> p >> q;

	for (int i = 0; i < p; i++) {
		for (int j = 0; j < q; j++) {
			if (j == q - 1) { cout << num++ << "\n"; }
			else { cout << num++ << " "; }
		}
	}

	return 0; 
}
