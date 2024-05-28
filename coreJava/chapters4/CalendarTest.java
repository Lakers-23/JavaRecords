package coreJava.chapters4;

import java.time.*;

public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wde Thu Fri Sat Sun");
        for(int i = 1; i < value; i++){
            System.out.print("    ");   //判断这个月的第一天是星期几 前面要加几个空格
        }
        while (date.getMonthValue() == month)   //只打印这个月的日历
        {
            System.out.printf("%3d", date.getDayOfMonth()); //打印每个日期
            if(date.getDayOfMonth() == today)
                System.out.print("*");      //如果是今天加上星号标记
            else
                System.out.print(" ");      //否则空格隔开
            date = date.plusDays(1);    //日期加1 plusDays生成了新的对象
            if(date.getDayOfWeek().getValue() == 1) System.out.println();   //每周1换行
        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();   //最后如果不是刚好打印完周日 需要换行
    }
}
