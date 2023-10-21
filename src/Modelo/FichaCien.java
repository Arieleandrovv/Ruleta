/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class FichaCien extends Ficha{

    public FichaCien(int valor, String color) {
        super(valor, color);
    }
    public int sumarFichaCien(int monto){
        return monto+100;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichaDiez{"+100+","+"azul");
        sb.append('}');
        return sb.toString();
    }
}
