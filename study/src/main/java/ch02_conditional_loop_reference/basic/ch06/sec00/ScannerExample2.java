package ch02_conditional_loop_reference.basic.ch06.sec00;

import java.util.Scanner;


public class ScannerExample2 {
    public static void main(String[] args) {
         /*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을
		 * for문을 이용하여 출력하세요.

			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */

//        //스캐너 생성
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 하나 입력하세요 : ");
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++){
//            sum = sum + i;
//            System.out.printf("%d",i);
//            if (i < num) {
//                System.out.print(" + ");
//            }
//        };
//        System.out.printf(" = %d",sum);

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();     // 정수입력
        int sum = 0;    // 합계 저장 용 변수
        for (int i = 1; i <= num; i++) {
            if (i != num) {  // 마지막 번호가 아닐 때
                System.out.print(i + " + ");
            } else { // 마지막 번호일 때
                System.out.print(i + " = " + sum);
            }
            sum += i;
        }

    }

    }
//// 배열 선언 방법
//int[] arr1;                 // 배열 변수 선언
//int[] arr2 = new int[5];   // 배열 생성 (기본값으로 초기화)
//int[] arr3 = {1, 2, 3, 4, 5}; // 선언과 동시에 초기화
//int[] arr4 = new int[] {1, 2, 3, 4, 5}; // 값 목록으로 배열 생성

//// 1. for문을 이용한 복사
//int[] oldArray = {1, 2, 3};
//int[] newArray = new int[5];
//for(int i = 0; i < oldArray.length; i++) {
//newArray[i] = oldArray[i];
//        }
//
//// 2. System.arraycopy() 사용
//        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
















