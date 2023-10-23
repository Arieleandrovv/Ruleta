/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import Modelo.Ficha;
import Modelo.FichaDiez;
import Modelo.FichaVeinte;
import Vista.InterfazRuleta;
/**
 *
 * @author PC
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Ficha a= new Ficha(5, "rojo");
        FichaDiez diez =new FichaDiez(10,"verde");
        FichaVeinte veinte=new FichaVeinte (20,"azul");
        a=diez;
       
        
        Ficha b= new FichaDiez(1,"rojo");        
        System.out.println("1 "+b);
        
        FichaDiez di = new FichaDiez(10,"verde");
        System.out.println("2 "+di);
        
        FichaVeinte ve= new FichaVeinte(20,"azul");
        System.out.println("3 "+ve);
        
        b =(Ficha) ve;
        System.out.println("4 "+b);
        
        di =new FichaDiez(20,"magenta");
        System.out.println("5 "+di);*/
        
        InterfazRuleta ventana=new InterfazRuleta();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        
        /*Ficha nueva2= (Ficha) diez;
        System.out.println(nueva2.getColor());*/
    }
    
}
