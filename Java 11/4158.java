/*
 * 제출 번호: 42831827
 * ID: adviate
 * 문제: 4158
 * 결과: 맞았습니다!!
 * 메모리: 330508 KB
 * 시간: 1128 ms
 * 언어: Java 11
 * 코드 길이: 667 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while(!(input = reader.readLine()).equals("0 0")) {
			Set<Integer> set = new HashSet<>();
			
			String[] tmp = input.split(" ");
			int N = Integer.valueOf(tmp[0]), M = Integer.valueOf(tmp[1]), cnt = 0;

			for(int i = 0; i < N; i++) { set.add(Integer.valueOf(reader.readLine())); }
			for(int i = 0; i < M; i++) {
				int num = Integer.valueOf(reader.readLine());
				if(set.contains(num)) { cnt++; }
			}
			System.out.println(cnt);
		}	
	}
}
