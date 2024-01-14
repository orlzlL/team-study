import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        
        // 윤년
        // 연도가 주어졌을 때 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.

        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하시오: ");
        int input = sc.nextInt();

        if((input % 4 == 0 && input % 100 != 0) || input % 400 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
