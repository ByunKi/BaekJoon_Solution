// 제출 번호: 35152639
// 아이디: adviate
// 문제: 2754
// 문제 제목: 학점계산
// 결과: 맞았습니다!!
// 메모리: 17640KB
// 시간: 220ms
// 언어: Java 11
// 코드 길이: 1910B
// 제출한 시간: 2021.11.07 11:17:45

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        double rst = 0;

        switch (grade.charAt(0)) {
            case 'A':
                rst += 4.0;
                switch (grade.charAt(1)) {
                    case '+':
                        rst += 0.3;
                        break;
                    case '-':
                        rst -= 0.3;
                        break;
                    default:
                        break;
                }
                break;
            case 'B':
                rst += 3.0;
                switch (grade.charAt(1)) {
                    case '+':
                        rst += 0.3;
                        break;
                    case '-':
                        rst -= 0.3;
                        break;
                    default:
                        break;
                }
                break;
            case 'C':
                rst += 2.0;
                switch (grade.charAt(1)) {
                    case '+':
                        rst += 0.3;
                        break;
                    case '-':
                        rst -= 0.3;
                        break;
                    default:
                        break;
                }
                break;
            case 'D':
                rst += 1.0;
                switch (grade.charAt(1)) {
                    case '+':
                        rst += 0.3;
                        break;
                    case '-':
                        rst -= 0.3;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        System.out.println(rst);
        scanner.close();
    }
}
