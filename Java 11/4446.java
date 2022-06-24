/*
 * 제출 번호: 44973344
 * ID: adviate
 * 문제: 4446
 * 결과: 맞았습니다!!
 * 메모리: 14072 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 786 B
 */

import java.io.*;

public class Main {
	static final char[] ROT13 = {'E', 'P', 'L', 'R', 'A', 'G', 'F', 'S', 'O', 'X', 'V', 'C', 'W', 'T', 'I', 'B', 'Z', 'D', 'H', 'N', 'Y', 'K', 'M', 'J', 'U', 'Q'};

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		String input;
		
		while((input = reader.readLine()) != null) {
			char[] S = input.toCharArray();
			for(int i = 0; i < S.length; i++) {
				if(Character.isUpperCase(S[i])) { ans.append(ROT13[S[i] - 'A']); }
				else if(Character.isLowerCase(S[i])) { ans.append(Character.toLowerCase(ROT13[S[i] - 'a'])); }
				else { ans.append(S[i]); }
			}
			ans.append("\n");
		}
		System.out.println(ans);
	}
}
