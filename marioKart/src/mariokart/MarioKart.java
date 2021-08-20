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
public class MarioKart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando as partes
        Piloto novoPiloto = new Piloto();
        novoPiloto.nome = "Luigi";
        novoPiloto.vilao = false;
        
        // Colocando o objeto parte dentro do todo
        Kart novoKart = new Kart();
        novoKart.nome = "Sprinter";
        novoKart.motorDoKart.cilindradas = 50;
        novoKart.motorDoKart.velocidadeMaxima = 100;
        novoKart.pilotoDoKart = novoPiloto;
        
        System.out.println("*Mostrando Resultados:");
        System.out.println("Kart:"+novoKart.nome);
        System.out.println("Piloto:"+
                novoKart.pilotoDoKart.nome);
        System.out.println("Motor cc:"+
                novoKart.motorDoKart.cilindradas);
        
    }
    
}
