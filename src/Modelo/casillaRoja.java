/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Windows 10
 */
public class CasillaRoja implements Casillero{
    private String color="rojo";
    private int[] numerosRojos= {1, 3, 5, 7, 9, 12, 14, 16, 18, 
                                19, 21, 23, 25, 27, 30, 32, 34, 36};
    @Override
    public boolean isCasillero(int numero) {
        for(int x=0; x<numerosRojos.length;x++){
            if (numero==numerosRojos[x]){
                return true;
            }
        }
        return false;        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
