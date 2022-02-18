/*
 * 제출 번호: 39253179
 * ID: adviate
 * 문제: 9047
 * 결과: 맞았습니다!!
 * 메모리: 14372 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 758 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String num = reader.readLine();
			int cnt = 0;
			
			while(!num.equals("6174")) {
				char[] tmp = num.toCharArray();
				Arrays.sort(tmp);
				
				int max = 0, min = 0;
				for(int j = 0; j < tmp.length; j++) {
					min =  min * 10 + (tmp[j] - '0');
					max = max * 10 + (tmp[tmp.length - j - 1] - '0');
				}
				
				for(int j = 0; j < 4 - tmp.length; j++) { max *= 10; }
				num = String.valueOf(max - min);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
