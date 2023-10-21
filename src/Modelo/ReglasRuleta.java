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
    public int apuestaBajoAlto(int monto){
        return monto*2;
    }
    public int apuestaDocena(int monto){
        return monto*3;
    }
    public int apuestaColumna(int monto){
        return monto*3;
    }
    public int apuestaTriple(int monto){
        return monto*11;
    }
    public int apuestaDoble(int monto){
        return monto*17;
    }
    public void apuestaEsquina(){
    }
    
    
    
}
