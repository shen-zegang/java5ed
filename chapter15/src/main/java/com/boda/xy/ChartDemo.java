package com.boda.xy;
import module javafx.controls;
public class ChartDemo extends Application {
    @Override
    public void start(Stage stage) {
        var txt = new Text("考试成绩分布图");
        var pc = new PieChart();
        pc.getData().add(new PieChart.Data("优秀20%", 20));
        pc.getData().add(new PieChart.Data("良好25.6%", 25.6));
        pc.getData().add(new PieChart.Data("中等28.4%", 28.4));
        pc.getData().add(new PieChart.Data("及格18%", 18));
        pc.getData().add(new PieChart.Data("不及格8%", 8));

        var vb = new VBox(txt, pc);
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(10, 10, 10, 10));
        stage.setTitle("图表示例");
        var scene = new Scene(vb, 500, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
