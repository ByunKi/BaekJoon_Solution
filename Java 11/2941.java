/*
 * 제출 번호: 44020825
 * ID: adviate
 * 문제: 2941
 * 결과: 맞았습니다!!
 * 메모리: 14260 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 883 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		String str = reader.readLine();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if(ch == 'c' && i < str.length() - 1) {
				if(str.charAt(i + 1) == '-' || str.charAt(i + 1) == '=') { i++; }
			}

			if(ch == 'd' && i < str.length() - 1) {
				if(str.charAt(i + 1) == '-') { i++; }
				else if(str.charAt(i + 1) == 'z' && i < str.length() - 2) {
					if(str.charAt(i + 2) == '=') { i += 2; }
				}
			}

			if((ch == 'n' || ch == 'l') && i < str.length() - 1) {
				if(str.charAt(i + 1) == 'j') { i++; }
			}

			if((ch == 's' || ch == 'z') && i < str.length() - 1) {
				if(str.charAt(i + 1) == '=') { i++; }
			}
			cnt++;	
		}
		System.out.println(cnt);
	}
}
