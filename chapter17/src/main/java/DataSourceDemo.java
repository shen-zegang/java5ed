//import com.zaxxer.hikari.HikariDataSource;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import module com.zaxxer.hikari;
import module java.sql;

void main(String[] args) {
        // 1. 配置 HikariCP
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/webstore?serverTimezone=UTC");
        config.setUsername("root");
        config.setPassword("123456");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // 连接池设置
        config.setMaximumPoolSize(40);
        config.setMinimumIdle(2);
        config.setIdleTimeout(30000);       // 空闲连接存活时间
        config.setConnectionTimeout(30000); // 获取连接超时时间
        config.setMaxLifetime(1800000);     // 连接最大存活时间

        // 2. 创建数据源
        try (HikariDataSource dataSource = new HikariDataSource(config);
             Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM books WHERE id < 104");
             ResultSet rs = stmt.executeQuery()) {

            // 3. 处理结果集
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" +
                                rs.getString(2) + "\t" +
                                rs.getString(3) + "\t" +
                                rs.getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
}
