/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class InsertarEstudainte {
    Connection conexion =ConexionDB.conectar();
    String nombre;
    String email;
    String carrera;

    public InsertarEstudainte(String nombre, String email, String carrera) {
        this.nombre = nombre;
        this.email = email;
        this.carrera = carrera;
    }

    public void InsertarEstudiante(String nombre, String email, String carrera){
    try{
             String sql = "INSERT INTO estudiante(nombre, email, carrera)VALUES(?,?,?)";
             PreparedStatement ps = conexion.prepareStatement(sql);
             ps.setString(1, nombre);
             ps.setString(2,email);
             ps.setString(3,carrera);
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
