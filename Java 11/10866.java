/*
 * 제출 번호: 43016821
 * ID: adviate
 * 문제: 10866
 * 결과: 맞았습니다!!
 * 메모리: 20188 KB
 * 시간: 248 ms
 * 언어: Java 11
 * 코드 길이: 1154 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		LinkedList<Integer> deque = new LinkedList<>();

		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");

			switch(input[0]) {
				case "push_front": deque.add(0, Integer.valueOf(input[1])); break;
				case "push_back": deque.add(Integer.valueOf(input[1])); break;
				case "pop_front": ans.append(deque.size() > 0 ? (deque.pollFirst() + "\n") : (-1 + "\n")); break;
				case "pop_back": ans.append(deque.size() > 0 ? (deque.pollLast() + "\n") : (-1 + "\n")); break;
				case "size": ans.append(deque.size() + "\n"); break;
				case "empty": ans.append(deque.isEmpty() ? (1 + "\n") : (0 + "\n")); break;
				case "front": ans.append(deque.size() > 0 ? (deque.peekFirst() + "\n") : (-1 + "\n")); break;
				case "back": ans.append(deque.size() > 0 ? (deque.peekLast() + "\n") : (-1 + "\n")); break;
			}
		}
		System.out.println(ans);
	}
}
