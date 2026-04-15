package com.boda.xy;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Program09 extends Application {    
    final ComboBox<String> year = new ComboBox<>();
    final ComboBox<String> month = new ComboBox<>();
    BorderPane rootNode = new BorderPane();
    Font font = new Font("SansSerif", 14);    
    @Override 
    public void start(Stage stage) {     
    	for(int n = 2000; n < 2030; n++) {
        	year.getItems().add(n+"年");
        }            
        for(int n = 1; n <= 12; n++) {
        	month.getItems().add(n < 10?("0"+n):(""+n) + "月");
       	}
        var date = LocalDate.now();
        var dates = LocalDate.of(date.getYear(),date.getMonthValue(),1);
        
        year.setValue(dates.getYear()+ "年");
        int m = dates.getMonthValue();
        month.setValue((m<10?("0"+m):m )+ "月");       
        FlowPane  top = new FlowPane();    	       
        top.setHgap(10);
        top.setAlignment(Pos.CENTER);
        top.getChildren().addAll(year,month);
        GridPane grid = getPane(dates);                       
        ComboHandler handler = new ComboHandler();
        month.setOnAction(handler);
        year.setOnAction(handler);       
        //创建根面板
        rootNode.setPadding(new Insets(20,20,20,20));               
        rootNode.setTop(top);
        rootNode.setCenter(grid);              
        Scene scene = new Scene(rootNode, 360, 190); 
        stage.setTitle("简单日历程序");
        stage.setScene(scene);
        stage.show();
    }  
    public GridPane getPane(LocalDate dates) {
    	GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(3);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20));       
    	String [] week = {"一","二","三","四","五","六","日"};       
    	for(var i = 0; i < 7; i++) {
    		Label label = new Label(week[i]);
			label.setFont(font);
    		grid.add(label, i, 0); 
        }       
    	var daysOfMonth = dates.lengthOfMonth();      //月天数
		var dayOfWeek = dates.getDayOfWeek().getValue();     // 第1天是周几		
		int n = 1;		
		for(int i = 1;i < 7;i++) {
			for(int j = 0;j < 7;j++) {				 			
				if(i==1 && j <= dayOfWeek-2) {
					grid.add(new Label(""), j, i);				
				}else {
					if(n <= daysOfMonth) {
						Label label = new Label(n+"");
						label.setFont(font);
						grid.add(label, j, i);						
						n++;
					}
				}			
			}		
		}
    	return grid;
    }
    
    public class ComboHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent e) {
    		int y = Integer.parseInt(year.getValue().substring(0, 4));
            int m = Integer.parseInt(month.getValue().substring(0, 2));
            var dates = LocalDate.of(y,m,1);
            
    		GridPane grid = getPane(dates);
            rootNode.setCenter(grid);
        }  	
    }
    public static void main(String[] args) {
        launch(args);
    }
}

