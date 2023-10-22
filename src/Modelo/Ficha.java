/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Marcia Lafuente v1
 */
public class Ficha {
    protected int valor;
    protected String color;
    
    public Ficha(){
    
    }

    public Ficha(int valor, String color) {
        this.valor = valor;
        this.color = color;
    }
    public int sumarPila(int monto){
        return valor+monto;
    }

    public int getValor() {
        return valor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ficha{" + "valor=" + valor + ", color=" + color + '}';
    }
    
    
}
