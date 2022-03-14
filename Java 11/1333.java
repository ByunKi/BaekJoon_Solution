/*
 * 제출 번호: 40436060
 * ID: adviate
 * 문제: 1333
 * 결과: 맞았습니다!!
 * 메모리: 14228 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 698 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Boolean> time = new ArrayList<>();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), L = Integer.valueOf(input[1]), D = Integer.valueOf(input[2]);
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < L; j++) { time.add(true); }
			
			if(i != N - 1) {
				for(int j = 0; j < 5; j++) { time.add(false); }
			}
		}
		
		int ans = 0;
		while(ans < time.size()) {
			if(!time.get(ans)) { break; }
			ans += D;
		}
		
		System.out.println(ans);
	}
}
