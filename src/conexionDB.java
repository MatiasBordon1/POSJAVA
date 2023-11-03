/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bores
 */
public class conexionDB {
         Connection conn;
    
    private void conection () {
    
        String url = "jdbc:postgresql://localhost/postgres";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "postgres");
        try {
            this.conn = DriverManager.getConnection(url, props);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT CURRENT_TIMESTAMP");
            rs.next();
            System.out.println(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(conexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    public static void main(String[] args) {
        new conexionDB().conection();
    
    }

    private void table () {
    
            
         try {
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("CREATE TABLE IF NOT EXISTS users (\n" +
                     "        id serial PRIMARY KEY,\n" +
                     "        firstname varchar(256),\n" +
                     "        lastname varchar(256),\n" +
                     "        phone_number varchar(256) unique,\n" +
                     "        email varchar(256) unique,\n" +
                     "        created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                     "        updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP\n" +
                     "    );");
         } catch (SQLException ex) {
             Logger.getLogger(conexionDB.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}

