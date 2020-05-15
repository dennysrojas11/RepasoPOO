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
public class Peaje {
    /*
    //método para cobrar peaje a la moto
    public void cobrarPeajeMoto(Moto moto){
        moto.mostrarTipoVehiculo();
    }
    
    //método para cobrar peaje al bus
    public void cobrarPeajeBus(Bus bus){
        bus.mostrarTipoVehiculo();
    }
    
    //método para cobrar peaje al auto
    public void cobrarPeajeAuto(Auto auto){
        auto.mostrarTipoVehiculo();
    }
    
    //método para cobrar peaje al camión
    public void cobrarPeajeCamion(Camion camion){
        camion.mostrarTipoVehiculo();
    }
    */
    
    //método para cobrar peaje para cualquier vehículo
    public void cobrarPeaje(Vehiculo vehiculo){
        vehiculo.mostrarTipoVehiculo();
    }
}