/*
 * 제출 번호: 35837901
 * ID: adviate
 * 문제: 22938
 * 결과: 맞았습니다!!
 * 메모리: 17736 KB
 * 시간:  212 ms
 * 언어: Java 11
 * 코드 길이: 889 B
 */

import java.util.*;

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	long GetDistance(Point p) {
		long distanceX = (long) Math.pow((x - p.x), 2);
		long distanceY = (long) Math.pow((y - p.y), 2);
		return (long) Math.sqrt(distanceX + distanceY);
	}
	
}

class Circle {
	Point center;
	int radius;
	
	Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
}

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c1 = new Circle(new Point(scanner.nextInt(), scanner.nextInt()), scanner.nextInt());
		Circle c2 = new Circle(new Point(scanner.nextInt(), scanner.nextInt()), scanner.nextInt());
		
		if(c1.radius + c2.radius > c1.center.GetDistance(c2.center)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		scanner.close();
	}
}
