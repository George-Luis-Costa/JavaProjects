/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcrypto.atv2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author georg
 */
public class JcryptoAtv2 {

    private static String Letra;
    private static BufferedWriter BufferedWriter;
    private static String novoPalavra;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String nome = (JOptionPane.showInputDialog("qual nome deseja criptografar"));
        int chave = Integer.parseInt(JOptionPane.showInputDialog("qual a chave criptografica"));

        // String novoNome
        char[] caracteres = new char[nome.length()];
        //aqui esta acontecendo a criptografia
        for (int i = 0; i < nome.length(); i++) {
            int decimal = nome.charAt(i);
            decimal = decimal - chave;
            char letra = (char) decimal;

            caracteres[i] = (char)letra;
        }
        String novaPalavra = new String(caracteres);
        System.out.println(novaPalavra);
        
//guardando o nome criptografado em um arquivo
        OutputStream os = new FileOutputStream("nome.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(novaPalavra);
        bw.close();
        //  osw.close();
        //  bw.close();
        JOptionPane.showMessageDialog(null, "Criptografia realizada! cheque o arquivo nome.txt");

    }

}
