/*
* 제출 번호: 43780780
* 아이디: adviate
* 문제: 14729
* 결과: 맞았습니다!!
* 메모리: 198644 KB
* 시간: 6812 ms
* 언어: C++17
* 코드 길이: 421 B
*/

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;

    vector<double> v;
    for(int i = 0; i < N; i++) { 
        double input;
        cin >> input;
        v.push_back(input); 
    }
    sort(v.begin(), v.end());
    
    cout << fixed;
    cout.precision(3);
    for(int i = 0; i < 7; i++) {
       cout << v[i] << endl;
    }
    
    return 0;
}
