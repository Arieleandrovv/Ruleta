/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Marcia Lafuente v1
 */
public class ReglasRuleta {
    
    
    
    public int apuestaIndividual(int monto){
        return monto*36;
    }
    public int apuestaColor(int monto){
        return monto*2;
    }
    public int apuestaParImpar(int monto){
        return monto*2;
    }
    public void apuestaBajoAlto(){
    }
    public void apuestaDocena(){
    }
    public void apuestaColumna(){
    }
    public void apuestaLinea(){
    }
    public void apuestaEsquina(){
    }
    
    
    
}
