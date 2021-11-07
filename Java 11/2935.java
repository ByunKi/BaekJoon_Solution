// 제출 번호: 35153144
// 아이디: adviate
// 문제: 2935
// 문제 제목: 소음
// 결과: 맞았습니다!!
// 메모리: 17724KB
// 시간: 196ms
// 언어: Java 11
// 코드 길이: 591B
// 제출한 시간: 2021.11.07 11:46:13

import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(String.valueOf(scanner.nextLine()));
        String operator = new String(scanner.nextLine());
        BigInteger b = new BigInteger(String.valueOf(scanner.nextLine()));

        if(operator.equals("*")) {
            System.out.println(a.multiply(b));
        }
        else if(operator.equals("+")) {
            System.out.println(a.add(b));
        }

        scanner.close();
    }
}
