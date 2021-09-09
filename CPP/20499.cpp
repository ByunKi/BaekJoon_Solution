/*
* 제출 번호: 33189738
* 아이디: adviate
* 문제: 20499
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 579B
* 제출한 시간: 2021.09.10 03:45:56
*/

/*
* K+A < D 거나 D == 0 이면 가짜
* 3개의 변수 K,D,A 가 주어진다.
* 진짜이면 gosu 가짜이면 hasu를 출력한다.
* 0 <= K,D,A <= 20
*/

#include <iostream>

using namespace std;

int main() {
	int K, D, A;
	// cin >> K >> D >> A;
	scanf("%d/%d/%d", &K, &D, &A);

	if ((K + A) < D || D == 0) {
		cout << "hasu" << endl;
	}
	else {
		cout << "gosu" << endl;
	}

	return 0;
}
