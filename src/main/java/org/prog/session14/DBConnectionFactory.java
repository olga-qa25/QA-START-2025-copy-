package org.prog.session14;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionFactory {

    @SneakyThrows
    public static Connection getConnection() {
        String browser = System.getProperty("browser", "local_chrome");
        Class.forName("com.mysql.cj.jdbc.Driver");
        if (browser != null && browser.contains("jenkins")) {
            return DriverManager.getConnection(
                    "jdbc:mysql://mysql-db-1:3306/db", "root", "password");
        } else {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db", "root", "password");
        }
    }
}
