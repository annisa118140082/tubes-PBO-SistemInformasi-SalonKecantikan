package awal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Awal {
    private static Connection MySQLConfig;
            static Connection configDB() throws SQLException{
                try{
                    String url="jdbc:mysql://localhost:3306/latihanjavadatabase";
                    String user="root";
                    String pass="";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    MySQLConfig= DriverManager.getConnection(url,user,pass);
                }catch (SQLException a){
                    System.out.println("Koneksi ke Database Gagal "+a.getMessage());
                }
                return MySQLConfig;
              }  
            }
   
