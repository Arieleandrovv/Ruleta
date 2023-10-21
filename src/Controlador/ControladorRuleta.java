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
    
    
    public int[] sumarPilaficha(boolean a, boolean b, boolean c, boolean d, int [] numero,int index,int montoInicial){
        int monto=0;
        if (a){
            if(montoInicial>=10){
                monto=fdiez.sumarFichaDiez(numero[index]);
                montoInicial=fdiez.restarFichaDiez(montoInicial);
            }
        }else if (b){
            if(montoInicial>=20){
                monto=fveinte.sumarFichaVeinte(numero[index]);
                montoInicial=fveinte.restarFichaVeinte(montoInicial);
            }
        }else if (c){
            if(montoInicial>=50){
                monto=fcincuenta.sumarFichaCincuenta(numero[index]);
                montoInicial=fcincuenta.restarFichaCincuenta(montoInicial);
            }
        }else if (d){
            if(montoInicial>=100){
                monto=fcien.sumarFichaCien(numero[index]);
                montoInicial=fcien.restarFichaCien(montoInicial);
            }
        }
        int [] valores={monto,montoInicial};
        return valores;
    }
}
