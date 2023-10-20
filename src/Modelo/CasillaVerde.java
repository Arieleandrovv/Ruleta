/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Ariel Vera, Marcia Lafuente V1
 */
public class CasillaVerde implements Casillero {
    private String color="verde";
    private int numero=0;

    @Override
    public boolean isCasillero(int numero) {
        if (numero==0){
            return true;
        }
        return false;
    }

    public String getColor() {
        return color;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
}
