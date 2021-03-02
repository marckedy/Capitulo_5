/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

/**
 *
 * @author Usuario
 */
public class Dosdados2 {
    
    public static void main(String[] args) {
        Dados2 dados = new Dados2();
        
        int dado1 = dados.getNumero1();
        int dado2 = dados.getNumero2();
        System.out.println(dado1);
        System.out.println(dado2);
        
        Dosdados2.evaluar(dado1, dado2);
    }
    
    public static void evaluar(int dado1, int dado2){
        if(dado1 == dado2){
            System.out.println("Son pares");
        }else{
            if(dado1 < dado2){
                System.out.println("El segundo dado es mayor");
            }else{
                System.out.println("El primer dado es mayor");
            }
        }
    }
}
