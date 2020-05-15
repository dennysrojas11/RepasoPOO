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

//clase hija Camion(SubClase)
public class Camion extends Vehiculo{
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un camión");
        System.out.println("Cobrar peaje camión");
    }   
}