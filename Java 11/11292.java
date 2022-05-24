/*
 * 제출 번호: 43746066
 * ID: adviate
 * 문제: 11292
 * 결과: 맞았습니다!!
 * 메모리: 14288 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 847 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		LinkedHashMap<String, Double> map = new LinkedHashMap<>();
		
		int N;
		while((N = Integer.valueOf(reader.readLine())) != 0) {
			double max = -1d;
			for(int i = 0; i < N; i++) {
				String[] input = reader.readLine().split(" ");
				map.put(input[0], Double.valueOf(input[1]));
				if(Double.valueOf(input[1]) > max) { max = Double.valueOf(input[1]); }
			}
			
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String name = it.next();
				if(max == map.get(name)) { ans.append(name + " "); }
			}
			ans.append("\n");
			map.clear();
		}
		System.out.println(ans);
	}
}
