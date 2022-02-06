/*
 * 제출 번호: 38634448
 * ID: adviate
 * 문제: 5026
 * 결과: 맞았습니다!!
 * 메모리: 14888 KB
 * 시간: 180 ms
 * 언어: Java 11
 * 코드 길이: 571 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine();
			
			if(input.equals("P=NP")) { 
				System.out.println("skipped"); 
			} else {
				StringTokenizer tmp = new StringTokenizer(input, "+");
				System.out.println(Integer.parseInt(tmp.nextToken()) + Integer.parseInt(tmp.nextToken()));
			}
		}
 	}
}
