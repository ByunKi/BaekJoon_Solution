/*
* 제출 번호:
* 아이디:
* 문제: 21638
* 메모리:
* 시간:
* 언어: C++17
* 코드 길이:
* 제출한 시간: 2021.09.10 
*/

/*
* 내일 기온이 음수이고 풍속이 초속 10미터 이상일 경우
* 내일 기온이 오늘보다 낮으면 한파 주의보 메시지를 보내야 합니다. 
* 내일 풍속이 오늘보다 높을 경우 강풍 주의보 메시지를 보내야 합니다.
* 위의 조건 중 어느 것도 충족되지 않으면 메시지를 보낼 필요가 전혀 없습니다.
* 
* The first line of input contains two integers t1 and v1 --- the temperature and the wind speed for today
* The second line contains two integers t2 and v2 --- the temperature and the wind speed for tomorrow
* (-50 <= t1,t2 <= 50,  0 <= v1,v2 <= 20$)
*/

/*
#include <iostream>
using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	int t1, v1, t2, v2;
	cin >> t1 >> v1 >> t2 >> v2;

	if (t2 < 0 && v2 >= 10)
	{
		cout << "A storm warning for tomorrow! Be careful and stay home if possible!\n";

		return 0;
	}

	if (t2 < t1)
	{
		cout << "MCHS warns! Low temperature is expected tomorrow.\n";

		return 0;
	}

	if (v1 < v2)
	{
		cout << "MCHS warns! Strong wind is expected tomorrow.\n";

		return 0;
	}

	cout << "No message\n";

	return 0;
}
뭐가 다른거지???
*/

#include <iostream>

using namespace std;

int main() {
	int v1, v2, t1, t2;
	cin >> t1 >> v1 >> t2 >> v2;


	if (t2 < 0 && v2 >= 10) {
		cout << "A storm warning for tomorrow! Be careful and stay home if possible!" << endl;
		return 0;
	}
	else if (t2 < t1) {
		cout << "MCHS warns! Low temperature is expected tomorrow." << endl;
		return 0;
	}
	else if (v2 > v1) {
		cout << "MCHS warns! Strong wind is expected tomorrow."  << endl;
		return 0;
	}

	cout << "No message" << endl;
	return 0;
}
