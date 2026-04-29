package ch10_collection.practice.model.service;

import ch10_collection.practice.model.vo.Member;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LoginService {

    private Scanner sc = new Scanner(System.in);
    public static int maxScore = 0;

    // 업다운 게임 시작
    // 1 ~ 100 사이 숫자 중 랜덤하게 한 숫자를 지정하고 업/다운 게임을 진행
    // 맞춘 횟수가 현재 로그인한 회원의 최초 또는 최고 기록인 경우 회원의 highScore 필드 값을 변경
    public void startGame(Member loginMember) {

        System.out.println("[Game Start...]");
        int success = (int) (Math.random() * 100) + 1;
//		System.out.println(success);
        int tryNum = 0;
        int score = 0;
        for (int i = 1; ; i++) {

            System.out.print(i + "번째 입력 : ");
            int num = sc.nextInt();
            if (num == success) {
                System.out.println("정답!!");
                tryNum++;
                break;
            }
            if (num > success) {
                System.out.println("--DOWN--");
                tryNum++;
            }
            if (num < success) {
                System.out.println("--UP--");
                tryNum++;
            }
        }
        System.out.println("입력 시도 횟수 : " + tryNum);
        score = tryNum;
        if (maxScore < score){
            maxScore = score;
            System.out.println("***최고 기록 달성***");
        }
        System.out.println("맥스"+maxScore);
        System.out.println("점수"+score);

    }


    // 내 정보 조회
    // 로그인한 멤버의 정보 중 비밀번호를 제외한 나머지 정보만 화면에 출력
    public void selectMyInfo(Member loginMember) {

        System.out.println("[내 정보 조회]");
    }

    // 전체 회원 조회
    // 전체 회원의 아이디, 이름, 최고점수를 출럭
    public void selectAllMember(List<Member> members) {

        System.out.println("[전체 회원 조회]");


    }

    // 비밀번호 변경
    // 현재 비밀번호를 입력 받아
    // 같은 경우에만 새 비밀번호를 입력 받아 비밀번호 변경
    public void updatePassword(Member loginMember) {

        System.out.println("[비밀번호 변경]");


    }


}
