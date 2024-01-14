import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        //중앙값 구하기
        //사용자로부터 세 개의 수를 입력받은 후 입력받은후 중앙값을 출력하시오.
        System.out.println("숫자 세 개를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;

        if(a >= b){
            if(b >= c){     // a > b > c
                result = b;
            } else if(a <= c){ // c > a > b
                result = a;                
            } else {
                result = c;
            }
        } else if(a >= c){    // b > a > c
            result = a;
        } else if(b >= c){    // b > c > a
            result = c;
        } else {              // c > b > a
            result = b;
        }
        System.out.println("중앙값은 " + result);
    }
}
