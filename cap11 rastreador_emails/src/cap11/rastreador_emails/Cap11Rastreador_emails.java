/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11.rastreador_emails;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author georg
 */
public class Cap11Rastreador_emails {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int opcao;
        int gec = 0, get = 0, gea = 0, geb = 0, gep = 0, ges = 0;
        boolean sair = true;
        while (sair) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Contar Cursos, 2 - Procura email, 3 - Sair"));
            //contar o numero de emails
            switch (opcao) {
                case 1:
                    try {
                        //apontando para o arquivo com inputStream
                        InputStream is = new FileInputStream("emails.txt");
                        //lendo caracteres
                        InputStreamReader isr = new InputStreamReader(is);
                        //montar as palavras do arquivo
                        BufferedReader br = new BufferedReader(isr);

                        String s = br.readLine();

                        while (s != null) {
                            if (s.contains("@gec")) {
                                gec++;
                            } else if (s.contains("@ges")) {
                                ges++;
                            } else if (s.contains("@get")) {
                                get++;
                            } else if (s.contains("@gea")) {
                                gea++;
                            } else if (s.contains("@geb")) {
                                geb++;
                            } else if (s.contains("@gep")) {
                                gep++;
                            }

                            //pegando proximas linhas
                            s = br.readLine();
                        }
                        JOptionPane.showMessageDialog(null,
                                "GEC: " + gec + "GEP: " + gep
                                + "GEA: " + gea + "GEB: " + geb
                                + "GES: " + ges + "GEt: " + get);
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "arquivo nao encontrado");
                    }

                    break;

                case 2:
                    String email = JOptionPane.showInputDialog("qual email procura?");
                    //apontando para o arquivo com inputStream
                    //apontando para o arquivo com inputStream
                    boolean achou = false;
                    InputStream is = new FileInputStream("emails.txt");
                    //lendo caracteres
                    InputStreamReader isr = new InputStreamReader(is);
                    //montar as palavras do arquivo
                    BufferedReader br = new BufferedReader(isr);

                    String s = br.readLine();

                    while (s != null) {
                        if (email.equalsIgnoreCase(s)) {
                            achou = true;
                            break;
                        }

                        s = br.readLine();
                    }
                    if (achou) {
                        JOptionPane.showMessageDialog(null, "email encontrado ;)");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "email nao encontrado :( ");
                    }
                    break;
                case 3:
                    sair = false;
                    break;

                default:
                    throw new AssertionError();
            }
        }

    }

}
