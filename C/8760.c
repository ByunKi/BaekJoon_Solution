/*
제출 번호: 34318116
아이디: adviate
문제: 8760
결과: 맞았습니다!!
메모리:	1112KB
시간: 0ms
언어: C99
코드 길이: 174B
제출한 시간: 2021.10.12 11:30:13
*/

/*
* W tej kryzysowej sytuacji kierownik schroniska był zmuszony zorganizować turystom nocleg na podłodze w głównej sali schroniska. 
	Sala ma postać prostokąta złożonego z W*K kwadratowych pól ułożonych w prostokąt o wymiarach W wierszy na K kolumn. 

* W pierwszej linii znajduje się liczba naturalna Z ( 1 <= Z <= 10 ) oznaczająca liczbę zestawów testowych. Następnie opisywane są kolejne zestawy.
	Opis pojedynczego zestawu testowego składa się z jednej linii zawierającej dwie oddzielone pojedynczą spacją dodatnie całkowite W i K (1 <= W, K <= 1000).

* Dla każdego zestawu testowego należy w osobnej linii wypisać maksymalną liczbę turystów którzy mogą jednocześnie przenocować w sali schroniska. 
	Kolejność wypisywanych odpowiedzi musi odpowiadać kolejności zestawów na wejściu.
*/

#include <stdio.h>

int main() {
	int TC, w, k;
	scanf("%d", &TC);

	for (int i = 0; i < TC; i++) {
		scanf("%d %d", &w, &k);
		printf("%d \n", (w * k) / 2);
	}

	return 0;
}
