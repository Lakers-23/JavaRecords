package coreJava.chapters6.timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class TimerTest {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();
        //定时器 1000毫秒通知listener一次
        Timer timer = new Timer(1000, listener);
        timer.start();

        //显示对话框 位于parent组件的中央，为null则显示在屏幕中央
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        //beep 发出一声铃响
        Toolkit.getDefaultToolkit().beep();
    }
}
