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

//clase hija Moto(SubClase)
public class Moto extends Vehiculo{
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un camión");
        System.out.println("Cobrar peaje camión");
    }  
}
