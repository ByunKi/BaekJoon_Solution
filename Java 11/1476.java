/*
 * 제출 번호: 43408744
 * ID: adviate
 * 문제: 1476
 * 결과: 맞았습니다!!
 * 메모리: 14204 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 542 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int E = Integer.valueOf(input[0]), S = Integer.valueOf(input[1]), M = Integer.valueOf(input[2]), cnt = 1;
		int e = 1, s = 1, m = 1;
		
		while(e != E || s != S || m != M) {
			e++; s++; m++; cnt++;
			if(e > 15) { e = 1; }
			if(s > 28) { s = 1; }
			if(m > 19) { m = 1; }
		}
		System.out.println(cnt);
	}
}
