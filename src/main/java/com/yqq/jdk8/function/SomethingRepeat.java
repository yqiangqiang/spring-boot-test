package com.yqq.jdk8.function;


public class SomethingRepeat {

    String string = "abc";

    public SomethingRepeat(String s){
        string = s;
    }


    public String startWith(Object o) {
        return string + " & " + String.valueOf(o.toString().charAt(0));
    }

    public static String endWith(String s) {
        return   " & " + String.valueOf(s.charAt(s.length() - 1));
    }

    public String append(String s,String s2) {
        return s + "+" + s2;
    }

    public static String endWithStatic(Object o) {

        return   " & " + String.valueOf(o.toString().charAt(o.toString().length() - 1));

    }

    public static void printStr(String str) {
        System.out.println("打印字符串 : "+str);
    }




}
