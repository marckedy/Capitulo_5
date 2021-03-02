/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

/**
 *
 * @author Usuario
 */
public class Card2 {
    
    private Suit suit;
    private Suit suit2;
    private int num;
    private int num2;
    
    public Card2(){
    this.num = 12; 
    this.num2 = 11;
    this.suit = Suit.CORAZONES;
    this.suit2 = Suit.PICAS;
    
    }
    
    public void setSuit(int s){
        switch(s){
            case 1: suit = Suit.CORAZONES; break;
            case 2: suit = Suit.DIAMANTES; break;
            case 3: suit = Suit.PICAS; break;
            case 4: suit = Suit.TREBOLES; break;
        }
    }
    
    public void setSuit2(int s){
        switch(s){
            case 1: suit2 = Suit.CORAZONES; break;
            case 2: suit2 = Suit.DIAMANTES; break;
            case 3: suit2 = Suit.PICAS; break;
            case 4: suit2 = Suit.TREBOLES; break;
        }
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    public Suit getSuit2(){
        return this.suit2;
    }
    
    public void setNumero(int num){
        this.num = num;
    }
    
    public void setNumero2(int num){
        this.num2 = num;
    }
    
    public int getNumero(){
        return this.num;
    }
    
    public int getNumero2(){
        return this.num2;
    }
    
    public int evaluar(){
        if((this.num == this.num2) && (this.suit == this.suit2)){
            return 0;
        }
        return 1;
    }
    
    public void ganador(){
        if(this.num == this.num2){
            System.out.println("Es un empate");
        }else{
            if(this.num > this.num2){
                System.out.println("Gano la computadora");
            }else{
                System.out.println("Gano el humano");
            }
        }
    }
    
}
