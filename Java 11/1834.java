/*
 * 제출 번호: 38951216
 * ID: adviate
 * 문제: 1834
 * 결과: 맞았습니다!!
 * 메모리: 14240 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 295 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		System.out.println(Long.toString((N * (N+1) / 2) * (N-1)));
	}
}

/*
 * N = 3 : 4 8 >> 12
 * N = 4 : 5 10 15 >> 30
 * N = 5 : 6 12 18 24 >> 60
 * N = 6 : 7 14 21 28 35 >> 105
 */
