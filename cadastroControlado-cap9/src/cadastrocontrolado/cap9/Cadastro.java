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
public class Cadastro {

    String codigosValidos[] = new String[50];
    String codigosInvalidos[] = new String[50];

    public void addCodigo(String codigo) {
        if (codigo.startsWith("mp-") || codigo.startsWith("dp-")
                || codigo.startsWith("bp-") && codigo.length() == 7) {

            for (int i = 0; i < codigosValidos.length; i++) {
                if (codigosValidos[i] == null) {
                    codigosValidos[i] = codigo;
                    break;
                }
            }
        } else {

            try {
                throw new CodigoDesconhecidoException();
            } catch (CodigoDesconhecidoException e) {
                for (int i = 0; i < codigosInvalidos.length; i++) {
                    if (codigosInvalidos[i] == null) {
                        codigosInvalidos[i] = codigo;
                        break;
                    }
                }
            }

        }
    }

    public void mostraCodigos() {
        System.out.println("codigos validos");
        for (int i = 0; i < codigosValidos.length; i++) {
            if (codigosValidos[i] != null) {
                System.out.println(codigosValidos[i]);

            }
        }
        System.out.println("codigos invalidos");
        for (int i = 0; i < codigosInvalidos.length; i++) {
            if (codigosInvalidos[i] != null) {
                System.out.println(codigosInvalidos[i]);

            }
        }
    }
}
