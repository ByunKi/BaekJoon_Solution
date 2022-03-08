/*
 * 제출 번호: 40149428
 * ID: adviate
 * 문제: 9437
 * 결과: 맞았습니다!!
 * 메모리: 16200 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 676 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			if(input[0].equals("0")) { break; }
			int N = Integer.valueOf(input[0]), P = Integer.valueOf(input[1]);
			
			int[] arr = new int[3];
			if(P % 2 == 0) {
				arr[0] = P - 1;
				arr[1] = N - (P - 1);
				arr[2] = N - (P - 2);
			} else {
				arr[0] = P + 1;
				arr[1] = N - P;
				arr[2] = N - (P - 1);
			}
			
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		}
	}
}
