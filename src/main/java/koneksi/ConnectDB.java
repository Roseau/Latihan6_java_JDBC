/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author St0rm
 */
public class ConnectDB {
    public Connection getConnection(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername("hr");
        ds.setPassword("hr");
        ds.setUrl("jdbc:postgresql://localhost:5432/hr");
        ds.setDriverClassName("org.postgresql.Driver");
        Connection connection = null;
        try{
           connection = ds.getConnection();
           connection.setAutoCommit(false);
        }catch(SQLException sqle){
           System.err.printf("tidak dapat koneksi ke databas!");
            sqle.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            } 
        }
        return connection;
    }
}
