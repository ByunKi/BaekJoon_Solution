/*
 * 제출 번호: 39150375
 * ID: adviate
 * 문제: 2998
 * 결과: 맞았습니다!!
 * 메모리: 14216 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 916 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		String input = reader.readLine();
		
		if(input.length() % 3 == 1) { input = "00" + input; }
		else if(input.length() % 3 == 2) { input = "0" + input; }
		
		for(int i = 0; i < input.length(); i += 3) {
			switch(input.substring(i, i + 3)) {
				case "000":
					ans.append(0);
					break;
				case "001":
					ans.append(1);
					break;
				case "010":
					ans.append(2);
					break;
				case "011":
					ans.append(3);
					break;
				case "100":
					ans.append(4);
					break;
				case "101":
					ans.append(5);
					break;
				case "110":
					ans.append(6);
					break;
				case "111":
					ans.append(7);
					break;
				default:
					break;
			}
		}
		System.out.println(ans);
	}
}
