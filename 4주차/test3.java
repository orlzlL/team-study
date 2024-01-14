import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        
        // 한 초등학교에는 1학년부터 6학년까지 한 해의 마지막 날 시험을 보는데
        // 6학년은 80점 이상, 4학년부터 5학년까지는 70점 이상, 1학년부터 3학년까지는 60점 이상의 점수를 받아야 다음 학년으로 올라갈 수 있다.
        // 사용자들로부터 이름, 점수, 학년을 받아 아래와 같은 결과물이 출력되도록 작성하시오.
        // (입력 받는 값은 학년은 1~6까지, 점수는 0~100 까지만 받을 수 있고 그 이외의 숫자를 받게 되면 “다시 입력하세요”를 출력)

        // 학년별 점수 충족시 : “OOO 학생은 다음 학년으로 갑니다”
        // 학년별 점수 미달시 : “OOO 학생은 내년에 더 노력하세요”

        Scanner sc = new Scanner(System.in);
        System.out.println("이름, 점수, 학년을 입력하세요: ");
        String name = sc.nextLine();
        int point = sc.nextInt();
        int grade = sc.nextInt();

        int pass = 0;

        if(point >=0 && point <= 100){

            switch(grade){
                case 6:
                    if(point >= 80){
                        pass = 1;
                    }
                    break;
                case 5: case 4:
                    if(point >= 70){
                        pass = 1;
                    }
                    break;
                case 3: case 2: case 1:
                    if(point >= 60){
                        pass = 1;
                    }
                    break;
                default:
                    pass = 0;
                    System.out.println("다시 입력하세요.");
                    break;           
            }

            if(pass == 1){
                System.out.println(name + " 학생은 다음 학년으로 갑니다.");
            } else {
                System.out.println(name + " 학생은 내년에 더 노력하세요.");
            }
        } else {
            System.out.println("다시 입력하세요.");
        }
    }
}
