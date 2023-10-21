/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class FichaVeinte extends Ficha {
    
    public FichaVeinte(int valor, String color) {
    super(valor, color);
        
    }
    
    public int sumarFichaVeinte(int monto){
        return monto+20;
    }
    public int restarFichaVeinte(int monto){
        return monto-20;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichaDiez{"+20+","+"magenta");
        sb.append('}');
        return sb.toString();
    }
}
