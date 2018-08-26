/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacourse.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException; //добавили

/**
 *
 * @author admin
 */
public class SimpleDb {
    public static void main(String[] args) {
       Connection connection;
       Statement stmt;
       ResultSet rs;
       String errMessage = null;
       try{
           Class.forName("org.postgresql.Driver").newInstance();
           connection = DriverManager.getConnection(
                   "jdbc:postgresql://localhost:5432/postgres", "postgres", "1");
           String query = "select * from doctypes";
           stmt = connection.createStatement();
           rs = stmt.executeQuery(query);
           System.out.println(connection.isClosed());
           try{
              // Количество колонок в результирующем запросе
                int columns = rs.getMetaData().getColumnCount();
              // Перебор строк с данными
                while(rs.next()){
                for (int i = 1; i <= columns; i++){
                System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
              }
                System.out.println();
              rs.close();
           } catch (SQLException e) {
               errMessage = e.getMessage();
               System.out.println(errMessage);
             }
       } catch (Exception e) {
           errMessage = e.getMessage();
           System.out.println(errMessage);
         }
       }
}   
    

