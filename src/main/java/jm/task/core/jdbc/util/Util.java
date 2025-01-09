package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.*;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static Connection connectJDBC()  {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Не удалось установить соединение с базой данных.");
            e.printStackTrace();

            throw new RuntimeException("Ошибка при установлении соединения с базой данных.", e);
        }
        System.out.println(con);
        return con;
    }
}
