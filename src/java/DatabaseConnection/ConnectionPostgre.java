/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

/**
 *
 * @author Dawid
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ConnectionPostgre {
    Connection connection;
    
    String url= "jdbc:postgresql://localhost:5432/northwind";
    String user= "postgres";
    String password= "postgres";
    
    public Connection dbConnection(){
        
        try{
        Class.forName("org.postgresql.Driver");
        } catch(ClassNotFoundException e) {
            e.getMessage();
        }
        
        try{
        DriverManager.getConnection(url,user,password);
        return connecion;
        } catch(SQLException ex) {
            Logger.getLogger(ConnectionPostgre.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public static void main(String[] args){
        ConnectionPostgre db = new ConnectionPostgre();
        db.dbConnection();
    }
    
}
