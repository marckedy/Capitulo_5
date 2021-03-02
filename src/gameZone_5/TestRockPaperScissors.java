/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_5;

/**
 *
 * @author Usuario
 */

import java.util.Random;

public class TestRockPaperScissors {
    
    public static void main(String[] args) {
        int jugador1;
        int jugador2;
        
        RockPaperScissors juego = new RockPaperScissors();
        Random play = new Random();
        
        jugador1 = play.nextInt(3)+1;
        jugador2 = play.nextInt(3)+1;
        
        juego.setJugador1(jugador1);
        juego.setJugador2(jugador2);
        
        System.out.println("Primer jugador");
        System.out.println(juego.getJugador1());
        
        System.out.println("Segundo jugador");
        System.out.println(juego.getJugador2());
        
        System.out.println("");
        
        TestRockPaperScissors.evaluar(jugador1, jugador2);
        
    }
    
    public static void evaluar(int jugador1, int jugador2){
        if(jugador1 == jugador2){
            System.out.println("Empate");
        }else{
            switch(jugador1){
                case 1: TestRockPaperScissors.evaluar1(jugador2); break;
                case 2: TestRockPaperScissors.evaluar2(jugador2); break;
                case 3: TestRockPaperScissors.evaluar3(jugador2); break;
            }
        }
    }
    
    public static void evaluar1(int jugador2){
        if(jugador2 == 2){
            System.out.println("Gano el segundo jugador");
        }else{
            System.out.println("Gano el primer jugador");
        }
    }
    
    public static void evaluar2(int jugador2){
        if(jugador2 == 3){
            System.out.println("Gano el segundo jugador");
        }else{
            System.out.println("Gano el primer jugador");
        }
    }
    
    public static void evaluar3(int jugador2){
        if(jugador2 == 1){
            System.out.println("Gano el segundo jugador");
        }else{
            System.out.println("Gano el primer jugador");
        }
    }
    
}
