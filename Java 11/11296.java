/*
 * 제출 번호: 37682953
 * ID: adviate
 * 문제: 11296
 * 결과: 맞았습니다!!
 * 메모리: 18056 KB
 * 시간: 256 ms
 * 언어: Java 11
 * 코드 길이: 1080 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			double price = scanner.nextDouble();
			String sticker = scanner.next();
			String coupon = scanner.next();
			String pay = scanner.next();
			
			switch(sticker) {
				case "R":
					price -= (price * 0.45);
					break;
				case "G":
					price -= (price * 0.30);
					break;
				case "B":
					price -= (price * 0.20);
					break;
				case "Y":
					price -= (price * 0.15);
					break;
				case "O":
					price -= (price * 0.1);
					break;
				case "W":
					price -= (price * 0.05);
					break;
				default:
					break;
			}
			
			if(coupon.equals("C")) { price -= (price * 0.05); }
			
			if(pay.equals("C")) {
				price *= 100;
				if((int) price % 10 > 5) {
					price = (price+10) - (price % 10);
				} else {
					price -= price % 10;
				}
				System.out.printf("$%.2f \n",(price / 100));
			} else {
				System.out.printf("$%.2f \n", price);
			}
		}
		scanner.close();
	}
}
