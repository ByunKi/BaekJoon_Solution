/*
 * 제출 번호: 46019028
 * ID: adviate
 * 문제: 4949
 * 결과: 맞았습니다!!
 * 메모리: 19444 KB
 * 시간: 268 ms
 * 언어: Java 11
 * 코드 길이: 914 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String input;
		while(!(input = reader.readLine()).equals(".")) {
			boolean flag = true;
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == '(' || input.charAt(i) == '[') { stack.push(input.charAt(i)); }
				else if(input.charAt(i) == ')') {
					if(stack.isEmpty() || stack.peek() != '(') { flag = false; break; }
					else { stack.pop(); }
				}
				else if(input.charAt(i) == ']') {
					if(stack.isEmpty() || stack.peek() != '[') { flag = false; break; }
					else { stack.pop(); }
				}
			}
			ans.append((flag && stack.isEmpty()) ? "yes" : "no").append("\n");
		}
		System.out.println(ans);
	}
}
