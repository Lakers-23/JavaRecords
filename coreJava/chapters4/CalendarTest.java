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
            System.out.print("    ");   //�ж�����µĵ�һ�������ڼ� ǰ��Ҫ�Ӽ����ո�
        }
        while (date.getMonthValue() == month)   //ֻ��ӡ����µ�����
        {
            System.out.printf("%3d", date.getDayOfMonth()); //��ӡÿ������
            if(date.getDayOfMonth() == today)
                System.out.print("*");      //����ǽ�������Ǻű��
            else
                System.out.print(" ");      //����ո����
            date = date.plusDays(1);    //���ڼ�1 plusDays�������µĶ���
            if(date.getDayOfWeek().getValue() == 1) System.out.println();   //ÿ��1����
        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();   //���������Ǹպô�ӡ������ ��Ҫ����
    }
}
