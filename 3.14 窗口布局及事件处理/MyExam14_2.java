import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyExam14_2 implements ActionListener{
    JFrame myframe;
    JButton b1;
    JTextField txtSource;
    JTextField txtDes;
    public static void main(String[] args) {
        MyExam14_2 wdo = new MyExam14_2();
        wdo.designFrame();
    }

    public void designFrame() {
        myframe = new JFrame("MyExam14_2");
        b1 = new JButton("COPY");
        txtSource = new JTextField();
        txtDes = new JTextField();
        myframe.getContentPane().setLayout(new GridLayout(3, 1));
        myframe.getContentPane().add(txtSource);
        myframe.getContentPane().add(b1);
        myframe.getContentPane().add(txtDes);
        b1.addActionListener(this);
        myframe.setSize(300, 200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        txtDes.setText(txtSource.getText());
    }
}
