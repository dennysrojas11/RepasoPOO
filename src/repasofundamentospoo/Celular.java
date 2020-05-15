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
public class Celular {
    //atributos de la clase
    private String marca;
    private String modelo;
    private String color;

    public Celular(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Celular() {
    }
    
    //método para hacer llamada
    public void llamar(String nombre){
        System.out.println("Llamando a "+ nombre);
    }
    
    //método para finalizar llamada
    public void cortarLlamada(){
        System.out.println("LLamada finalizada");
    }
    
    //método para informar de las características del celular
    public void informarCaracteristicas(){
        System.out.println(String.format("Celular marca: %s", marca));
        System.out.println(String.format("Celular modelo: %s", modelo));
        System.out.println(String.format("Celular color: %s", color));
    }
    
    //getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
