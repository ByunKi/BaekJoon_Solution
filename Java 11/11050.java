/*
 * 제출 번호: 40665908
 * ID: adviate
 * 문제: 11050
 * 결과: 맞았습니다!!
 * 메모리: 14168 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 464 B
 */

import java.io.*;

public class Main {
	public static int factorial(int n) {
		if(n == 0) { return 1; }
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String N[] = reader.readLine().split(" ");
		int n = Integer.valueOf(N[0]), k = Integer.valueOf(N[1]);
		System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
	}
}
