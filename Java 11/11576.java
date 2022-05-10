/*
 * 제출 번호: 43083374
 * ID: adviate
 * 문제: 11576
 * 결과: 맞았습니다!!
 * 메모리: 14276 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 748 B
 */

import java.io.*;
import java.util.Vector;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Vector<Integer> arr = new Vector<>();
		
		String[] input = reader.readLine().split(" ");
		int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]), tmp = 0;
		int m = Integer.valueOf(reader.readLine()) - 1;
		input = reader.readLine().split(" ");
		
		for(int i = 0; i < input.length; i++) {
			int num = Integer.valueOf(input[i]);
			tmp += (long) (Math.pow(A, m--) * num);
		}
		
		while(tmp != 0) {
			arr.add(tmp % B);
			tmp /= B;
		}
		
		for(int i = (arr.size() - 1); i >= 0; i--) { System.out.print(arr.get(i) + " "); }
	}
}
