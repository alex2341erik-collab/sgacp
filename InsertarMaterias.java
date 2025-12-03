/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author Alumnos
 */
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertarMaterias {
    Connection conexion =ConexionDB.conectar();
    String nombreMateria;
    String clave;
    String profesor;
    float porcentajeCalificacion;

    public InsertarMaterias(String nombreMateria, String clave, String profesor, float porcentajeCalificacion) {
        this.nombreMateria = nombreMateria;
        this.clave = clave;
        this.profesor = profesor;
        this.porcentajeCalificacion = porcentajeCalificacion;
    }

    public void InsertarMateria(String nombreMateria, String clave, String profesor, float porcentajeCalificacion){
    try{
             String sql = "INSERT INTO materia(nombre_materia,clave , profesor, porcentaje_de_aprobacion)VALUES(?,?,?,?)";
             PreparedStatement ps = conexion.prepareStatement(sql);
             ps.setString(1, nombreMateria);
             ps.setString(2,clave);
             ps.setString(3,profesor);
             ps.setFloat(4, porcentajeCalificacion);
             ps.executeUpdate();
             System.out.println("Todo bien se agregaron valores");
             conexion.close();
         }
         catch(SQLException e){
             System.out.println("ERROR de algun tipo");
         }
}
    public static void main(String[] args){
     
     
    }  
}
