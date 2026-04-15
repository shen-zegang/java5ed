package com.boda.xy;
import module javafx.controls;

public class TextFieldDemo extends Application{
	public void start(Stage stage){
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(10, 10, 10, 10));
		rootNode.setVgap(5);
		rootNode.setHgap(5);
        // 创建输入用户名和口令的文本框，并将它们添加到网格面板中
		final Label label1 = new Label("用户名");
		final TextField name = new TextField();
		name.setPromptText("输入用户名");
		rootNode.add(label1, 0, 0);
		rootNode.add(name, 1, 0);

        Label label2 = new Label("口令");
		PasswordField password = new PasswordField();
		password.setPromptText("输入口令");
		rootNode.add(label2,0, 1);
		rootNode.add(password,1, 1);
		// 创建两个按钮并为它们注册事件处理器
		final Button submit = new Button("确定");
		final Button reset = new Button("重置");
		rootNode.add(submit,0,2);
		rootNode.add(reset,1,2);
		final Label label = new Label();    // 该标签用于显示提示信息
		rootNode.add(label, 0, 3, 2 , 1);
        //为“确定”按钮定义事件处理器
		submit.setOnAction((ActionEvent e) -> {
		    if (
		        (name.getText() != null && !name.getText().isEmpty())
		    ) {
		      label.setText(name.getText() + " " +
		          password.getText() + ", "  + "欢迎登录!");
		    } else {
		        label.setText("用户名不能为空!");
		    }
		});
       //为“重置”按钮定义事件处理器
		reset.setOnAction((ActionEvent e) -> {
		     // 清除文本框和标签上文本内容
            name.clear();
		    password.clear();
		    label.setText(null);
		});
        //为口令框定义事件处理器
		password.setOnAction((ActionEvent e) -> {
		    if (!password.getText().equals("dt90121")) {
		    	label.setText("口令不正确!");
		    	label.setTextFill(Color.rgb(210, 39, 30));
		    } else {
		    	label.setText("口令通过");
		    	label.setTextFill(Color.rgb(21, 117, 84));
		    }
		    password.clear();
		});
		
	    Scene scene = new Scene(rootNode, 300, 130);		
		stage.setScene(scene);
		stage.setTitle("文本框示例");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}
