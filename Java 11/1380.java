/*
 * 제출 번호: 42594256
 * ID: adviate
 * 문제: 1380
 * 결과: 맞았습니다!!
 * 메모리: 16076 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 751 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = 1;

		while(true) {
			int N = Integer.valueOf(reader.readLine());
			if(N == 0) { break; }

			String[] names = new String[N];
			int[] tmp = new int[N];
			for(int i = 0; i < names.length; i++) { names[i] = reader.readLine(); }

			for(int i = 0; i < 2 * N - 1; i++) {
				String[] input = reader.readLine().split(" ");
				tmp[Integer.valueOf(input[0]) - 1]++;
			}

			int idx = 0;
			for(int i = 0; i < tmp.length; i++) {
				if(tmp[idx] > tmp[i]) { idx = i; }
			}

			System.out.println((cases++) + " " + names[idx]);
		}
	}
}
