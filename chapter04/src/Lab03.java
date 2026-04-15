import javax.swing.*;
import java.awt.*;

void main() {
    JFrame frame = new JFrame("图形界面程序");
    frame.setLayout(new FlowLayout());
    frame.add(new JButton("确定"));
    frame.setBackground(Color.GRAY);
    frame.setSize(300, 150);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}