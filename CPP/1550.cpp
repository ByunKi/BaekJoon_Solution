#include <iostream>
#include <string>
#include <math.h>

using namespace std;

// 조작자 이용
int main() {
	int input;
	cin >> hex >> input;
	cout << dec << input << endl;
	return 0;
}

//
/*
int main() {
	string input;
	cin >> input;

	int length = input.size(), sum = 0;
	int power = input.size() - 1; // 자릿수를 구해야 되기 때문에 -1

	for (int i = 0; i < length; i++) {
		switch (input[i]) {
			case'A':
				sum += (10 * pow(16, power--));
				break;
			case'B':
				sum += (11 * pow(16, power--));
				break;
			case'C':
				sum += (12 * pow(16, power--));
				break;
			case'D':
				sum += (13 * pow(16, power--));
				break;
			case'E':
				sum += (14 * pow(16, power--));
				break;
			case'F':
				sum += (15 * pow(16, power--));
				break;
			default:
				sum += (input[i] - 48) * pow(16, power--);
				break;
		}
	}

	cout << sum << endl;

	return 0;
}
*/
