/*
 * 제출 번호: 40902188
 * ID: adviate
 * 문제: 10828
 * 결과: 맞았습니다!!
 * 메모리: 18652 KB
 * 시간: 360 ms
 * 언어: Java 11
 * 코드 길이: 804 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] stack = new int[10001];
		
		int N = Integer.valueOf(reader.readLine()), tos = 0;
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			
			switch(input[0]) {
				case "push": tos++; stack[tos] = Integer.valueOf(input[1]); break;
				case "pop":
					if(tos <= 0) {
						tos = 0;
						System.out.println(-1);
					} else {
						System.out.println(stack[tos--]);
					}
					break;
				case "size": System.out.println(tos); break;
				case "empty": System.out.println(tos == 0 ? "1" : "0"); break;
				case "top": System.out.println(tos <= 0 ? "-1" : stack[tos]); break;
			}
		}
	}
}
