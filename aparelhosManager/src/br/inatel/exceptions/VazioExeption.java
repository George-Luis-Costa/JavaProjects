/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author georg
 */
public class VazioExeption extends RuntimeException{
    private String marca;
    private String modelo;
    private int matricula;
    private String numSerie;
    private long IMEI;
    private String centroCusto;

    public VazioExeption(String marca, String modelo, int matricula, String numSerie) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public VazioExeption(String marca, String modelo, int matricula, long IMEI, String centroCusto) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.centroCusto=centroCusto;
        this.IMEI=IMEI;

    }

    
    public void Obrigatorio(){
        JOptionPane.showMessageDialog(null, "Erro informacoes obrigatorias");
    
    }
}
