/*
 * 제출 번호: 45292612
 * ID: adviate
 * 문제: 1094
 * 결과: 맞았습니다!!
 * 메모리: 14220 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 376 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.valueOf(reader.readLine()), stick = 64, cnt = 0;
		while(X > 0) {
			if(stick > X) { stick /= 2; }
			else {
				X -= stick;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
