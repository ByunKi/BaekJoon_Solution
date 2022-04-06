/*
 * 제출 번호: 41617098
 * ID: adviate
 * 문제: 14682
 * 결과: 맞았습니다!!
 * 메모리: 14172 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 386 B
 */


import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), K = Integer.valueOf(reader.readLine()), ans = N, pow = 10;
		for(int i = 0; i < K; i++) {
			ans += N * pow;
			pow *= 10;
		}
		System.out.println(ans);
	}
}
