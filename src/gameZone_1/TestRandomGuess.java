/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class TestRandomGuess {
    
    public static void main(String[] args) {
        
        int indice = 0;
        int numero;
        int numeroAleatorio;
        
        RandomGuess player = new RandomGuess();
        player.numeroRandom();
        numeroAleatorio = player.getNumero();
        
        Scanner jugar = new Scanner(System.in);
        
        System.out.println("Adivina el numero, tienes 6 intentos");
        
        do{
            numero = jugar.nextInt();
            indice ++;
            TestRandomGuess.evaluarNumero(numero, numeroAleatorio);
        }while((indice < 6) && (numeroAleatorio != numero));
        
        if(numeroAleatorio != numero){
            System.out.println("");
            System.out.println("El numero era " + numeroAleatorio);
        }
    }
    
    public static void evaluarNumero(int numero, int numeroAleatorio){
        if(numero < numeroAleatorio){
            System.out.println("Es un numero más grande");
        }else{
            if(numero > numeroAleatorio){
                System.out.println("Es un numero mas pequeño");
            }else{
                System.out.println("Correcto");
            }
        }
    }
}
