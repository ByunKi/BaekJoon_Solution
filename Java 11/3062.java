/*
 * 제출 번호: 39057767
 * ID: adviate
 * 문제: 3062
 * 결과: 맞았습니다!!
 * 메모리: 14088 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 720 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine();
			boolean flag = false;
			int num = Integer.parseInt(input) + Integer.parseInt(new StringBuffer(input).reverse().toString());
			
			String tmp = Integer.toString(num);
			int begin = 0, end = input.length() - 1;
			
			for(int j = 0; j < tmp.length() / 2; j++) {
				if(tmp.charAt(begin) != tmp.charAt(end)) { flag = true; } 
				begin++;
				end--;
			}
			
			System.out.println(flag == false ? "YES" : "NO");
		}
	}
}
