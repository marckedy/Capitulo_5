/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Dados2 {
    
    private int[] numero = new int [2];
    
    public Dados2(){
    this.Lanzar();
    }
    
    public int getNumero1(){
        return this.numero[0];
    }
    
    public int getNumero2(){
        return this.numero[1];
    }
    
    public void Lanzar(){
        int dado = 0;
        
        Random r = new Random();
        
        do{
            int aleatorio = r.nextInt(6)+1;
            this.numero[dado] = aleatorio;
            dado++;
        }while(dado < 2);
    }
}
