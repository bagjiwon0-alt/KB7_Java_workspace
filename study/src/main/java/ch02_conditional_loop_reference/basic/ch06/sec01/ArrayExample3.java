package ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Arrays;

public class ArrayExample3 {

    public void ex1(){
        // 얕은 복사
        // - 참조하는 주소만을 복사하여 서로 다른 참조변수가
        //   하나의 배열을 참조하게 만드는것

        // 특징 : 하나의 배열을 참조하기 때문에 값을 공유함

        int[] arr = {10,20,30,40,50};

        // 1) 얕은복사
        int[] copyArr = arr;
        // arr 에 저장된 주소를 copyArr에 저장

        System.out.println(arr);    // arr에 저장된 주소값
        System.out.println(copyArr);    // copyArr에 저장된 주소값
        // 둘이 일치

        // arr을 이용해서 배열의 저장된 값 변경해보기
        arr[2] = 50000;

        // Arrays.toString(배열명)
        System.out.println(Arrays.toString(arr));    // arr 주소에 저장된 배열값
        System.out.println(Arrays.toString(copyArr));    // copyArr 주소에 저장된 배열값
        // 둘이 일치

    }

    public void ex2(){
        // 깊은 복사
        // - (원본과 같은 참조형 변수) + (원본과 같거나 더 큰 배열)을 만들어
        //   원본의 데이터를 모두 복사하여 참조하는 방법

        int[] arr = {10,20,30,40,50};


        // 1. for문을 이용한 깊은 복사
        int[] copyArr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr1[i] = arr[i];
        }

        // 2. System.arraycopy(원본 배열명, 원본 복사 시작 인덱스,
        //                      복사 배열명, 복사 배열의 삽입 시작 인덱스, 복사 길이)

        int[] copyArr2 = new int[arr.length];
        System.arraycopy(arr,0,copyArr2,0,arr.length);


        // 3. 복사할 배열 참조 변수 = Arrays.copyOf(원본 배열, 복사할 길이)
        //

        int[] copyArr3 = Arrays.copyOf(arr,arr.length);

        System.out.println("값 변경 전");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr1));
        System.out.println(Arrays.toString(copyArr2));
        System.out.println(Arrays.toString(copyArr3));

        arr[0] = 555;
        copyArr1[1] = 777;

        System.out.println("값 변경 후");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr1));
        System.out.println(Arrays.toString(copyArr2));
        System.out.println(Arrays.toString(copyArr3));


    }
}
