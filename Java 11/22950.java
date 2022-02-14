/*
 * 제출 번호: 39056315
 * ID: adviate
 * 문제: 22950
 * 결과: 맞았습니다!!
 * 메모리: 20088 KB
 * 시간: 272 ms
 * 언어: Java 11
 * 코드 길이: 619 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		String M = reader.readLine();
		int K = Integer.parseInt(reader.readLine());
		boolean flag = false;
		
		if(!M.contains("1")) { flag = true; }
		if(K == 0) { flag = true; }
		
		int cnt = 0;
		for(int i = M.length() - 1; i >= 0; i--) {
			if(M.charAt(i) == '1') { break; }
			else { cnt++; }
		}
		
		if(cnt >= K) { flag = true; }
		System.out.println(flag == true ? "YES" : "NO");
	}
}
