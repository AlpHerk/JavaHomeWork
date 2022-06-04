import java.awt.*;
import javax.swing.*;

public class MyExam14_4 {
	JFrame myframe = new JFrame("MyExam14_4"); 
    JPanel panel   = new JPanel();
    JLabel label   = new JLabel();
    JButton b1 = new JButton("变色");
    JButton b2 = new JButton("退出");
	JTextField display  = new JTextField();

    public static void main(String[] args) {
        MyExam14_4 wdo = new MyExam14_4();
        wdo.designFrame();
    }


    public void designFrame() {
        display.setPreferredSize(new Dimension(200, 100));

        panel.setLayout(new GridLayout(1, 2));
        
        panel.add(b1);
        panel.add(b2);
        label.setText("布局效果 - @Herk");
 
        myframe.add(label, BorderLayout.NORTH); 
		myframe.add(display); 			 
		myframe.add(panel, BorderLayout.SOUTH); 

        myframe.setSize(300, 200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myframe.pack(); 	
    }
}
