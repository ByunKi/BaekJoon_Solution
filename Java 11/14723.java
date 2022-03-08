/*
 * 제출 번호: 40103169
 * ID: adviate
 * 문제: 14723
 * 결과: 맞았습니다!!
 * 메모리: 16100 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 507 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<int[]> list = new ArrayList<>();
		
		int N = Integer.valueOf(reader.readLine()), cnt = 0, sum = 2;
		while(cnt < N) {
			for(int i = (sum - 1); i > 0; i--) {
				list.add(new int[] {i, sum - i});
				cnt++;
			}
			sum++;
		}
		System.out.println(list.get(N-1)[0] + " " + list.get(N-1)[1]);
	}
}
