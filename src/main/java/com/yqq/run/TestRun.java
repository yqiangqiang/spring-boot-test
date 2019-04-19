package com.yqq.run;

import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class TestRun {

    public static void main(String[] args) {

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

}
