/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class FichaCincuenta extends Ficha{

    public FichaCincuenta(int valor, String color) {
        super(valor, color);
    }
    public int sumarFichaCincuenta(int monto){
        return monto+50;
    }
    public int restarFichaCincuenta(int monto){
        return monto-50;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichaDiez{"+50+","+"verde");
        sb.append('}');
        return sb.toString();
    }
}
