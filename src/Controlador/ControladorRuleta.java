/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CasillaNegra;
import Modelo.CasillaRoja;
import Modelo.CasillaVerde;
import Modelo.FichaCien;
import Modelo.FichaCincuenta;
import Modelo.FichaDiez;
import Modelo.FichaVeinte;
import Modelo.ReglasRuleta;

/**
 *
 * Ariel Vera y Marcia Lafuente v1
 */
public class ControladorRuleta {
    FichaDiez fdiez;
    FichaVeinte fveinte;
    FichaCincuenta fcincuenta;
    FichaCien fcien;
    ReglasRuleta apuesta;
    CasillaNegra cane;
    CasillaRoja caro;
    CasillaVerde cave;
    private int [] primeraColumna={1,4,7,10,13,16,19,22,25,28,31,34};
    private int [] segundaColumna={2,5,8,11,14,17,20,23,26,29,32,35};
    private int [] terceraColumna={3,6,9,12,15,18,21,24,27,30,33,36};
   
    public ControladorRuleta(FichaDiez fdiez, FichaVeinte fveinte, FichaCincuenta fcincuenta, FichaCien fcien) {
        this.fdiez = fdiez;
        this.fveinte = fveinte;
        this.fcincuenta = fcincuenta;
        this.fcien = fcien;
        apuesta=new ReglasRuleta();
        cane= new CasillaNegra();
        caro= new CasillaRoja();
        cave= new CasillaVerde();
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
    public int apuestaColor(int numero, int [] arreglo){
        if(cane.isCasillero(numero)){
            return apuesta.apuestaColor(arreglo[1]);
        }else if(caro.isCasillero(numero)){
            return apuesta.apuestaColor(arreglo[0]);
        }else {
            return 0;
        }
    }
    public int apuestaParImpar(int numero, int [] arreglo){
        if (numero==0){
            return 0;
        }else if (numero%2==0){
            return apuesta.apuestaParImpar(arreglo[0]);
        }else{
            return apuesta.apuestaParImpar(arreglo[1]);
        }
    }
    public int apuestaBajoAlto(int numero, int [] arreglo){
        if (numero==0){
            return 0;
        }else if (numero<=18){
            return apuesta.apuestaBajoAlto(arreglo[0]);
        }else{
            return apuesta.apuestaBajoAlto(arreglo[1]);
        }
    }
    
    public int apuestaDocena(int numero, int [] arreglo){
        if (numero==0){
            return 0;
        }else if (numero<=12){
            return apuesta.apuestaBajoAlto(arreglo[0]);
        }else if(numero>=25){
            return apuesta.apuestaBajoAlto(arreglo[2]);
        }else{
            return apuesta.apuestaBajoAlto(arreglo[1]);
        }
    }
    
    public int apuestaColumna(int numero, int [] arreglo){
        if (numero==0){
            return 0;
        }else if (isInColumna(numero,primeraColumna)){
            return apuesta.apuestaColumna(arreglo[0]);
        }else if(isInColumna(numero,segundaColumna)){
            return apuesta.apuestaColumna(arreglo[1]);
        }else{
            return apuesta.apuestaColumna(arreglo[2]);
        }
    }
    
    private boolean isInColumna(int numero, int [] columna){
        for(int x=0; x<columna.length;x++){
            if (numero==columna[x]){
                return true;
            }
        }
        return false;
    }
    
}
