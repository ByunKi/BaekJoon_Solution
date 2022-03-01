/*
 * 제출 번호: 39764822
 * ID: adviate
 * 문제: 2587
 * 결과: 맞았습니다!!
 * 메모리: 14196 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 462 B
 */
 
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5], sum = 0;
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = Integer.valueOf(reader.readLine());
			sum += arr[i]; 
		}
		
		System.out.println(sum / arr.length);
		Arrays.sort(arr);
		System.out.println(arr[arr.length / 2]);
	}
}
