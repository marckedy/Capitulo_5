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
import java.util.Random;

public class Lottery {
    
    int[] numero = new int [3];
    int[] jugador = new int[3];
    Random num = new Random();
    
    
    public void imprimirNumerosAleatorios(){
        int indice = 0;
        do{
            this.numero[indice] = num.nextInt(9);
            System.out.print(this.numero[indice] + " ");
            indice++;
        }while(indice < 3);
    }
    
    public void numeroJugaro(int num1, int num2, int num3){
        this.jugador[0] = num1;
        this.jugador[1] = num2;
        this.jugador[2] = num3;
    }
    
    public int comparar(){
        int r=-1;
        int correctas=0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j!=r){
                    if(this.numero[i] == this.jugador[j]){
                        correctas++; 
                        r=j;
                        break;
                    }
                }
            }
        }
        return correctas;
    }
    
    public int compararOrden(){
        int indice=0;
        do{
            if(this.numero[indice] != this.jugador[indice]){
                return 0;
            }
            indice++;
        }while(indice < 3);
        
        return 1;
    }
    
}
