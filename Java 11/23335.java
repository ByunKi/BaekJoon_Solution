/*
 * 제출 번호: 46990251
 * ID: adviate
 * 문제: 23335
 * 결과: 맞았습니다!!
 * 메모리: 155600 KB
 * 시간: 3516 ms
 * 언어: Java 11
 * 코드 길이: 857 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		
		for(int i = 0; i < TC; i++) {
			int num = Integer.valueOf(input[i]), sum = num > 1 ? 1 : 0;
			for(int j = 2; j*j <= num; j++) {
				if(num % j == 0) {
					sum += j; 
					if(j * j != num) { sum += num/j; }
				}
			}

			if(sum > num) { ans.append("abundant"); }
			else if(sum == num) { ans.append("perfect"); }
			else { ans.append("deficient"); }
			ans.append("\n");
		}
		
		System.out.println(ans);
		reader.close();
		writer.close();
	}
}
