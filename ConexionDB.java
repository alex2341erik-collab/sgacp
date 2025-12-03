/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Alumnos
 */
public class ConexionDB {
    private static final String url = "jdbc:mysql://localhost:3306/sgacp";
    private static final String usuario = "root";
    private static final String password = "";
    
    public static Connection conectar(){
        Connection conexion = null;
        try{

            conexion = DriverManager.getConnection(url,usuario, password);
            System.out.println("Se ha establecido la conexion");
        }
        catch(SQLException e) {
            System.out.println("Algun error ocurrio"+e.getMessage());
        }
        
        return conexion;
    }
    public static void main(String[] args) {
        conectar();
    }
    
}