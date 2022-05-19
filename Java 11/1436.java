/*
 * 제출 번호: 43509071
 * ID: adviate
 * 문제: 1436
 * 결과: 맞았습니다!!
 * 메모리: 84608 KB
 * 시간: 288 ms
 * 언어: Java 11
 * 코드 길이: 374 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine()), cnt = 1, num = 666;

		while(cnt < N) {
			num++;
			if(Integer.toString(num).contains("666")) { cnt++; }
		}
		System.out.println(num);
	}
}
