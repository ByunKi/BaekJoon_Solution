/*
 * 제출 번호: 44737667
 * ID: adviate
 * 문제: 23235
 * 결과: 맞았습니다!!
 * 메모리: 14576 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 364 B
 */

import java.io.*;

public class Main {	    
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("0")) { break; }
			System.out.println("Case " + (cnt++) + ": Sorting... done!");
		}
	}
}
