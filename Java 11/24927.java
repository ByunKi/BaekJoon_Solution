/*
 * 제출 번호: 41300872
 * ID: adviate
 * 문제: 24937
 * 결과: 맞았습니다!!
 * 메모리: 14292 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 624 B
 */

import java.io.*;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		LinkedList<Character> queue = new LinkedList<>();
		
		String str = "SciComLove";
		for(int i = 0; i < str.length(); i++) { queue.add(str.charAt(i)); }
		
		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < (N % 10); i++) { queue.add(queue.poll()); }
		
		for(int i = 0; i < queue.size(); i++) { ans.append(queue.get(i)); }
		System.out.println(ans);
	}
}
