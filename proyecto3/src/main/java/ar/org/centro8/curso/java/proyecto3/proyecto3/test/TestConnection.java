package ar.org.centro8.curso.java.proyecto3.proyecto3.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalTime;

import ar.org.centro8.curso.java.proyecto3.proyecto3.connection.Connector;

public class TestConnection {
    
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        Connection conn=Connector.getConnection();
        System.out.println(LocalTime.now());
        try (ResultSet rs=conn
                .createStatement()
                .executeQuery("select version()");) {
            if(rs.next()) System.out.println(rs.getString(1));
            System.out.println(LocalTime.now());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(LocalTime.now());
        
    }
}
