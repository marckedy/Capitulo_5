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
import java.util.Random;

public class RandomGuess {
    
    private int numero;
    private int jugador;

    public int getNumero() {
        return this.numero;
    }

    public void numeroRandom() {
        Random n = new Random();
        this.numero = n.nextInt(1000)+1;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }
    
    
    
}
