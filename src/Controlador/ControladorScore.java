/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * Ariel Vera v1
 */
public class ControladorScore {
    private static Connection conexion=null;
    private static Statement sentencia=null;
    private ConectarBD con = new ConectarBD();
    
    public void MostrarResultados(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Jugador");
        modelo.addColumn("Puntaje");
        String consultasql = new String();
        consultasql = "SELECT nombre, puntaje From jugador ORDER BY puntaje DESC LIMIT 10";
        Statement st;
        try{
            conexion=con.establecerConexion(); 
            sentencia=conexion.createStatement();
            ResultSet rs = sentencia.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getString(1), rs.getInt(2)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
    }
}
