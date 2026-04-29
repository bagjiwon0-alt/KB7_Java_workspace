package ch09_collection_generic.basic.ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<>();
        int[] arr = {100, 50, 500, 10};
        for (int i = 0; i < arr.length; i++) {
            Coin coin = new Coin(arr[i]);
            stack.push(coin);
//            System.out.println(stack.get(i));
        }
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
//            System.out.println("꺼내온 동전 : " + stack.peek() + "원");
//            stack.pop();
//            System.out.println(stack.pop());
            while (!stack.isEmpty()){
                Coin coin = stack.pop();
                System.out.println("꺼내온 동전 : " + coin + "원");
            }
        }

    }
}
