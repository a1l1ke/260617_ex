import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // if
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
        int score = sc.nextInt();
        // 0에서 100 사이의 값만 입력 가능
        if (score >= 0 && score <= 100) {
            System.out.println("당신의 점수는 " + score + "입니다");
        } else {
            System.out.println("0과 100 사이의 값을 입력하세요");
        }
        sc.close();
    }
}
