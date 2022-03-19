/*
 * 제출 번호: 40702095
 * ID: adviate
 * 문제: 21867
 * 결과: 맞았습니다!!
 * 메모리: 29616 KB
 * 시간: 316 ms
 * 언어: Java 11
 * 코드 길이: 482 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(reader.readLine());
		String S = reader.readLine();
		
		if(S.contains("J")) { S = S.replaceAll("J", ""); }
		if(S.contains("A")) { S = S.replaceAll("A", ""); }
		if(S.contains("V")) { S = S.replaceAll("V", ""); }
		
		System.out.println(S.length() == 0 ? "nojava" : S);
	}
}
