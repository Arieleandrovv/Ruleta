/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Windows 10
 */
public class CasillaVerde implements Casillero{
    private String color="verde";

    @Override
    public boolean isCasillero(int numero) {
        if (numero==0){
            return true;
        }else{
            return false;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
