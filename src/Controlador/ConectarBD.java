/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ConectarBD {
    private Connection conectar = null;
    
    private String user = "root";
    private String password = "";//*********** colocar el password de su base de datos
    private String dataBase = "ruleta_db";
    private String server = "localhost";
    private String puerto = "3306";
    private String driver = "com.mysql.cj.jdbc.Driver";    
    private String cadena = "jdbc:mysql://"+server+":"+puerto+"/"+dataBase;
    
    public Connection establecerConexion(){
        
        try{
            Class.forName(driver);
            conectar= DriverManager.getConnection(cadena,user,password);
            //JOptionPane.showMessageDialog(null, "Conexion establecida");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: Verifique su Estado de Conexion " + e.toString());
        }
        return conectar;
    }
}
