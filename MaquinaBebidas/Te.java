/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaBebidas;

/**
 *
 * @author Dami
 */
public abstract class Te extends Bebida {

    public Te(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }

    @Override
    public String getTipo() {
        return " Té "+ super.getTipo();
    }
}
