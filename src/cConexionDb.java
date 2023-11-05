
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class cConexionDb {
    private static final String URL = "jdbc:postgresql://localhost:5432/JavaDb";
    private static final String USER = "postgres"; // Nombre de usuario de PostgreSQL
    private static final String PASSWORD = "DB12345mb"; // Contraseña de PostgreSQL (reemplázala)
    private static String error = null; // Variable para almacenar mensajes de error

    // Método para obtener la conexión
    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Registra el controlador JDBC de PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Establece la conexión con la base de datos
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            error = "Error al conectar a la base de datos: " + e.getMessage();
            e.printStackTrace();
        }

        return connection;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conex) {
        try {
            if (conex != null) {
                conex.close(); // Cerramos la conexión
            }
        } catch (SQLException e) {
            error = "Error al cerrar la conexión: " + e.getMessage();
            e.printStackTrace();
        }
    }

    // Método para obtener el mensaje de error
    public static String getError() {
        return error;
    }
}
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author bores
// */
//public class cConexionDb {
//    
//    private static final String URL = "jdbc:postgresql://localhost:5432/JavaDb";
//    private static final String USER = "postgres"; // Nombre de usuario de PostgreSQL
//    private static final String PASSWORD = "DB12345mb"; // Contraseña de PostgreSQL (reemplázala)
//
//    public static Connection getConnection() throws SQLException {
//        Connection connection = null;
//
//        try {
//            // Registra el controlador JDBC de PostgreSQL
//            Class.forName("org.postgresql.Driver");
//
//            // Establece la conexión con la base de datos
//            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            throw new SQLException("Error al conectar a la base de datos.");
//        }
//
//        return connection;
//    }
//     public static void cerrarConexion(Connection conex) {
//        try {
//            if (conex != null) {
//                conex.close(); // Cerramos la conexión
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//     
//     public String getError(){
//         return error:
//     }
//}
//    
//
