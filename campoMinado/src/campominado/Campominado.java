/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author georg
 */
public class Campominado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jogadas = 0;
        Scanner sc = new Scanner(System.in);
        Random randomGenerator = new Random();
        int numAleatorio1 = randomGenerator.nextInt(3);
        int numAleatorio2 = randomGenerator.nextInt(3);

        Bombas[][] mareia = new Bombas[3][3];

        for (int i = 0; i < mareia.length; i++) {
            for (int j = 0; j < mareia.length; j++) {
                mareia[i][j] = new Bombas();
                mareia[i][j].bomba = false;
                mareia[i][j].passou = false;
            }
        }
        mareia[numAleatorio1][numAleatorio2].bomba = true;

        //questions
        System.out.println("Digite a posição a ser aferida. Cuidado com o maréia(bomba)! somente numeros de 0 a 2");
        int control = 0;
        int linha;
        int coluna;
        int verificaPreenchido = 0;
        do {
            do {
                linha = sc.nextInt();
                coluna = sc.nextInt();
                if (mareia[linha][coluna].passou == true) {
                    verificaPreenchido = 1;
                    System.out.println("Numero ja preenchido, digite novamente : ");
                } else {
                    verificaPreenchido = 0;
                }
            } while (!(linha < 3 && coluna < 3 && verificaPreenchido == 0));
            jogadas++;
            if (mareia[linha][coluna].bomba == true) {
                System.out.println("boooom! GAME OVER");
                control = 1;
                System.out.println("numero de jogadas: " + jogadas);
            } else if (jogadas == 8) {
                System.out.println("perfect you won!");
                break;
            } else {
                System.out.println("Nice, digite a proxima linha e coluna ");
                mareia[linha][coluna].passou = true;
            }

        } while ((control == 0));

    }
}
