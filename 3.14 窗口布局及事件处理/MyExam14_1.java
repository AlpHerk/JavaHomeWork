import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyExam14_1 extends WindowAdapter{
    public static void main(String[] args) {

        MyExam14_1 wdo = new MyExam14_1();
        wdo.designFrame();
    }
    public void designFrame() {
        JFrame myframe =  new JFrame("MyExam14_1");
        JButton b1 = new JButton("确定");
        JButton b2 = new JButton("关闭");
        myframe.getContentPane().add(b1, BorderLayout.CENTER);
        myframe.getContentPane().add(b2, BorderLayout.SOUTH);
        myframe.addWindowListener(this);
        myframe.setSize(300, 200);
        myframe.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
