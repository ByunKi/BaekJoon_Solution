/*
 * 제출 번호: 39672617
 * ID: adviate
 * 문제: 5585
 * 결과: 맞았습니다!!
 * 메모리: 14228 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 556 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 1000 - Integer.valueOf(reader.readLine()), cnt = 0;
		while(input > 0) {
			if(input >= 500) { input -= 500; }
			else if(input >= 100) { input -= 100; }
			else if(input >= 50) { input -= 50; }
			else if(input >= 10) { input -= 10; }
			else if(input >= 5) { input -= 5; }
			else if(input >= 1) { input -= 1; }
			cnt++;
		}
		System.out.println(cnt);
	}
}
