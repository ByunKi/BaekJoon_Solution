/*
 * 제출 번호: 43077637
 * ID: adviate
 * 문제: 11723
 * 결과: 맞았습니다!!
 * 메모리: 307580 KB
 * 시간: 1724 ms
 * 언어: Java 11
 * 코드 길이: 1059 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		HashSet<Integer> S = new HashSet<>(), tmp = new HashSet<>();
		for(int i = 1; i <= 20; i++) { tmp.add(i); }
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int num = input.length > 1 ? Integer.valueOf(input[1]) : 0;
			
			switch (input[0]) {
				case "add": if(!S.contains(num)) { S.add(num); } break;
				case "remove": if(S.contains(num)) { S.remove(num); } break;
				case "check": ans.append(S.contains(num) ? (1 + "\n") : (0 + "\n")); break;
				case "toggle": {
					if(S.contains(num)) { S.remove(num); }
					else { S.add(num); }
					break;
				}
				case "all": { 
					S.clear(); 
					S.addAll(tmp); 
					break;
				}
				case "empty": S.clear(); break;
				default: break;
			}
		}
		System.out.println(ans);
	}
}
