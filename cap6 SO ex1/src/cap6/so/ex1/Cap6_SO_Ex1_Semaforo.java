/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6.so.ex1;

/**
 *
 * @author George
 */
public class Cap6_SO_Ex1_Semaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CRIANDO A FILA DA IMPRESSORA
        FilaImpressora fila = new FilaImpressora();

        //CRIANDO UM ARRAY DE 3 THREADS
        //COLOCANDO TODAS NA MESMA FILA
        Thread[] thread = new Thread[3];
        for (int i = 0; i < 3; i++) {
            thread[i] = new Thread(new ProcessoImpressora(fila));
        }

// DANDO START NAS THREADS
        for (int i = 0; i < 3; i++) {
            thread[i].start();
        }

    }

}
