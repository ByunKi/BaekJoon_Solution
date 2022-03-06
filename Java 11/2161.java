/*
 * 제출 번호: 40011006
 * ID: adviate
 * 문제: 2161
 * 결과: 맞았습니다!!
 * 메모리: 15004 KB
 * 시간: 184 ms
 * 언어: Java 11
 * 코드 길이: 500 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.valueOf(reader.readLine()), flag = 1;
		for(int i = 0; i < N; i++) { queue.add(i + 1); }
		
		while(!queue.isEmpty()) {
			if(flag > 0) { System.out.print(queue.poll() + " ");}
			else {queue.add(queue.poll());}
			flag *= -1;
		}
	}
}
