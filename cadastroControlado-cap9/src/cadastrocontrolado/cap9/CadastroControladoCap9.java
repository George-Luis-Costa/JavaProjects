/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrocontrolado.cap9;

/**
 *
 * @author georg
 */
public class CadastroControladoCap9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadastro cad = new Cadastro();
        
        //vamos adicionar os codigos
        cad.addCodigo("mp-1234");
        cad.addCodigo("dp-1234");
        cad.addCodigo("bp-1234");
        cad.addCodigo("dp-1234");
        cad.addCodigo("xp-1234");
        cad.addCodigo("fy-1234");
        cad.mostraCodigos();
    }
    
}
