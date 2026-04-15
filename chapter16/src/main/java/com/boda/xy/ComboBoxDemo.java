package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
public class ComboBoxDemo extends Application {
    final Button button = new Button ("发送邮件");
    final Label notification = new Label ();
    final TextField subject = new TextField("");
    final TextArea text = new TextArea ("");   
    String address = " "; 
    @Override 
    public void start(Stage stage) {
        final ComboBox<String> emailComboBox = new ComboBox<>();
        emailComboBox.getItems().addAll(
            "jacob.smith@example.com",
            "isabella.johnson@example.com",
            "ethan.williams@example.com",
            "emma.jones@example.com",
            "michael.brown@example.com"  
        );
        emailComboBox.setPromptText("邮箱地址");
        emailComboBox.setEditable(true);        
        emailComboBox.setOnAction((ActionEvent ev) -> {
            address = emailComboBox.getSelectionModel().getSelectedItem().toString();    
        });
        //创建优先级组合框
        final ComboBox<String> priorityComboBox = new ComboBox<>();
        priorityComboBox.getItems().addAll(
            "Highest",
            "High",
            "Normal",
            "Low",
            "Lowest" 
        );   
        priorityComboBox.setValue("Normal");
       //设置按钮事件处理器
  button.setOnAction((ActionEvent e) -> {
            if (emailComboBox.getValue() != null && 
                    !emailComboBox.getValue().toString().isEmpty()){
                notification.setText("邮件成功发送到：" + address);
                emailComboBox.setValue(null);
                if (priorityComboBox.getValue() != null &&
                        !priorityComboBox.getValue().toString().isEmpty()){
                    priorityComboBox.setValue(null);
                }
                subject.clear();
                text.clear();
            }
            else {
                notification.setText("没有选择收件人!");
            }
        });
        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(new Label("发送到: "), 0, 0);
        grid.add(emailComboBox, 1, 0);
        grid.add(new Label("优先级: "), 2, 0);
        grid.add(priorityComboBox, 3, 0);
        grid.add(new Label("邮件主题: "), 0, 1);
        grid.add(subject, 1, 1, 3, 1);            
        grid.add(text, 0, 2, 4, 1);
        grid.add(button, 0, 3);
        grid.add (notification, 1, 3, 3, 1);
        //创建根面板
        Group rootNode = new Group();
        rootNode.getChildren().add(grid);
        Scene scene = new Scene(rootNode, 500, 270); 
        stage.setTitle("组合框示例");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
