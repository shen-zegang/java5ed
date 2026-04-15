package com.boda.example;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class CalculatorDemo extends Application {
	private TextField t1; // 文本框1用来显示输入信息
	private TextField t2; // 文本框2用来显示结果信息
	StringBuilder str ; // 显示屏所显示的字符串
	double x, y; // x和y都是运算数
	int z; // z表示单击了哪个运算符，0表示"+",1表示"-",2表示"*",3表示"/"
	private Button b[] = new Button[12]; // 创建一个有12个按钮的数组
	private Button b1, b2, b3, b4, b5, b6, b7, b8; // 算术功能按钮

	@Override
	public void start(Stage stage) {
		t1 = new TextField();
		t1.setEditable(false); // 只能显示，不能编辑
		t1.setAlignment(Pos.CENTER_RIGHT);
		t1.setFont(new Font(14));
		
		t2 = new TextField();
		t2.setEditable(false); // 只能显示，不能编辑
		t2.setAlignment(Pos.CENTER_RIGHT);
		t2.setFont(new Font(14));
		
		str = new StringBuilder();  //创建一个空字符串缓冲区
		var handler = new ButtonHandler(); // 创建事件处理器对象

		for (int i = 0; i < 10; i++) { // 分别为数组中0~9号的按钮设置标签，并注册监听器
			String s = "" + i;
			b[i] = new Button(s);
			b[i].setPrefSize(50, 20);
			b[i].setFont(new Font(14));
			b[i].setOnAction(handler);
		}
		// 实例化各个按钮
		b[10] = new Button("-/+");
		b[10].setPrefSize(50, 20);
		b[10].setFont(new Font(14));
		b[11] = new Button(".");
		b[11].setPrefSize(50, 20);
		b[11].setFont(new Font(14));
		b1 = new Button("/");
		b1.setPrefSize(50, 20);
		b1.setFont(new Font(14));
		b2 = new Button("←");
		b2.setPrefSize(50, 20);
		b2.setFont(new Font(14));
		b3 = new Button("*");
		b3.setPrefSize(50, 20);
		b3.setFont(new Font(14));
		b4 = new Button("C");
		b4.setPrefSize(50, 20);
		b4.setFont(new Font(14));
		b5 = new Button("+");
		b5.setPrefSize(50, 20);
		b5.setFont(new Font(14));
		b6 = new Button("√");
		b6.setPrefSize(50, 20);
		b6.setFont(new Font(14));
		b7 = new Button("-");
		b7.setPrefSize(50, 20);
		b7.setFont(new Font(14));
		b8 = new Button("=");
		b8.setPrefSize(50, 20);
		b8.setFont(new Font(14));

		b1.setOnAction(handler);
		b2.setOnAction(handler);
		b3.setOnAction(handler);
		b4.setOnAction(handler);
		b5.setOnAction(handler);
		b6.setOnAction(handler);
		b7.setOnAction(handler);
		b8.setOnAction(handler);
		b[10].setOnAction(handler);
		b[11].setOnAction(handler);

		var rootNode = new VBox();
		rootNode.setPadding(new Insets(10, 20, 10, 20));

		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(5);
		grid.setPadding(new Insets(10, 0, 10, 0));
		grid.setAlignment(Pos.CENTER);

		// 将按钮添加到面板grid上
		grid.add(b[7], 0, 0);
		grid.add(b[8], 1, 0);
		grid.add(b[9], 2, 0);
		grid.add(b1, 3, 0);
		grid.add(b2, 4, 0);
		grid.add(b[4], 0, 1);
		grid.add(b[5], 1, 1);
		grid.add(b[6], 2, 1);
		grid.add(b3, 3, 1);
		grid.add(b4, 4, 1);
		grid.add(b[1], 0, 2);
		grid.add(b[2], 1, 2);
		grid.add(b[3], 2, 2);
		grid.add(b5, 3, 2);
		grid.add(b6, 4, 2);
		grid.add(b[0], 0, 3);
		grid.add(b[10], 1, 3);
		grid.add(b[11], 2, 3);
		grid.add(b7, 3, 3);
		grid.add(b8, 4, 3);

		rootNode.getChildren().addAll(t2, t1, grid);

		Scene scene = new Scene(rootNode, 332, 240);
		stage.setTitle("简易计算器");
		stage.setScene(scene);
		stage.show();
	}

	public class ButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			try {
				if (e.getSource() == b4) { // 选择"C"清零
					t1.setText("0"); // 把文本框清零
					str.setLength(0); // 清空字符串缓冲区以准备接收新的输入运算数
					t2.setText(""); // 把文本框清空
				} else if (e.getSource() == b[10]) {
					// 单击"+/-"选择输入的运算数是正数还是负数
					x = Double.parseDouble(t1.getText().trim());
					t1.setText("" + (-x));
				} else if (e.getSource() == b5) {
					// 单击加号按钮获得x的值和z的值并清空y的值
					x = Double.parseDouble(t1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 0;
				} else if (e.getSource() == b7) {
					// 单击减号按钮获得x的值和z的值并清空y的值
					x = Double.parseDouble(t1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 1;
				} else if (e.getSource() == b3) {
					// 单击乘号按钮获得x的值和z的值并清空y的值
					x = Double.parseDouble(t1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 2;
				} else if (e.getSource() == b1) {
					// 单击除号按钮获得x的值和z的值并清空y的值
					x = Double.parseDouble(t1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 3;
				} else if (e.getSource() == b8) {
					// 单击等号按钮输出计算结果
					str.setLength(0);
					switch (z) {
					case 0 -> {
						t2.setText("" + (x + y));
					}
					case 1 -> {
						t2.setText("" + (x - y));
					}
					case 2 -> {
						t2.setText("" + (x * y));
					}
					case 3 -> {
						t2.setText("" + (x / y));
					}
					}
				} else if (e.getSource() == b[11]) {
					// 单击"."按钮输入小数
					if (t1.getText().trim().indexOf('.') != -1) {
						// 判断字符串中是否已经包含了小数点
					} else { // 如果没有小数点
						if (t1.getText().trim().equals("0")) {// 如果初时显示为0
							String s = ((Button)e.getSource()).getText();
							t1.setText(str.append(s).toString());
						} else if (t1.getText().trim().equals("")) {
							// 如果初时显示为空则不做任何操作
						} else {
							String s = ((Button)e.getSource()).getText();
							t1.setText(str.append(s).toString());
						}
					}
					y = 0d;
				} else if (e.getSource() == b6) { // 求平方根
					x = Double.parseDouble(t1.getText().trim());
					if (x < 0) {
						t1.setText("负数不能计算平方根！");
					} else {
						t2.setText("" + Math.sqrt(x));
					}
					str.setLength(0);
					y = 0d;
				} else {
					if (e.getSource() == b[0]) {// 如果选择的是"0"这个数字键
						if (t1.getText().trim().equals("0")) {
							// 如果显示屏显示的为零不做操作
						} else {
							t1.setText(str.append(((Button)(e.getSource())).getText()).toString());							
						}
						y = Double.parseDouble(t1.getText().trim());	
					} else if (e.getSource() == b2) { // 选择的是←键
						if (!t1.getText().trim().equals("0"))// 如果显示屏显示的不是零
						{
							if (str.length() != 1) {
								// 可能抛出字符串越界异常
								t1.setText(str.delete(str.length() - 1, str.length()).toString());
							} else {
								t1.setText("0");
								str.setLength(0);
							}
						}
						y = Double.parseDouble(t1.getText().trim());
					} else {
						String s = ((Button)e.getSource()).getText();
						t1.setText(str.append(s).toString());
						y = Double.parseDouble(t1.getText().trim());
					}
				}

			} catch (NumberFormatException e1) {
				t1.setText("数字格式异常");
			} catch (StringIndexOutOfBoundsException e1) {
				t1.setText("字符串索引越界");
			}
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
