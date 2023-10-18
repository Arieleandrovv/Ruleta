/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Marcia Lafuente v1
 */
public class Rueda {
    //aleatoriedad 
    public int aleatorio()
    {
        int min = 0;
        int max = 36;
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        return randomValue ;
    }
    
    
}
