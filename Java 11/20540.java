/*
 * 제출 번호: 39630929
 * ID: adviate
 * 문제: 20540
 * 결과: 맞았습니다!!
 * 메모리: 14232 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 729 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String input = reader.readLine();
		if(input.charAt(0) == 'E') { ans.append("I"); }
		else if(input.charAt(0) == 'I') { ans.append("E"); };
		
		if(input.charAt(1) == 'S') { ans.append("N"); }
		else if(input.charAt(1) == 'N') { ans.append("S"); };
		
		if(input.charAt(2) == 'T') { ans.append("F"); }
		else if(input.charAt(2) == 'F') { ans.append("T"); };
		
		if(input.charAt(3) == 'P') { ans.append("J"); }
		else if(input.charAt(3) == 'J') { ans.append("P"); };
		
		System.out.println(ans);
	}
}
