/*
 * 제출 번호: 45968538
 * ID: adviate
 * 문제: 9012
 * 결과: 맞았습니다!!
 * 메모리: 14280 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 734 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			Boolean flag = true;
			Stack<Character> stack = new Stack<>();
			
			char[] input = reader.readLine().toCharArray();
			for(int j = 0; j < input.length; j++) {
				if(input[j] == '(') { stack.push('('); }
				else if(input[j] == ')' && stack.isEmpty()) { flag = false; }
				else { stack.pop(); }
			}
			ans.append(stack.isEmpty() && flag ? "YES" : "NO").append("\n");
		}
		System.out.println(ans);
	}
}
