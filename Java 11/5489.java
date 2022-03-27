/*
 * 제출 번호: 41087194
 * ID: adviate
 * 문제: 5489
 * 결과: 맞았습니다!!
 * 메모리: 14340 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 467 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10001];
		
		int N = Integer.valueOf(reader.readLine()), ans = 0;
		for(int i = 0; i < N; i++) { arr[Integer.valueOf(reader.readLine())]++; }
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[ans] < arr[i]) { ans = i; }
		}
		System.out.println(ans);
	}
}
