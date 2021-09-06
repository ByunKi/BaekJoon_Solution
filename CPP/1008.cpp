/*
1. 두 정수 A, B를 입력받는다. (1 ~ 9)
2. A/B 를 출력한다.

○ 조작자 사용?
*/

#include <iostream>

using namespace std;

int main() {
	int a, b;
	cin >> a >> b;
	double rst = (double)a / (double)b;
	cout.precision(10); // 굳이 안맞춰도 된다면서..... 왜 소숫점 9자리까지 표현해야 되는거지?
	cout << fixed << rst << endl;

	return 0;
}
