package com.yqq.jdk8.lambda;

public class TestLambda {


    public static void main(String[] args) throws InterruptedException {

        TestInterface t = (a,b) -> a+b;
        int i = t.sum(1, 3);
        System.out.println(i);

        TestInterface t2 = (a,b) -> a-b;
        int i2 = t2.sum(3, 1);
        System.out.println(i2);



//        for (int i = 0; i < 5; i++) {
//
//            Runnable runnable = () -> {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("do someting");
//            };
//            new Thread(runnable).start();
//
//
//        }

        System.out.println("主线程结束");

    }

}
