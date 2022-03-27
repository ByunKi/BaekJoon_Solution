/*
 * 제출 번호: 41063539
 * ID: adviate
 * 문제: 10773
 * 결과: 맞았습니다!!
 * 메모리: 24280 KB
 * 시간: 232 ms
 * 언어: Java 11
 * 코드 길이: 575 B
 */

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N; i++) {
			int input = Integer.valueOf(reader.readLine());
			
			if(input == 0) { stack.pop(); }
			else { stack.add(input); }
		}
		
		long sum = 0;
		for(int i = 0; i < stack.size(); i++) { sum += stack.get(i); }
		System.out.println(sum);
    }
}
