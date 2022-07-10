/*
 * 제출 번호: 45826511
 * ID: adviate
 * 문제: 18258
 * 결과: 맞았습니다!!
 * 메모리: 345048 KB
 * 시간: 1632 ms
 * 언어: Java 11
 * 코드 길이: 951 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			switch(input[0]) {
				case "push": queue.add(Integer.valueOf(input[1])); break;
				case "pop": ans.append(queue.isEmpty() ? -1 : queue.pop()).append("\n"); break;
				case "size": ans.append(queue.size()).append("\n"); break;
				case "empty": ans.append(queue.isEmpty() ? 1 : 0).append("\n"); break;
				case "front": ans.append(queue.isEmpty() ? -1 : queue.peek()).append("\n"); break;
				case "back": ans.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n"); break;
			}
		}
		System.out.println(ans);
	}
}
