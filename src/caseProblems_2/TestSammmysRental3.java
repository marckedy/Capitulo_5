/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

/**
 *
 * @author Usuario
 */
public class TestSammmysRental3 {
    
    public static void main(String[] args) {
        
        Rental3 renta = new Rental3("A123", 210);
        int tiempo1 = renta.getNumeroSegundos();
        renta.imprimir();
        
        System.out.println("");
        
        Rental3 renta2 = new Rental3("PWL23", 110);
        int tiempo2 = renta2.getNumeroSegundos();
        renta2.imprimir();
        
        System.out.println("");
        
        if(TestSammmysRental3.longerTime(tiempo1, tiempo2) == 1){
            System.out.println("El tiempo mas larga del: " + renta.getNumeroControl());
        }else{
            System.out.println("El tiempo mas larga del: " + renta2.getNumeroControl());
        }
        
        
        
        
    }
    
    public static int longerTime(int n1, int n2){
        if(n1 > n2){
            return 1;
        }
        return 2;
    }
}
