import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        
        // 가위, 바위, 보 프로그램 작성하기.
        Scanner sc = new Scanner(System.in);
        System.out.println("가위 바위 보 중 하나를 입력하세요: ");
        String input = sc.nextLine();               // 사용자 input String으로 입력받기
        int inputInt = 0;

        // Random 함수로 시스템 가위바위보 중 선택
        // 가위=0, 바위=1, 보=2
        Random random = new Random();
        int systemchoice = random.nextInt(3);
      
        //사용자 입력 int로 변환
        if(input.equals("가위")){
            inputInt = 0;
        } else if(input.equals("바위")){
            inputInt = 1;
        } else {
            inputInt = 2;
        }

        //승패 판결
        String result = null;

        if(systemchoice == inputInt){
            result = "비김";
        } else if(systemchoice == 0){
            if(inputInt == 1){
                result = "승";
            } else if(inputInt == 2){
                result = "패";
            }
        } else if(systemchoice == 1){
            if(inputInt == 0){
                result = "패";
            } else if(inputInt == 2){
                result = "승";
            }
        } else if(systemchoice == 2){
            if(inputInt == 0){
                result = "승";
            } else if(inputInt == 1){
                result = "패";
            }
        }

        System.out.println(result);

    }
}