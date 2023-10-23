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
    static Connection conexion=null;
    static Statement sentencia=null;
    ConectarBD con = new ConectarBD();
    
    public void MostrarResultados(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Jugador");
        modelo.addColumn("Puntaje");
        String consultasql = new String();
        consultasql = "SELECT nombre, puntaje From jugador ORDER BY puntaje ASC LIMIT 10";
        Statement st;
        try{
            conexion=con.establecerConexion(); 
            sentencia=conexion.createStatement();
            ResultSet rs = sentencia.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getString(1), rs.getString(2)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
    }
}
