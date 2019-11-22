/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import javax.swing.JOptionPane;
import misClasesCola.ArrayCola;

/**
 *
 * @author alumno
 */
public class Mozo {
    private String apellidos;
    private int añosExperiencia;
    private ArrayCola<Pedido> colaP;
    private float montoRecaudacion;

    public Mozo(String apellidos, int añosExperiencia) {
        this.apellidos = apellidos;
        this.añosExperiencia = añosExperiencia;
        this.colaP= new ArrayCola<Pedido>();
        this.montoRecaudacion=0.0f;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public ArrayCola<Pedido> getPedidos() {
        return colaP;
    }

    public float getMontoRecaudacion() {
        return montoRecaudacion;
    }
    
    public void encolarPedido(Pedido refP){
        if(refP.getnP()==4){
            colaP.encolar(refP);
        }else{
            JOptionPane.showMessageDialog(null,"Falta completar el limite de pedidos");
        }
   
    }
   
    public void calcularMontoxMozo(){
        float suma=0.0f;
        ArrayCola<Pedido> colaPaux=new ArrayCola<Pedido>();
       while(colaP.colaVacia()==false){
           Pedido p = colaP.desencolar();
           suma+=p.getMontoAPagar();
           colaPaux.encolar(p);
       }
       while(colaPaux.colaVacia()==false){
           colaP.encolar(colaPaux.desencolar());
       }
       montoRecaudacion=suma;
       
   
    }
    public String toString(){
        String cad="";
       ArrayCola<Pedido> colaPaux=new ArrayCola<Pedido>();
       while(colaP.colaVacia()==false){
           Pedido p = colaP.desencolar();
           cad+=p.toString()+"\n";
           colaPaux.encolar(p);
       }
       while(colaPaux.colaVacia()==false){
           colaP.encolar(colaPaux.desencolar());
       }
        return "\nApellidos del Mozo: "+apellidos+
                "\nAños de experiencia: "+añosExperiencia+
                cad+
                "\nMonto Total Recaudado: "+montoRecaudacion;
    
    }
    
    
    public String toStringProcesar(){
        String cad="";
       
       while(colaP.colaVacia()==false){
           Pedido p = colaP.desencolar();
           cad+=p.toString()+"\n";
       }
       
        return "\nApellidos del Mozo: "+apellidos+
                "\nAños de experiencia: "+añosExperiencia+
                cad+
                "\nMonto Total Recaudado: "+montoRecaudacion;
    
    }
    
    
    
    
}
