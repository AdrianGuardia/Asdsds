/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Pedido {
    private Plato [] platos;
    private float montoAPagar;
    private int nP;
    private static final int TAM=4;

    
    public Pedido() {
        this.montoAPagar=0.0f;
        this.platos= new Plato[TAM];
        this.nP=0;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public float getMontoAPagar() {
        return montoAPagar;
    }

    public int getnP() {
        return nP;
    }
    
    
    public void insertarPlato(Plato refP){
        if(nP<TAM){
            platos[nP]=refP;
            nP++;
        }else{
            JOptionPane.showMessageDialog(null,"El numero platos esta al limite");
        }
    }
    
     public void montoTotalAPagar(){
        float suma=0.0f;
        for (int i = 0; i < platos.length; i++) {
            suma+=platos[i].getCant()*platos[i].getPrecioU();
        }
        montoAPagar=suma;
    }
    public String toString(){
        String cad="";
        for (int i = 0; i < platos.length; i++) {
            cad+=platos[i].toString()+"\n";
        }
        
        
        return cad+
                "\nMonto a Pagar: "+montoAPagar;
                
    }
    
    
    
}
