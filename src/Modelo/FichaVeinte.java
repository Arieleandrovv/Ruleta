/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Ariel Vera y Marcia Lafuente v2
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
        sb.append("FichaVeinte{"+super.getValor()+","+super.getColor());
        sb.append('}');
        return sb.toString();
    }
}
