package com.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JudgeWeek {

    public static void main(String[] args) throws Exception {
        String str = "2021/5/4";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        calendar.setTime(sdf.parse(str));
        int i =calendar.get(Calendar.DAY_OF_WEEK);
        if(i == 1){
            System.out.println("今天是星期日");
        }else{
            System.out.println("今天是星期"+(i-1));
        }

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss E");
        System.out.println(sdf1.format(calendar.getTime()));

        SimpleDateFormat sdf2 = new SimpleDateFormat("E");
        System.out.println(sdf2.format(calendar.getTime()));
    }
}