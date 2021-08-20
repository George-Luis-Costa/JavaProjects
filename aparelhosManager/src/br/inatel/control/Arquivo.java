/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.control;

import br.inatel.model.Aparelho;
import br.inatel.model.Notebook;
import br.inatel.model.Smartphone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo {

    OutputStream os = null;
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;
    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    public void addAparelho(Aparelho ap) {
        try {
            os = new FileOutputStream("Lista de Aparelhos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            if (ap instanceof Notebook) {
                Notebook nt = new Notebook();
                nt=(Notebook)ap;
                bw.write("Notebook ---------------------------\n");
                bw.write(nt.marca + "\n");
                bw.write(nt.modelo + "\n");
                bw.write(nt.getMatricula() + "\n");
                bw.write(((Notebook) nt).getNumSerie() + "\n");
            } else if ((ap instanceof Smartphone)) {
                Smartphone sp = new Smartphone();
                sp=(Smartphone) ap;
                bw.write("Smartphone ---------------------------\n");
                bw.write(ap.marca + "\n");
                bw.write(ap.modelo + "\n");
                bw.write(ap.getMatricula() + "\n");
                bw.write((int) ((Smartphone) ap).getIMEI()+"\n");
                bw.write(((Smartphone) ap).getCentroCusto()+"\n");
            }

        } catch (Exception e) {
            System.out.println("Entrada incorreta: " + e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Aparelho> buscarAparelho() {

        ArrayList<Aparelho> ap = new ArrayList<>();

        try {
            is = new FileInputStream("Lista de Aparelhos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String linhaLer = null;

            //BUSCAR LIVROS
            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("Notebook")) {
                    Notebook aux = new Notebook();
                    aux.marca = br.readLine();
                    aux.modelo = br.readLine();
                    aux.setMatricula(Integer.parseInt(br.readLine()));
                    aux.setNumSerie(br.readLine()); 
                    ap.add(aux);
                }else if (linhaLer.contains("Smartphone")) {
                    Smartphone aux = new Smartphone();
                    aux.marca = br.readLine();
                    aux.modelo = br.readLine();
                    aux.setMatricula(Integer.parseInt(br.readLine()));
                    aux.setIMEI(Long.parseLong(br.readLine())); 
                    aux.setCentroCusto(br.readLine()); 
                    ap.add(aux);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return ap;
    }
}
