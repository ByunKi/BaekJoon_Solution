/*
 * 제출 번호: 43700795
 * ID: adviate
 * 문제: 1181
 * 결과: 맞았습니다!!
 * 메모리: 26892 KB
 * 시간: 408 ms
 * 언어: Java 11
 * 코드 길이: 631 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();

		TreeSet<String> set = new TreeSet<>();
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) { set.add(reader.readLine()); }

		Object[] elements = set.toArray();
		for(int i = 1; i <= 50; i++) {
			for(int j = 0; j < elements.length; j++) {
				if(elements[j].toString().length() == i) { ans.append(elements[j] + "\n"); }
			}
		}
		System.out.println(ans);
	}
}
