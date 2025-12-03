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
public class InsertarActividad {
    Connection conexion =ConexionDB.conectar();
    String nombreactividad;
    String fechaEntrega;
    int puntajeMaximo;
    String tipoActividad;
    String categoria;
    int poderacionParcial;

    public InsertarActividad(String nombreactividad, String fechaEntrega, int puntajeMaximo, String tipoActividad, String categoria, int poderacionParcial) {
        this.nombreactividad = nombreactividad;
        this.fechaEntrega = fechaEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.tipoActividad = tipoActividad;
        this.categoria = categoria;
        this.poderacionParcial = poderacionParcial;
    }

    

    public void InsertarMateria(String nombreactividad, String fechaEntrega, int puntajeMaximo, String tipoActividad, String categoria, int poderacionParcial){
    try{
             String sql = "INSERT INTO actividad(nombre_actividad,fecha_entrega , puntaje_maximo, tipo_actividad, categoria, poderacion_parcial)VALUES(?,?,?,?,?,?)";
             PreparedStatement ps = conexion.prepareStatement(sql);
             ps.setString(1, nombreactividad);
             ps.setString(2,fechaEntrega);
             ps.setInt(3,puntajeMaximo);
             ps.setString(4, tipoActividad);
             ps.setString(5,categoria);
             ps.setInt(6,poderacionParcial);
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

