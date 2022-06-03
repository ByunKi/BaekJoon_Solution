/*
 * 제출 번호: 44129410
 * ID: adviate
 * 문제: 14467
 * 결과: 맞았습니다!!
 * 메모리: 14184 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 651 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<>();
		
		int TC = Integer.valueOf(reader.readLine()), cnt = 0;
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			if(map.containsKey(input[0])) {
				if(map.get(input[0]).equals("1") && input[1].equals("0")) { cnt++; }
				else if(map.get(input[0]).equals("0") && input[1].equals("1")) { cnt++; }
			}
			map.put(input[0], input[1]);
		}
		System.out.println(cnt);
	}
}
