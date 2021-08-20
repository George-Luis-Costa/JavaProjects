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
public class Calculadora {

    // Variavel que irá guarda a soma
    private int soma;

    // metodo que faz uma soma 
    // Basta add synchronized  na variavel que se torna um monitor
    public synchronized int somaArray(int[] array) {
        soma = 0;

        //para execucao em desordem, sem monitor (Race condition), tire o synchronized
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];

            System.out.println("Executando a soma"
                    + Thread.currentThread().getName()
                    + " - Somando o valor "
                    + array[i]
                    + "com o total de " + soma);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

        }
        return soma;
    }

}
