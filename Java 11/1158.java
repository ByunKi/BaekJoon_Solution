/*
 * 제출 번호: 45828214
 * ID: adviate
 * 문제: 1158
 * 결과: 맞았습니다!!
 * 메모리: 296280 KB
 * 시간: 612 ms
 * 언어: Java 11
 * 코드 길이: 745 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder ans = new StringBuilder();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), K = Integer.valueOf(input[1]), cnt = 0;
		
		for (int i = 0; i < N; i++) { queue.add(i + 1); }
		
		ans.append("<");
		while(!queue.isEmpty()) {
			if(cnt + 1 == K) {
				ans.append(queue.pop() + ", ");
				cnt = 0;
			}  else { 
				queue.add(queue.pop()); 
				cnt++;
			}
		}
		ans.setLength(ans.length() - 2);
		ans.append(">");
		System.out.println(ans);
	}
}
