package Calculator;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorGui {
    public static void main(String[] args) {
        CalGUi gui = new CalGUi();
		gui.createGUI();
    }
}


class calExpStr {
	/**计算器的业务逻辑
	 * @通过逆波兰表达式来计算表达式的值
	 * @式子可含括号，小数点，方法易扩展
	 */

    private static String[] toSuffixExp(String expStr1) {
        /** 
         *  @中缀表达式[字符串] -> @后缀表达式[数组] 
         **/ 
        // 1.对字符串预处理，去除穿中空格，方便后面解析表达式
        String expStr = expStr1.replaceAll(" +","");

		ArrayList<String> suffix = new ArrayList<String>();
        Stack<String> stack  = new Stack<String>();
        
        // 2.从左至右依次扫描表达式中的字符，进行逆波兰转换。
        for(int i = 0; i < expStr.length(); i++) {
            String ch = expStr.substring(i, i+1);
            //1) 若是左括号，则压入栈中。
            if (ch.equals("(")) {
                stack.push(ch);
            }
            //2) 若是右括号，依次弹出栈顶并加入后缀表达式，直至弹出左括号。
            else if (ch.equals(")")) {
                while (!stack.peek().equals("(")) {
                    suffix.add(stack.pop());
                }
                stack.pop();    // 此时栈顶就是左括号，弹出。
            }
            //3) 若是操作符，若栈顶操作符的优先级不小于其，则弹出并加入后缀表达式，
            //   直至栈顶是严格低优先级的操作符，再压入操作符。
            else if(ch.matches("[\\+\\-\\*\\/]")){
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    suffix.add(stack.pop());
                }
                stack.push(ch); // 最后再压入操作符。
            }
            //4) 其他情况，即是操作数，则直接加入后缀表达式中。
            else {
                try {
                    int last = suffix.size()-1;
                    if(String.valueOf(expStr.charAt(i-1)).matches("[\\+\\-\\*\\/\\(\\)]")) {
                        suffix.add(ch); // 如果原字符串中上一字符是运算符，则将操作数单独方
                    } else {            // 否则就是数字或小数点，则将当前数字附加上
                        suffix.set(last, suffix.get(last) + ch);
                    }
                } catch(Exception e) {
                    suffix.add(ch);
                }
            }
        }
        // 3.把栈内剩余元素全部弹出
        while (!stack.isEmpty()) {
            suffix.add(stack.pop());
        } 

        return (String[])suffix.toArray(new String[suffix.size()]);
    }

    public static Double calculate(String expStr) {
        /** 计算后缀表达式(逆波兰表达)的值
         *  @后缀表达式[字符串] -> @值[浮点数]
         **/
        String[] expArr = toSuffixExp(expStr);
        Stack<Double> stack = new Stack<Double>();

        for(int i=0; i<expArr.length; i++) {
            String ch = expArr[i];
            if(ch.matches("[\\+\\-\\*\\/]")) {
                Double numr = stack.pop();
                Double numl = stack.pop();
                if (ch.equals("+")) stack.push(numl + numr);
                if (ch.equals("-")) stack.push(numl - numr);
                if (ch.equals("*")) stack.push(numl * numr);
                if (ch.equals("/")) stack.push(numl / numr);
            }
            else stack.push(Double.parseDouble(ch));
        }
        return stack.peek();
    }

    private static int priority(String op) {
        switch (op) { // 比较运算符的优先级
            case "+": case "-": return 1;
            case "*": case "/": return 2;
        } return 0;
    }
}


class CalGUi {
	/**计算器的用户界面
	 * @创建一个简易的计算器界面
	 */

	// 使用 map 统一存放管理按钮
	Map<String, JButton> btnMap = new LinkedHashMap<String, JButton>(); 
	JFrame windo   = new JFrame("计算器");	// 主体窗口
	JPanel panel   = new JPanel();  	  	  	  // 居中面板
	JLabel label   = new JLabel();
	JTextField display  = new JTextField();       // 计算器显示框
	StringBuffer buffer = new StringBuffer();     // 保存按钮触发内容
	
    public void createGUI() {
		
		// 计算器显示框
		display.setPreferredSize(new Dimension(500, 65));
		display.setFont(new Font("宋体", Font.BOLD, 40));

		// 计算器按钮布局
		panel.setLayout(new GridLayout(5, 4, 12, 16));
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		// 按钮布局，所见即所得
		String btnName[] = {
			"(", ")", "", "clear",
			"7", "8", "9", "/", 
			"4", "5", "6", "*", 
			"1", "2", "3", "-", 
			".", "0", "+", "="
		};
		
		// 利用 map 和 btn名字组 初始化按钮
		for(int i=0; i<btnName.length; i++) {
			JButton btn = new JButton(btnName[i]);
			btn.setFont(new Font("", Font.BOLD, 30));
			btnMap.put(btnName[i], btn);
			panel.add(btn);
			
			// 为非输入按钮初始化 
			if(btnName[i]!="clear" && btnName[i]!="=") {
				btnInit(btnName[i]);
			}
		}
		btnClear();		// 绑定清除按钮的触发事件
		btnCalc();		// 绑定等于按钮的触发事件

		// 给部分按钮上色
		for(int i=4; i<btnName.length-1; i++) {
			btnMap.get(btnName[i]).setBackground(new Color(208, 229, 251));
		}

		label.setText(" 本程序逆波兰表达式 - @Herk");
		label.setFont(new Font("", Font.PLAIN, 18));

		windo.add(display, BorderLayout.NORTH); // 将显示框添加到窗口北部
		windo.add(panel); 						// 中间按钮组布局
		windo.add(label, BorderLayout.SOUTH);	// 将状态栏添加到窗口底部

		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 点X关闭窗口
		windo.setLocation(400, 200); 		 // 窗口初始位置
		windo.setSize(500, 300);
		windo.setVisible(true);
		windo.pack(); 						 // 自适应窗口大小
	}

	private void btnInit(String btnName) {
		btnMap.get(btnName).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buffer.append(btnName);
				display.setText(buffer.toString());
			}
		});
	}

	private void btnClear() {
		btnMap.get("clear").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buffer.delete(0, buffer.length()); // 清空字符串中的内容
				display.setText(buffer.toString()); 	 // 在文本框中显示结果
			}
		});
	}

	private void btnCalc() {
		btnMap.get("=").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = buffer.toString();
				display.setText("");
				try {
					double result = calExpStr.calculate(str);	// 求解式子的值
					String string = String.valueOf(result);		// 结果转为字符串
					buffer.delete(0, buffer.length());
					buffer.append(string);
					display.setText(string);
				} catch(Exception errCal) {
					display.setText("计算式错误，请重新输入");
				}
			}
		});
	} 
}
