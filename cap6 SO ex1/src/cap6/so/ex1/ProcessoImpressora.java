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
public class ProcessoImpressora implements Runnable {
//fila da impressora

    FilaImpressora fila;
    //Recebendo a fila que a thread vai disputar recurso

    public ProcessoImpressora(FilaImpressora f) {
        fila = f;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " pronta para imprimir ");
        System.out.println("\n");
        
        fila.ImprimirComSemaforo();
        
        System.out.println("\n");
    }

}
