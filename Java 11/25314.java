/*
 * 제출 번호: 45428219
 * ID: adviate
 * 문제: 25314
 * 결과: 맞았습니다!!
 * 메모리: 14148 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 387 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N/4; i++) {
			ans.append("long ");
		}
		ans.append("int \n");
		System.out.println(ans);
	}
}
