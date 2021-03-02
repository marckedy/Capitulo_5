/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class TestLottery {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        int puntos=0;
        int correctos;
        Lottery jugar = new Lottery();
        
        jugar.imprimirNumerosAleatorios();
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        
        jugar.numeroJugaro(num1, num2, num3);
        
        
        if(jugar.compararOrden() == 1){
            System.out.println("Adivinaste los numeros en orden");
            System.out.println("Puntos ganados: 1000000" );
        }else{
            correctos = jugar.comparar();
            System.out.println("Adivinaste " + correctos);
            
            switch(correctos){
                case 1: puntos = 10; break;
                case 2: puntos = 100; break;
                case 3: puntos = 1000; break;
            }
            
            System.out.println("Puntos ganados: " + puntos);
        }
        
    }
}
