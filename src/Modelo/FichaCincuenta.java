/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Ariel Vera
 */
public class FichaCincuenta extends Ficha{
    private int valor;
    public FichaCincuenta(int valor, String color) {
        super(valor, color);
        this.valor=50;
    }
    public int sumarFichaCincuenta(int monto){
        return monto+valor;
    }
    public int restarFichaCincuenta(int monto){
        return monto-50;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichaCincuenta{"+super.getValor()+","+super.getColor());
        sb.append('}');
        return sb.toString();
    }
}
