/*
1. n == 동등하게 나우어줄 돈의 양, m == 1원씩 분배를 해줄 수 없는 나머지 금액
2. 1 ≤ m ≤ n ≤ 10^1000, m과 n은 10진수 정수
3. 최대 숫자가 너무 큰데? 문자열을 사용하여 구현???
*/

#include <iostream>

using namespace std;

int main() {
	int n, m;
	cin >> n >> m;

	if (m > 1) {
		cout << n / m << endl;
		cout << n % m << endl;
	}

	return 0;
}
