/*
 * 제출 번호: 39260792
 * ID: adviate
 * 문제: 9933
 * 결과: 맞았습니다!!
 * 메모리: 15996 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 613 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine();
			String tmp = new StringBuffer(input).reverse().toString();
			
			if(input.equals(tmp) || list.contains(tmp)) { 
				System.out.println(input.length() + " " + input.charAt(input.length() / 2));
				break;
			} else { list.add(input); }
		}
	}
}
