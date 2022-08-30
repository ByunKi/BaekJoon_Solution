/*
 * 제출 번호: 48525988
 * ID: adviate
 * 문제: 15353
 * 결과: 맞았습니다!!
 * 메모리: 2168 KB
 * 시간: 4 ms
 * 언어: C++17
 * 코드 길이: 545 B
 */

#include <iostream>
#include <string>

using namespace std;

int main() {
	cin.tie(NULL);
	cout.tie(NULL);
	ios::sync_with_stdio(false);

	int c = 0;
	string a, b, rst = "";
	cin >> a >> b;

	while (a.length() > b.length()) { b = '0' + b; }
	while (b.length() > a.length()) { a = '0' + a; }

	for (int i = a.length()-1; i >= 0; i--) {
		int tmp = ((a[i] - '0') + (b[i] - '0') + c) % 10;
		rst = to_string(tmp) + rst;
		c = ((a[i] - '0') + (b[i] - '0') + c) / 10;
	}
	if (c != 0) { rst = to_string(c) + rst; }
	
	cout << rst << '\n';
	return 0;
}
