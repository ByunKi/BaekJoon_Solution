/*
* 제출 번호: 33521713
* 아이디: adviate
* 문제: 6778
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 387B
* 제출한 시간: 2021.09.19 15:28:23
*/

/*
* TroyMartian, who has at least 3 antenna and at most 4 eyes;
  VladSaturnian, who has at most 6 antenna and at least 2 eyes;
  GraemeMercurian, who has at most 2 antenna and at most 3 eyes.

* The first line contain the number of antenna that the witness claimed to have seen on the alien. 
  The second line contain the number of eyes seen on the alien.

* The output will be the list of aliens who match the possible description given by the witness. 
  If no aliens match the description, there is no output.

* if문 활용해서 출력한다.
*/

#include <iostream>

using namespace std;

int main() {
	int antennas, eyes;
	cin >> antennas >> eyes;

	if (antennas >= 3 && eyes <= 4) {
		cout << "TroyMartian" << endl;
	} // TroyMartian
	if (antennas <= 6 && eyes >= 2) {
		cout << "VladSaturnian" << endl;
	} // VladSaturnian
	if (antennas <= 2 && eyes <= 3) {
		cout << "GraemeMercurian" << endl;
	} // GraemeMercurian

	return 0;
}
