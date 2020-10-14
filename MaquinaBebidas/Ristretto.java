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
public class Ristretto extends Cafe {

    private double precio = 110;

    public Ristretto(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}