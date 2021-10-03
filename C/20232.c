/*
제출 번호: 34001927
아이디: adviate
문제: 20232
결과: 맞았습니다!!
메모리:	1112KB
시간: 0ms
언어: C99
코드 길이: 623B
제출한 시간: 2021.10.03 12:33:51
*/

/*
* The team of problemsetters of Northwestern Russia Regional Contest welcomes you! 
	Our regional contest was founded in 1995 under the name "Collegiate Programming Championship of St Petersburg". 
	Here is the list of the contest winners:

    1995: ITMO
    1996: SPbSU
    1997: SPbSU
    1998: ITMO
    1999: ITMO
    2000: SPbSU
    2001: ITMO
    2002: ITMO
    2003: ITMO
    2004: ITMO
    2005: ITMO
    2006: PetrSU, ITMO
    2007: SPbSU
    2008: SPbSU
    2009: ITMO
    2010: ITMO
    2011: ITMO
    2012: ITMO
    2013: SPbSU
    2014: ITMO
    2015: ITMO
    2016: ITMO
    2017: ITMO
    2018: SPbSU
    2019: ITMO


* Help the contest archivist to remember the results of each contest and write a program
    that will read the year and print contest winners of that year in exactly the same format as above.

* The only line of input contains a single integer $y$ ($1995 \le y \le 2019$), denoting the year. 
    You don't need to process year numbers less than $1995$ or greater than $2019$, or incorrect year formats. 
    It is guaranteed that you will be given a number between $1995$ and $2019$, inclusive.

* Print the winner of the contest in year $y$ exactly in the same format as in the list above.
*/

#include <stdio.h>

static int Years[25] = { 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019 };
static char Names[25][20] = { "ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO" };

int main() {
	int inputYear;
	scanf("%d", &inputYear);

	for (int i = 0; i < 25; i++) {
		if (inputYear == Years[i]) {
			printf("%s \n",Names[i]);
			break;
		}
	}

	return 0;
}
