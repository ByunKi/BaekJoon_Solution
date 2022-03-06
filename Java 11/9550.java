/*
 * 제출 번호: 40001595
 * ID: adviate
 * 문제: 9550
 * 결과: 맞았습니다!!
 * 메모리: 14988 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 644 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.valueOf(input[0]), K = Integer.valueOf(input[1]), cnt = 0;
			
			input = reader.readLine().split(" ");
			int[] arr = new int[N];
			for(int j = 0; j < arr.length; j++) { arr[j] = Integer.valueOf(input[j]); }
			
			for(int j = 0; j < arr.length; j++) { cnt += (arr[j] / K); }
			System.out.println(cnt);
		}
	}
}
