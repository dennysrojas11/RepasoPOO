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
public class Smartphone extends Celular {
    private float pixelesCamara;
    private float tamanoMemoriaInterna;
    private float tamanoMemoriaExterna;
    
    //constructor por defecto
    public Smartphone() {
    }
    
    //constructor con los atributos de la clase incluso los heredados
    public Smartphone(float pixelesCamara, float tamanoMemoriaInterna, float tamanoMemoriaExterna, String marca, String modelo, String color) {
        super(marca, modelo, color);
        this.pixelesCamara = pixelesCamara;
        this.tamanoMemoriaInterna = tamanoMemoriaInterna;
        this.tamanoMemoriaExterna = tamanoMemoriaExterna;
    }
    
    //método sobreescrito (override), utilizo código de la clase Celular y añado codigo que necesito
    @Override
    public void informarCaracteristicas() {
        //TODO Auto/generated method stub
        super.informarCaracteristicas();
        System.out.println(String.format("Smartphone calidad cámara: %s pixeles", pixelesCamara));
        System.out.println(String.format("Smarthphone tamaño memoria interna: %s GB", tamanoMemoriaInterna));
        System.out.println(String.format("Smarthphone tamaño memoria externa: %s GB", tamanoMemoriaExterna));
    }
    
    //getters y setters
    public float getPixelesCamara() {
        return pixelesCamara;
    }

    public void setPixelesCamara(float pixelesCamara) {
        this.pixelesCamara = pixelesCamara;
    }

    public float getTamanoMemoriaInterna() {
        return tamanoMemoriaInterna;
    }

    public void setTamanoMemoriaInterna(float tamanoMemoriaInterna) {
        this.tamanoMemoriaInterna = tamanoMemoriaInterna;
    }

    public float getTamanoMemoriaExterna() {
        return tamanoMemoriaExterna;
    }

    public void setTamanoMemoriaExterna(float tamanoMemoriaExterna) {
        this.tamanoMemoriaExterna = tamanoMemoriaExterna;
    }
    

}
