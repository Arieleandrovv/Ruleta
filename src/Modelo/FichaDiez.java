/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class FichaDiez extends Ficha {
    
    public FichaDiez(int valor, String color) {
        super(valor, color);
        
    }
    
    @Override
    public int sumarPila(int monto){
        return monto+10;
    }
    public int restarFichaDiez(int monto){
        return monto-10;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichaDiez{"+super.getValor()+","+super.getColor());
        sb.append('}');
        return sb.toString();
    }
    
    
}
