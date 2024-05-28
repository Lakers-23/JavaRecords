package coreJava.chapters6.timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class TimerTest {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();
        //��ʱ�� 1000����֪ͨlistenerһ��
        Timer timer = new Timer(1000, listener);
        timer.start();

        //��ʾ�Ի��� λ��parent��������룬Ϊnull����ʾ����Ļ����
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        //beep ����һ������
        Toolkit.getDefaultToolkit().beep();
    }
}
