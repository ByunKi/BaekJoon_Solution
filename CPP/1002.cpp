#include <iostream>
#include <math.h>

using namespace std;

int main() {
	int T, rst;
	int x1, y1, r1; // 1번 터렛
	int x2, y2, r2; // 2번 터렛

	cin >> T;

	while (T--) {
		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;

		double distance = pow((x1 - x2), 2) + pow((y1 - y2), 2);
		double diff = pow((r1 - r2), 2);

		if (distance == 0 && diff == 0) {
			rst = -1;
		}
		else if (distance < pow((r1+r2),2) && distance > diff) { // 제곱의 합과 합의 제곱은 다르다!!!
			rst = 2;
		}
		else if (distance == pow((r1 + r2), 2) || distance == diff) {
			rst = 1;
		}
		else {
			rst = 0;
		}

		cout << rst << endl;
	}

	return 0;
}
