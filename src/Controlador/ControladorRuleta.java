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
    public int apuestaTriple(int numero, int [] arreglo){
        int valor=0;
        if (numero==0 || numero==3 || numero==2 ){
            valor=apuesta.apuestaTriple(arreglo[0]);
        }
        if(numero==0 || numero==2 || numero==1){
            valor=valor+apuesta.apuestaTriple(arreglo[1]);
        }
        return valor;
    }
    
    public int apuestaDoble(int numero, int [] arreglo){
        int valor=0;
        if (numero==1 || numero==2){
            valor=apuesta.apuestaDoble(arreglo[0]);
        }
        if(numero==2 || numero==3){
            valor=valor+apuesta.apuestaDoble(arreglo[1]);
        }
        if(numero==1 || numero==4){
            valor=valor+apuesta.apuestaDoble(arreglo[2]);
        }
        if(numero==2 || numero==5){
            valor=valor+apuesta.apuestaDoble(arreglo[3]);
        }
        if(numero==3 || numero==6){
            valor=valor+apuesta.apuestaDoble(arreglo[4]);
        }
        if(numero==4 || numero==5){
            valor=valor+apuesta.apuestaDoble(arreglo[5]);
        }
        if(numero==5 || numero==6){
            valor=valor+apuesta.apuestaDoble(arreglo[6]);
        }
        if(numero==4 || numero==7){
            valor=valor+apuesta.apuestaDoble(arreglo[7]);
        }
        if(numero==5 || numero==8){
            valor=valor+apuesta.apuestaDoble(arreglo[8]);
        }
        if(numero==6 || numero==9){
            valor=valor+apuesta.apuestaDoble(arreglo[9]);
        }
        if(numero==7 || numero==8){
            valor=valor+apuesta.apuestaDoble(arreglo[10]);
        }
        if(numero==8 || numero==9){
            valor=valor+apuesta.apuestaDoble(arreglo[11]);
        }
        if(numero==7 || numero==10){
            valor=valor+apuesta.apuestaDoble(arreglo[12]);
        }
        if(numero==8 || numero==11){
            valor=valor+apuesta.apuestaDoble(arreglo[13]);
        }
        if(numero==9 || numero==12){
            valor=valor+apuesta.apuestaDoble(arreglo[14]);
        }
        if(numero==10 || numero==11){
            valor=valor+apuesta.apuestaDoble(arreglo[15]);
        }
        if(numero==11 || numero==12){
            valor=valor+apuesta.apuestaDoble(arreglo[16]);
        }
        if(numero==10 || numero==13){
            valor=valor+apuesta.apuestaDoble(arreglo[17]);
        }
        if(numero==11 || numero==14){
            valor=valor+apuesta.apuestaDoble(arreglo[18]);
        }
        if(numero==12 || numero==15){
            valor=valor+apuesta.apuestaDoble(arreglo[19]);
        }
        if(numero==13 || numero==14){
            valor=valor+apuesta.apuestaDoble(arreglo[20]);
        }
        if(numero==14 || numero==15){
            valor=valor+apuesta.apuestaDoble(arreglo[21]);
        }
        if(numero==13 || numero==16){
            valor=valor+apuesta.apuestaDoble(arreglo[22]);
        }
        if(numero==14 || numero==17){
            valor=valor+apuesta.apuestaDoble(arreglo[23]);
        }
        if(numero==15 || numero==18){
            valor=valor+apuesta.apuestaDoble(arreglo[24]);
        }
        if(numero==16 || numero==17){
            valor=valor+apuesta.apuestaDoble(arreglo[25]);
        }
        if(numero==17 || numero==18){
            valor=valor+apuesta.apuestaDoble(arreglo[26]);
        }
        if(numero==16 || numero==19){
            valor=valor+apuesta.apuestaDoble(arreglo[27]);
        }
        if(numero==17 || numero==20){
            valor=valor+apuesta.apuestaDoble(arreglo[28]);
        }
        if(numero==18 || numero==21){
            valor=valor+apuesta.apuestaDoble(arreglo[29]);
        }
        if(numero==19 || numero==20){
            valor=valor+apuesta.apuestaDoble(arreglo[30]);
        }
        if(numero==20 || numero==21){
            valor=valor+apuesta.apuestaDoble(arreglo[31]);
        }
        if(numero==19 || numero==22){
            valor=valor+apuesta.apuestaDoble(arreglo[32]);
        }
        if(numero==20 || numero==23){
            valor=valor+apuesta.apuestaDoble(arreglo[33]);
        }
        if(numero==21 || numero==24){
            valor=valor+apuesta.apuestaDoble(arreglo[34]);
        }
        if(numero==22 || numero==23){
            valor=valor+apuesta.apuestaDoble(arreglo[35]);
        }
        if(numero==23 || numero==24){
            valor=valor+apuesta.apuestaDoble(arreglo[36]);
        }
        if(numero==22 || numero==25){
            valor=valor+apuesta.apuestaDoble(arreglo[37]);
        }
        if(numero==23 || numero==26){
            valor=valor+apuesta.apuestaDoble(arreglo[38]);
        }
        if(numero==24 || numero==27){
            valor=valor+apuesta.apuestaDoble(arreglo[39]);
        }
        if(numero==25 || numero==26){
            valor=valor+apuesta.apuestaDoble(arreglo[40]);
        }
        if(numero==26 || numero==27){
            valor=valor+apuesta.apuestaDoble(arreglo[41]);
        }
        if(numero==25 || numero==28){
            valor=valor+apuesta.apuestaDoble(arreglo[42]);
        }
        if(numero==26 || numero==29){
            valor=valor+apuesta.apuestaDoble(arreglo[43]);
        }
        if(numero==27 || numero==30){
            valor=valor+apuesta.apuestaDoble(arreglo[44]);
        }
        if(numero==28 || numero==29){
            valor=valor+apuesta.apuestaDoble(arreglo[45]);
        }
        if(numero==29 || numero==30){
            valor=valor+apuesta.apuestaDoble(arreglo[46]);
        }
        if(numero==28 || numero==31){
            valor=valor+apuesta.apuestaDoble(arreglo[47]);
        }
        if(numero==29 || numero==32){
            valor=valor+apuesta.apuestaDoble(arreglo[48]);
        }
        if(numero==30 || numero==33){
            valor=valor+apuesta.apuestaDoble(arreglo[49]);
        }
        if(numero==31 || numero==32){
            valor=valor+apuesta.apuestaDoble(arreglo[50]);
        }
        if(numero==32 || numero==33){
            valor=valor+apuesta.apuestaDoble(arreglo[51]);
        }
        if(numero==31 || numero==34){
            valor=valor+apuesta.apuestaDoble(arreglo[52]);
        }
        if(numero==32 || numero==35){
            valor=valor+apuesta.apuestaDoble(arreglo[53]);
        }
        if(numero==33 || numero==36){
            valor=valor+apuesta.apuestaDoble(arreglo[54]);
        }
        if(numero==34 || numero==35){
            valor=valor+apuesta.apuestaDoble(arreglo[55]);
        }
        if(numero==35 || numero==36){
            valor=valor+apuesta.apuestaDoble(arreglo[56]);
        }
        if(numero==0 || numero==3){
            valor=valor+apuesta.apuestaDoble(arreglo[57]);
        }
        if(numero==0 || numero==2){
            valor=valor+apuesta.apuestaDoble(arreglo[58]);
        }
        if(numero==0 || numero==1){
            valor=valor+apuesta.apuestaDoble(arreglo[59]);
        }
        return valor;
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
