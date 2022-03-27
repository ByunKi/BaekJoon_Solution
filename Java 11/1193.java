/*
 * 제출 번호: 41087247
 * ID: adviate
 * 문제: 1193
 * 결과: 맞았습니다!!
 * 메모리: 16052 KB
 * 시간: 156 ms
 * 언어: Java 11
 * 코드 길이: 532 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.valueOf(reader.readLine()), crossCnt = 1, prev = 0;
		while(true) {
			if(X <= prev + crossCnt) {
				if(crossCnt % 2 != 0) { System.out.println(crossCnt - (X - prev - 1) + "/" + (X - prev)); break; } 
				else { System.out.println((X - prev) + "/" + (crossCnt - (X - prev - 1))); break; }
			} else { prev += (crossCnt++); }
		}
	}
}
