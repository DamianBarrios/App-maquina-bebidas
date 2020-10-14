/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaBebidas;

public abstract class Cafe extends Bebida {

    public Cafe(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }


    @Override
    public String getTipo() {
        return " Café "+ super.getTipo();
    }
}

