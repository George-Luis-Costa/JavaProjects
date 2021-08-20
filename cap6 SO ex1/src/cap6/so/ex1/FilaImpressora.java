/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6.so.ex1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author George
 */
public class FilaImpressora {

    //metodo que imprime sem semafaros
    public void ImprimirSemSemaforo() {
        System.out.println(Thread.currentThread().getName()
                + " esta imprimindo");
        System.out.println("Documento da "
                + Thread.currentThread().getName()
                + " ïmpressao com sucesso");
    }
//criando o semaforo
//com S = 1
    Semaphore semaforo = new Semaphore(1);

    void ImprimirComSemaforo() {
        try {
            semaforo.acquire(); //wait
            System.out.println(Thread.currentThread().getName()
                    + " esta imprimindo!");
        } catch (InterruptedException ex) {
        } finally {
            System.out.println("Documento da "
                    + Thread.currentThread().getName()
                    + " ïmpressao com sucesso ");
            semaforo.release(); // signal ()
        }

    }
}
