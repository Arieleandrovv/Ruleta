/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Ariel Vera y Marcia Lafuente v2
 */
public class CasillaNegra implements Casillero {
    private String color="negro";
    private int[] numerosNegros= {2, 4, 6, 8, 10, 11, 13, 15, 17, 
                                20, 22, 24, 26, 28, 29, 31, 33, 35};

    @Override
    public boolean isCasillero(int numero) {
        for(int x=0; x<numerosNegros.length;x++){
            if (numero==numerosNegros[x]){
                return true;
            }
        }
        return false;
    }

    public String getColor() {
        return color;
    }

    public int[] getNumerosNegros() {
        return numerosNegros;
    }
    
}
