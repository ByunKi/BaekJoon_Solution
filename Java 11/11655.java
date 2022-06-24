/*
 * 제출 번호: 44949478
 * ID: adviate
 * 문제: 11655
 * 결과: 맞았습니다!!
 * 메모리: 14192 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 723 B
 */

import java.io.*;

public class Main {
	static final char[] ROT13_Upper = {'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		char[] S = reader.readLine().toCharArray();
		for(int i = 0; i < S.length; i++) {
			if(Character.isUpperCase(S[i])) { ans.append(ROT13_Upper[S[i] - 'A']); }
			else if(Character.isLowerCase(S[i])) { ans.append(Character.toLowerCase(ROT13_Upper[S[i] - 'a'])); }
			else { ans.append(S[i]); }
		}
		System.out.println(ans);
	}
}
