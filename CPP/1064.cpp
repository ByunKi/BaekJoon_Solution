#include <iostream>
#include <cmath>

using namespace std;

/*
평형 사변형 : 마주보는 두 빗변이 평행, 길이도 같음.
두 빗변이 평행 기울기가 같음 <-> 세점이 한 직선에 위치해도 기울기가 같음. X

서로 다른 두 변은 나머지 변에 대하여 길이가 같다.
2개의 빗변 중, 최대와 최소를 빼면 얼추 나올 거 같음. 둘레면 * 2 해준다.
*/

int main() {
	int x1, y1, x2, y2, x3, y3;
	double m1, m2, m3;
	cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;

	m1 = hypot(x2 - x1, y2 - y1);
	m2 = hypot(x3 - x1, y3 - y1);
	m3 = hypot(x3 - x2, y3 - y2);
	// 빗변의 길이를 측정한다.

	if ((y2 - y1) * (x3 - x1) == (x2 - x1) * (y3 - y1)) {
		cout << -1 << endl;
		return 0;
	} // 대각선을 비교하여, 같으면 한 직선에 위치하므로 평행사변형이 아님.

	cout << fixed;
	cout.precision(16);
	cout << (max(m1, max(m2, m3)) - min(m1, min(m2, m3))) * 2 << endl;

	return 0;
}
