package com.yqq.run;

import com.alibaba.fastjson.JSONObject;
import com.yqq.springBoot.entity.User;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestRun {

    public static void main(String[] args) {


//        TestRun.testFilter();
        TestRun.testMap();



    }

    public static void testMap() {

        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");

        List l2 =  l.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
        System.out.println(l);
        System.out.println(l2);

        Map<String, List> mapList = new HashMap<>();
        mapList.put("a", l);
        System.out.println(JSONObject.toJSON(mapList));
        l.add("d");
        System.out.println(JSONObject.toJSON(mapList));
    }

    public static void testCalendar() {
        String str = "12期（频率：1周/期）";
        String subStr = str.substring(str.indexOf("频率：") + 3, str.indexOf("）"));
//        System.out.println(subStr);
//        System.out.println(Pattern.compile("[^0-9]+").matcher(subStr).replaceAll(""));
//        System.out.println(Pattern.compile("(\\d+)").matcher(subStr).replaceAll("").replace("/期",""));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 30);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(calendar.getTime()));
    }


    public static void testFilter() {

        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");

        Stream<String> result = l.stream().filter(v -> {
            return "a".equalsIgnoreCase(v);
        });
        System.out.println(l);
        System.out.println(result.collect(Collectors.toList()));
    }


    public class TestClass{
        public final String s = "abc";
        public final User user = new User();
    }

}
