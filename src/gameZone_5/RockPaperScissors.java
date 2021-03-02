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
public class RockPaperScissors {
    private Juego jugador1;
    private Juego jugador2;

    public Juego getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        switch(jugador1){
            case 1: this.jugador1 = Juego.Piedra; break;
            case 2: this.jugador1 = Juego.Papel; break;
            case 3: this.jugador1 = Juego.Tijeras; break;
        }
    }

    public Juego getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        switch(jugador2){
            case 1: this.jugador2 = Juego.Piedra; break;
            case 2: this.jugador2 = Juego.Papel; break;
            case 3: this.jugador2 = Juego.Tijeras; break;
        }
    }
    
    
    
    
}
