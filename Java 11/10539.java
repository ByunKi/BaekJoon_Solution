/*
 * 제출 번호: 42203439
 * ID: adviate
 * 문제: 10539
 * 결과: 맞았습니다!!
 * 메모리: 15796 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 523 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine()), prev = 0;
		String[] input = reader.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			int num = Integer.valueOf(input[i]);
			int tmp = (i + 1) * num - prev;
			
			ans.append(tmp + " ");
			prev += tmp;
		}
	
		System.out.println(ans);
	}
}
