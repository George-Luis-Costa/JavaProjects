/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariokart;

/**
 *
 * @author RenZo
 */
public class Kart {
    
    String nome;
    Piloto pilotoDoKart;
    Motor motorDoKart;
    
    public Kart()
    {
        motorDoKart = new Motor();
    }
    
    public void pular(){
        System.out.println("O "+nome+" pulou!");
    }
    
    public void soltaTurbo()
    {
        System.out.println("O "+nome+" soltou turbo!");
    }
    
    public void fazerDrift()
    {
        System.out.println("O "+nome+" derrapou!");
    }
    
}
