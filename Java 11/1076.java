/*
 * 제출 번호: 35835406
 * ID: adviate
 * 문제: 1076
 * 결과: 맞았습니다!!
 * 메모리: 17740 KB
 * 시간:  216 ms
 * 언어: Java 11
 * 코드 길이: 1352 B
 */

import java.util.*;

class Colors {
	String value;
	long mul;
	
	Colors(String name) {
		switch (name) {
			case "black":
				this.value = "0";
				this.mul = 1;
				break;
				
			case "brown":
				this.value = "1";
				this.mul = 10;
				break;
				
			case "red":
				this.value = "2";
				this.mul = 100;
				break;
				
			case "orange":
				this.value = "3";
				this.mul = 1000;
				break;
				
			case "yellow":
				this.value = "4";
				this.mul = 10000;
				break;
				
			case "green":
				this.value = "5";
				this.mul = 100000;
				break;
				
			case "blue":
				this.value = "6";
				this.mul = 1000000;
				break;
				
			case "violet":
				this.mul = 10000000;
				this.value = "7";
				break;
				
			case "grey":
				this.value = "8";
				this.mul = 100000000;
				break;
				
			case "white":
				this.value = "9";
				this.mul = 1000000000;
				break;
				
			default:
				break;
		}
	}
}

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Colors[] arr = new Colors[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Colors(scanner.nextLine());
		}
		
		String sumValue = arr[0].value.toString();
		sumValue = sumValue.concat(arr[1].value.toString());
		long rst = Integer.valueOf(sumValue) * arr[2].mul;

		System.out.println(rst);
		
		scanner.close();
	}
}
