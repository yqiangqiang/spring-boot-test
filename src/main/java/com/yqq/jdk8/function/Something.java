package com.yqq.jdk8.function;

import javax.swing.text.ComponentView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Something {

    String string = "abc";

//    public Something() {
//
//    }
    public Something(String s){
        this.string = s;
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

    public static void main(String[] args) {

        //调用外部对象
        Convert<String,String> c = SomethingRepeat::endWithStatic;//访问静态方法
        String SomethingRepeat_s = c.convert("bn");
        System.out.println("SomethingRepeat convert:"+SomethingRepeat_s);

        Convert<SomethingRepeat,String> cc = SomethingRepeat::new;//访问构造器
        SomethingRepeat repeat = cc.convert("pre");
        System.out.println("SomethingRepeat 构造器："+ repeat.string);


        //使用::访问静态方法和构造器
        Convert<String,String> ccc = Something::endWith;
        System.out.println(ccc.convert("eeee"));
        Convert<Something,String> ccc2 = Something::new;
        System.out.println("构造方法："+ccc2.convert("aaa").string);

        // function 传递
        new Something("abc").new FunctionParam().excuse(Something::endWithStatic);
        FunctionInterfaceObjParam functionInterfaceObjParam = new Something("abc").new FunctionInterfaceObjParam();
        functionInterfaceObjParam.excuse(ccc2);
        functionInterfaceObjParam.excuse2(ccc);


        //使用类内部定义的接口
        Iconvert<String, String> c2 = Something::endWith;
        String s = c2.convert("efg");
        System.out.println("end with:  "+s);


        //循环中使用新特性demo
        List<String> l = new ArrayList();
        l.add("a");
        l.add("b");
        l.add("c");

        //循环1
        l.forEach(Something::printStr);

        //循环3
        Consumer<String> consumer = Something::printStr;
        l.forEach(consumer);

        //循环2
        l.forEach(x -> printStr(x));

//        new Something.FunctionParam();


    }



    @FunctionalInterface
    public interface Iconvert<T,V> {

        T convert(V v);

    }

    //传入function对象
    public class FunctionParam{
        public  void excuse(Function function) {
            Object o = function.apply("zxv");
            System.out.println(o);
        }
    }

    ///封装方法返回值到functionInterface对象中
    public class FunctionInterfaceObjParam{

        public void excuse(Convert<Something,String> convert) {
            Something something = convert.convert("aaa");
            System.out.println("functionInterface--对象传递 传递："+something.startWith("bb"));

        }

        public void excuse2(Convert<String, String> convert) {
            String s = convert.convert("z");
            System.out.println("functionInterface--方法传递："+s);
        }

    }


    public static void printStr(String str) {
        System.out.println("打印字符串 : "+str);
    }


}
