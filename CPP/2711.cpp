/*
* 제출 번호: 38303033
* 아이디: adviate
* 문제: 2711
* 결과: 맞았습니다!!
* 메모리: 2024 KB
* 시간: 0 ms
* 언어: C++17
* 코드 길이: 323 B
*/

#include <iostream>

using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int TC;
	cin >> TC;

	for (int i = 0; i < TC; i++) {
		int idx;
		string str;
		cin >> idx >> str;

		for (int j = 0; j < str.length(); j++) {
			if (j != idx-1) { cout << str[j]; }
		}
		cout << endl;
	}

	return 0; 
}
