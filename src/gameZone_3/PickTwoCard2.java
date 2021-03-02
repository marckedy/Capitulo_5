/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

import java.util.Random;

public class PickTwoCard2 {
    
    public static void main(String[] args) {
        Card2 c = new Card2();
        Random r = new Random();
        
        int aleatorio = r.nextInt(13) + 1;
        int suit = r.nextInt(4)+1;
        int repetir=0;
        
        c.setSuit(suit);
        c.setNumero(aleatorio);
        
        do{        
            aleatorio = r.nextInt(13) + 1;
            suit = r.nextInt(4)+1;
        
            c.setSuit2(suit);
            c.setNumero2(aleatorio);
        
            if(c.evaluar() == 1){
                repetir = 1;
            }
            
        }while(repetir ==0);
        
        System.out.println("Juego de la computadora:");
        System.out.println(c.getNumero());
        System.out.println(c.getSuit());
        System.out.println("");
        System.out.println("Juego del humano:");
        System.out.println(c.getNumero2());
        System.out.println(c.getSuit2());
        
        System.out.println("");
        c.ganador();
    }
}
