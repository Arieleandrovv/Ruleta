/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.FichaCien;
import Modelo.FichaCincuenta;
import Modelo.FichaDiez;
import Modelo.FichaVeinte;

/**
 *
 * Ariel Vera y Marcia Lafuente v1
 */
public class ControladorRuleta {
    FichaDiez fdiez;
    FichaVeinte fveinte;
    FichaCincuenta fcincuenta;
    FichaCien fcien;

    public ControladorRuleta(FichaDiez fdiez, FichaVeinte fveinte, FichaCincuenta fcincuenta, FichaCien fcien) {
        this.fdiez = fdiez;
        this.fveinte = fveinte;
        this.fcincuenta = fcincuenta;
        this.fcien = fcien;
    }
    
    
    public int sumarPilaficha(boolean a, boolean b, boolean c, boolean d, int [] numero,int index){
        int monto=0;
        if (a){
            monto=fdiez.sumarFichaDiez(numero[index]);
        }else if (b){
            monto=fveinte.sumarFichaVeinte(numero[index]);
        }else if (c){
            monto=fcincuenta.sumarFichaCincuenta(numero[index]);
        }else if (d){
            monto=fcien.sumarFichaCien(numero[index]);
        }
        return monto;
    }
}
