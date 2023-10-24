/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Ariel Vera y Marcia Lafuente v2
 */
public class FichaCien extends Ficha implements Casillero{

    public FichaCien(int valor, String color) {
        super(valor, color);
    }
    public int sumarFichaCien(int monto){
        return monto+100;
    }
    public int restarFichaCien(int monto){
        return monto-100;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichaCien{"+super.getValor()+","+super.getColor());
        sb.append('}');
        return sb.toString();
    }
    @Override
    public boolean isCasillero(int numero) {
        return false;
    }
}
