/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author denny
 */

//clase hija Auto(SubClase)
public class Auto extends Vehiculo{
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un auto");
        System.out.println("Cobrar peaje auto");
    }
}
