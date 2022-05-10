/*
 * 제출 번호: 43117887
 * ID: adviate
 * 문제: 11758
 * 결과: 맞았습니다!!
 * 메모리: 14236 KB
 * 시간: 200 ms
 * 언어: Java 11
 * 코드 길이: 806 B
 */

import java.io.*;

class Point {
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Point[] arr = new Point[3];
		for(int i = 0; i < 3; i++) {
			String[] input = reader.readLine().split(" ");
			arr[i] = new Point(Integer.valueOf(input[0]), Integer.valueOf(input[1]));
		}
		
		int ccw = func(arr);
		if(ccw > 0) { System.out.println(1); }
		else if(ccw == 0) { System.out.println(0); }
		else { System.out.println(-1); }
	}
	
	public static int func(Point[] arr) {
		return (arr[0].x * arr[1].y + arr[1].x * arr[2].y + arr[2].x * arr[0].y) - (arr[0].y * arr[1].x + arr[1].y * arr[2].x + arr[2].y * arr[0].x);
	}
}
