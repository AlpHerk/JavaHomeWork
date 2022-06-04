import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyExam14_3 {
    JFrame myframe = new JFrame();
    JButton b1 = new JButton("把鼠标指针移过来");

    public static void main(String[] args) {
        MyExam14_3 wdo = new MyExam14_3();
        wdo.designFrame();
    }

    public void designFrame() {
        myframe.getContentPane().setLayout(new FlowLayout());
        myframe.getContentPane().add(b1);
        b1.setBackground(new Color(255, 255, 0));
        b1.addMouseListener(new MouseHandle());
        myframe.setSize(300, 200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    class MouseHandle extends MouseAdapter {
        public void mouseEntered(MouseEvent e) {
            b1.setBackground(Color.GREEN);
            b1.setText("把鼠标指针移开！");
        }
        public void mouseExited(MouseEvent e) {
            b1.setBackground(Color.RED);
            b1.setText("把鼠标指针移过来！");
        }
    }
}
