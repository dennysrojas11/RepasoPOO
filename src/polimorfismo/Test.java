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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaro los objetos que heredan de tipo vehículo
       Auto auto=new Auto();
       Moto moto=new Moto();
       Bus bus=new Bus();
       Camion camion=new Camion();
       
       //declaro el objeto peaje para identificar y cobrar el peaje de acuerdo al tipo de vehiculo
       Peaje peaje=new Peaje();
       
       /*
       //cobrar peaje auto
       peaje.cobrarPeajeAuto(auto);
       System.out.println("");
        
       //cobrar peaje bus
       peaje.cobrarPeajeBus(bus);
       System.out.println("");
       
       //cobrar peaje camión
       peaje.cobrarPeajeCamion(camion);
       System.out.println("");
       
       //cobrar peaje moto
       peaje.cobrarPeajeMoto(moto);
       */
       
       //cobrar peaje para cualquier vehículo
       peaje.cobrarPeaje(auto);
    }   
}