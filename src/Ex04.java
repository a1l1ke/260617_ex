public class Ex04 {
    public static void main(String[] args) {
        // 연산자 (산술연산자, 대입연산자, 복합대입연산자, 삼항연산자, 비교연산자)
        // 논리연산자 -> 단축연산 (A || B -> A True면 종료, A && B -> A False면 종료)

        // 1. 정수의 나누기
        int a = 10;
        int b = 3;
        int c = a / b;
//        double c2 = (a + 0.0) / b;
        double c2 = (a * 1.0) / b;
//        double c2 = a / b; // 이 경우 int 계산은 계산대로 다 되고 형변환 되는 것이므로 소수점 유지가 X
        System.out.println("c = " + c);
        System.out.println("c2 = " + c2);
        int d = a % b;
        System.out.println("d = " + d);
        double e = 10.0;
        double f = e / b;
        System.out.println("f = " + f); // 연산에 참여하는 한쪽 이상이 나누기 연산 전 double 상태라면

        // 2. 제곱
        // JS
        // 2 ** 2 -> Java에는 이런것 X
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.pow(2, 0.5));
        System.out.println(Math.random()); // 0 이상인 1 미만의 값.
    }
}
