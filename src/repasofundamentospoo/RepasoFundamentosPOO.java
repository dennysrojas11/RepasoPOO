/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasofundamentospoo;

/**
 *
 * @author denny
 */
public class RepasoFundamentosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo un nuevo objeto de tipo celular, con el constructor vacío
        Celular celular=new Celular();
        
        //le asigno la marca, modelo y color
        celular.setMarca("Nokia");
        celular.setModelo("1100");
        celular.setColor("Gris");
        
        //utilizo los métodos, llamar, cortarLlamada e informar características
        celular.llamar("Pablo");
        celular.cortarLlamada();
        System.out.println("");
        celular.informarCaracteristicas();
        
        //creo un nuevo objeto de tipo Smartphone
        Smartphone smartphone=new Smartphone();
        
        //le asigno la marca, modelo, color, pixeles camara, tamaño memoria interna y  externa
        smartphone.setMarca("Samsung");
        smartphone.setModelo("S3 MINI");
        smartphone.setColor("Negro");
        smartphone.setPixelesCamara(5);
        smartphone.setTamanoMemoriaInterna(4);
        smartphone.setTamanoMemoriaExterna(4);
        
        //utilizo los métodos, llamar, cortarLlamada heredados de la clase celular
        smartphone.llamar("Pablo");
        smartphone.cortarLlamada();
        System.out.println("");
        
        //método sobreescrito
        smartphone.informarCaracteristicas();
    }
    
}
