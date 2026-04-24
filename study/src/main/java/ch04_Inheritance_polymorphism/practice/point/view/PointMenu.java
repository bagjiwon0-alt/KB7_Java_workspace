package ch04_Inheritance_polymorphism.practice.point.view;

import ch04_Inheritance_polymorphism.practice.point.controller.CircleController;
import ch04_Inheritance_polymorphism.practice.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {
    Scanner sc = new Scanner(System.in);
    CircleController cc = new CircleController();
    RectangleController rc= new RectangleController();

    // method
    public void mainMenu(){
        int num;

        System.out.println("===== 메뉴 =====");
        System.out.println("1. 원");
        System.out.println("2. 사각형");
        System.out.println("9. 끝내기 메");
        System.out.print("뉴 번호 : ");
        num = sc.nextInt();

        if (num == 1) {
            circleMenu();
        } else if (num == 2) {
            rectangleMenu();
        } else {
            System.out.println("종료합니다.");
        }
    }

    public void circleMenu(){
        int num;
        
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 원 둘레");
        System.out.println("2. 원 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        num = sc.nextInt();

        if (num == 1) {
            calcCircum();
            mainMenu();
        } else if (num == 2) {
            calcCircleArea();
            mainMenu();
        } else {
            mainMenu();
        }
        
    }
    public void rectangleMenu(){
        int num;

        System.out.println("===== 메뉴 =====");
        System.out.println("1. 사각형 둘레");
        System.out.println("2. 사각형 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        num = sc.nextInt();

        if (num == 1) {
            calcPerimeter();
            mainMenu();
        } else if (num == 2) {
            calcRectArea();
            mainMenu();
        } else {
            mainMenu();
        }

    }
    public void calcCircum(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        System.out.println(cc.calcCircum(x, y, radius));
    }
    public void calcCircleArea(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        System.out.println(cc.calcCircum(x, y, radius));
    }
    public void calcPerimeter(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
        System.out.print("너비 : ");
        int width = sc.nextInt();
        System.out.println(rc.calcPerimeter(x, y, height, width));
    }
    public void calcRectArea(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
        System.out.print("너비 : ");
        int width = sc.nextInt();
        System.out.println(rc.calcPerimeter(x, y, height, width));
    }
}