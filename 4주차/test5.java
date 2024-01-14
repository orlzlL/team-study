import java.util.Scanner;


public class test5 {
    public static void main(String[] args) {
        
        //날짜를 입력받아 1일이면 ‘월’ / 2일이면 ‘화’ / 3일이면 ‘수’ / … / 7일이면 ‘일’ / 8일이면 ‘월’ / …..
        // 위 방식으로 요일을 출력하시오.

        // 궁금한점 : 그럼 2024년 01월만 기준으로 하는건가요?

        Scanner sc = new Scanner(System.in);
        System.out.println("날짜를입력하세요: ");
        int date = sc.nextInt();

        if(date % 7 == 1){
            System.out.println("월");
        } else if(date % 7 == 2){
            System.out.println("화");
        } else if(date % 7 == 3){
            System.out.println("수");
        } else if(date % 7 == 4){
            System.out.println("목");
        } else if(date % 7 == 5){
            System.out.println("금");
        } else if(date % 7 == 6){
            System.out.println("토");
        } else if(date % 7 == 0){
            System.out.println("일");
        }
    }
}
