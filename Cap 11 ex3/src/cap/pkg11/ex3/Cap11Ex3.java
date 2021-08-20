/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap.pkg11.ex3;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author João Dutra
 */
public class Cap11Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(System.in);
        PrintStream ps = new PrintStream("log.txt");
        String[] palavrasChave = {"roubo","sequestro","assassinato","assalto","suicidio","bomba","terrorismo","armas","corrupcao","ameaça"};
        boolean captura = false;
        
        while ( teclado.hasNextLine())
        {
            String texto = teclado.nextLine();
            for (int i = 0; i < palavrasChave.length; i++) {
                if(texto.contains(palavrasChave[i]))
                    captura = true;
            }
            
            if (captura) {
                ps.println(texto);
            }
        }
    }
    
}
