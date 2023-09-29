/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.util.logging.Logger;
import java.util.logging.Level;
import org.mariadb.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author JFGIR
 */
public class Singleton {

    private static Singleton instancia;
    Connection connetion;

    private static final String DATABASEURL = "jdbc:mariadb://localhost:3306/producto";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private  Singleton() {
        try {
            connetion =  (Connection) DriverManager.getConnection(DATABASEURL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
    
    
    public static  Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return  instancia;
    }
    
    public Connection getConnection(){
        return  connetion;
    }
    
    
    public void closeConnection(){
        if(connetion != null){
            try {
                connetion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    

}
