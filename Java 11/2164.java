/*
 * 제출 번호: 40011821
 * ID: adviate
 * 문제: 2164
 * 결과: 맞았습니다!!
 * 메모리: 45596 KB
 * 시간: 192 ms
 * 언어: Java 11
 * 코드 길이: 515 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.valueOf(reader.readLine()), flag = 1;
		for(int i = 0; i < N; i++) { queue.add(i + 1); }
		
		while(queue.size() > 1) {
			if(flag > 0) { queue.poll(); }
			else { queue.add(queue.poll()); }
			flag *= -1;
		}
		System.out.println(queue.peek());
	}
}
