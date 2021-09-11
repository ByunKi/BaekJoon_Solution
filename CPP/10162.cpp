#include <iostream>

using namespace std;

int main() {
	int T; // 초로 주어진다.
	int A, B, C;
	cin >> T;

	if (T % 10 != 0) {
		cout << -1 << endl;
		return 0;
	}

	A = T / 300;
	T %= 300;

	B= T / 60;
	T %= 60;

	C = T / 10;

	printf("%d %d %d \n", A, B, C);
	return 0;
}
