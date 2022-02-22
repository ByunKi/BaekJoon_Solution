/*
 * 제출 번호: 39451397
 * ID: adviate
 * 문제: 15719
 * 결과: 맞았습니다!!
 * 메모리: 507392 KB
 * 시간: 1384 ms
 * 언어: Java 11
 * 코드 길이: 489 B
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long length = Long.parseLong(reader.readLine());
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		
		long sum = length * (1 - length) / 2;
		while((length--) > 0) { sum += Long.parseLong(tokenizer.nextToken()); }
		
		System.out.println(sum);
	}
}
