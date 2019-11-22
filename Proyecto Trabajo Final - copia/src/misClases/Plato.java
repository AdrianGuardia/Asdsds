/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Plato {
    private String descrip;
    private int cant;
    private float precioU;

    public Plato(String descrip) {
        this.descrip = descrip;
        this.cant=0;
        this.precioU=0.0f;
    }

    public String getDescrip() {
        return descrip;
    }

    public int getCant() {
        return cant;
    }

    public float getPrecioU() {
        return precioU;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    public void generarCant(){
        Random randito= new Random();
        cant= randito.nextInt(6-1+1)+1;
        
    }
    
    public void generarPrecio(){
        
        if(descrip.equalsIgnoreCase("Chicharrón de pescado") || descrip.equalsIgnoreCase("Jalea mixta")){
            precioU=20.0f;
        }else if(descrip.equalsIgnoreCase("Ceviche de pescado") || descrip.equalsIgnoreCase("Arroz con trucha") || descrip.equalsIgnoreCase("Chaufa de pescado")){
            precioU=25.0f;
        }else if(descrip.equalsIgnoreCase("Chaufa de mariscos") || descrip.equalsIgnoreCase("Parihuela")){
            precioU=30.0f;
        }else if(descrip.equalsIgnoreCase("Ceviche mixto") || descrip.equalsIgnoreCase("Tiradito tradicional")){
            precioU=35.0f;
        }else{
            precioU=40.0f;
        }
    
    }
    
    public String toString(){
        String cad="";
        cad="\nDescripción: "+descrip+
            "\nCantidad: "+cant+
            "\nPrecio del plato: "+precioU;
        return cad;
    }
}
