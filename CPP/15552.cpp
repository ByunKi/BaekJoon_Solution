/*
 * 제출 번호: 37031492
 * ID: adviate
 * 문제: 15552
 * 결과: 맞았습니다!!
 * 메모리: 2020 KB
 * 시간: 228 ms
 * 언어: C++17
 * 코드 길이: 226 B
 */
 
 #include <iostream>

using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int TC;
	cin >> TC;
	for (int i = 0; i < TC; i++) {
		int a, b;
		cin >> a >> b;
		cout << a + b << '\n';
	}

	return 0;
}
