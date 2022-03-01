/*
 * 제출 번호: 39808740
 * ID: adviate
 * 문제: 14581
 * 결과: 맞았습니다!!
 * 메모리: 15944 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 425 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) { System.out.print(":" + input + ":"); }
				else { System.out.print(":fan:"); }
			}
			System.out.println();
		}
	
