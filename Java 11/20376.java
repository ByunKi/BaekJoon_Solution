/*
 * 제출 번호: 48350251
 * ID: adviate
 * 문제: 20376
 * 결과: 맞았습니다!!
 * 메모리: 183396 KB
 * 시간: 816 ms
 * 언어: Java 11
 * 코드 길이: 395 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		
		String input;
		while((input = reader.readLine()) != null) { set.add(input.substring(11)); }
		System.out.println(set.size());
		reader.close();
	}
}
