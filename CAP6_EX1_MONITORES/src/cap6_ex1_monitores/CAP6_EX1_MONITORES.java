/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6_ex1_monitores;

/**
 *
 * @author George
 */
public class CAP6_EX1_MONITORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //criando Arrays de inputs
        int[] sinputs = {10, 20, 30, 40}; //100
        int[] sinputs2 = {10, 20, 30, 40, 50}; //150

        //criando e iniciando a Thread 1
        ThreadSoma ts = new ThreadSoma("thread 1", sinputs);
        Thread t1 = new Thread(ts, ts.nome);
        t1.start();

        //criando e iniciando a Thread 2
        ThreadSoma ts2 = new ThreadSoma("thread 2", sinputs2);
        Thread t2 = new Thread(ts2, ts2.nome);
        t2.start();

    }

}
