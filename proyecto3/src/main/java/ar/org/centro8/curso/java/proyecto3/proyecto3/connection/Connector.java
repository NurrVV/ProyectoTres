package ar.org.centro8.curso.java.proyecto3.proyecto3.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    private static String driver = "org.mariadb.jdbc.Driver";

    private static String url = "jdbc:mariadb://localhost:3306/baseanimal";
    private static String user = "root";
    private static String pass = "";

    private static Connection conn = null;

    private Connector() {
    }

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, pass);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
