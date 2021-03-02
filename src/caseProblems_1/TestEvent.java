/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

/**
 *
 * @author Usuario
 */
public class TestEvent {
    
    public static void main(String[] args) {
        
        
        Event evento = new Event(10);
        
        evento.setInvitados(3);
        evento.setNumeroEvento("M1K3");
        evento.imprimir();
        
        
        Event evento2 = new Event("PW12",70);
        System.out.println("");
        evento2.imprimir();
        
        evento2.valoresPredeterminados();
        System.out.println("");
        evento2.imprimir();
    }
    
}
