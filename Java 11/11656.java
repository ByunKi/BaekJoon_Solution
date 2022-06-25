/*
 * 제출 번호: 45014311
 * ID: adviate
 * 문제: 11656
 * 결과: 맞았습니다!!
 * 메모리: 17764 KB
 * 시간: 172 ms
 * 언어: Java 11
 * 코드 길이: 534 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		TreeSet<String> set = new TreeSet<>();
		
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) { set.add(input.substring(i)); }
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) { ans.append(it.next()).append("\n"); }
		System.out.println(ans);
	}
}
