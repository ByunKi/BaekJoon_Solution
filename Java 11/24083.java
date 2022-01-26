/*
 * 제출 번호: 38150913
 * ID: adviate
 * 문제: 24083
 * 결과: 맞았습니다!!
 * 메모리: 14232 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 390 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(reader.readLine()), B = Integer.parseInt(reader.readLine());
		
		int time = A + B;
		if(time > 12) { time %= 12; }
		if(time == 0) { time = 12; }
		
		System.out.println(time);
 	}
}
