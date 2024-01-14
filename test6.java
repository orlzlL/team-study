import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        // 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울을 출력하시오.
        // 또한, 그 외의 숫자를 입력한 경우 보기와 같이 “잘못 입력하셨습니다.”를 출력하도록 하시오.

        Scanner sc = new Scanner(System.in);
        System.out.println("Month를 입력하시오: ");
        int input = sc.nextInt();

        switch (input) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;        
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }
}
