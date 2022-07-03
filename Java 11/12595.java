/*
 * 제출 번호: 45416883
 * ID: adviate
 * 문제: 12595
 * 결과: 맞았습니다!!
 * 메모리: 14968 KB
 * 시간: 160 ms
 * 언어: Java 11
 * 코드 길이: 859 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine()), num = 1;
		for(int i = 0; i < TC; i++) {
			HashSet<Integer> set = new HashSet<>();
			
			int N = Integer.valueOf(reader.readLine());
			String[] input = reader.readLine().split(" ");
			for(int j = 0; j < N; j++) {
				if(set.contains(Integer.valueOf(input[j]))) { set.remove(Integer.valueOf(input[j])); }
				else {set.add(Integer.valueOf(input[j])); }
			}
			
			ans.append("Case #" + num + ": ");
			Iterator<Integer> it = set.iterator();
			while(it.hasNext()) { ans.append(it.next() + " "); }
			ans.append("\n");
			num++;
		}
		System.out.println(ans);
	}
}
