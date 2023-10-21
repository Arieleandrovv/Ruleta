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
    private int valor;
    private String color;

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
    
    
}
