package misClasesLista;

import java.util.Random;
import javax.swing.JOptionPane;
import misClases.Mozo;
import misClases.Pedido;
import misClasesCola.ArrayCola;

public class ListaLEG <E extends Mozo>{
    private NodoLEG<E> primero;
    private int talla;

    public ListaLEG() {
        this.primero=null;
        this.talla=0;
    }

    public NodoLEG<E> getPrimero() {
        return primero;
    }
    public int getTalla() {
        return talla;
    }
    
    //reglas de negocio
    public void insertarAlInicio(E x){        
        NodoLEG<E> nuevo=new NodoLEG<E>(x);
        
        nuevo.setSiguiente(primero);
        primero=nuevo;
        talla++;        
    }
    
    public void insertarAlFinal(E x){
        NodoLEG<E> nuevo=new NodoLEG<E>(x);
        
        if(primero==null){
            primero=nuevo;
        }else{
            NodoLEG<E> ptr=primero;
            while(ptr.getSiguiente()!=null){
                ptr=ptr.getSiguiente();
            }
            ptr.setSiguiente(nuevo);           
        }
        talla++;        
    }
    
    public void eliminarAlInicio(){
        //precondición: Lista no vacia
        
        //caso especial
        if(primero.getSiguiente()==null){
            primero=null;
        }else{
            primero=primero.getSiguiente();
        }
        talla--;        
    }
    
    public void eliminarAlFinal(){
        //precondición: Lista no vacia
        
        if(primero.getSiguiente()==null){
            primero=null;
        }else{
            NodoLEG<E> ptr=primero,r=null;
            while(ptr.getSiguiente()!=null){
                r=ptr;
                ptr=ptr.getSiguiente();
            }
            r.setSiguiente(null);           
        }
        talla--;       
    }
    
    public String verLista(){
        String cad="";
        
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            cad+=ptr.getDato().toString()+"\n";
            ptr=ptr.getSiguiente();
        }       
        return cad;        
    }
    
    //Método que agregue un nuevo mozo a la lista enlazada en forma ordenada 
    //alfabéticamente por apellido, asegúrese que el apellido no se repita.
    
    
    public boolean verificarMozo(E x){
        boolean estado=false;
        NodoLEG<E> ptr=primero;
        while(ptr!=null && !estado){
            if(ptr.getDato().getApellidos().equalsIgnoreCase(x.getApellidos())){
                estado=true;
            }else{
                ptr=ptr.getSiguiente();
            }
        
        }
        return estado;
    
    }
    
    public void agregarMozo(E x){
        
        if (verificarMozo(x)==false) {
            if (primero==null) {
                insertarAlInicio(x);
            }else{
                NodoLEG<E> ptr=primero,ant=null;
                while(ptr!=null && (ptr.getDato().getApellidos().compareToIgnoreCase(x.getApellidos())<0)){
                    ant=ptr;
                    ptr=ptr.getSiguiente();
                }
                if (ptr!=null) {
                    if (ptr==primero) {
                        insertarAlInicio(x);
                    }else{
                        NodoLEG<E> nuevo =new NodoLEG<E>(x);  
                        ant.setSiguiente(nuevo);
                        nuevo.setSiguiente(ptr);
                        talla++;
                    }
                }else{
                    insertarAlFinal(x);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"El mozo ingresado ya esta en la lista");
        }
    }
    
    
    //Método que agregue un nuevo pedido a un determinado mozo, el cual es seleccionado 
    //aleatoriamente. Considere que este método recibe como parámetro un objeto pedido.
    
    
    public void agregarPedido_MozoAlea(Pedido refP){
        if (primero!=null) {
             Random randito= new Random();
            int num=randito.nextInt(talla-1+1)+1;
            NodoLEG<E> ptr=primero;
            for (int i = 1; i < num; i++) {
               ptr=ptr.getSiguiente();
           }
            ptr.getDato().encolarPedido(refP);
            JOptionPane.showMessageDialog(null,"Pedido registrado");
        }else{
            JOptionPane.showMessageDialog(null,"Lista de mozos vacia...");
        }
        
    }
    
    //Método que retorne (en forma de cadena) un listado de todos los 
    //pedidos de cada uno de los mozos. Recuerde que la cola de pedidos no se puede modificar.
    
    
    public String verListadoPedidos(){
        String cad="";
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            cad+=ptr.getDato().toString()+"\n";
            ptr=ptr.getSiguiente();
        
        }
        return cad;
    }
    
   //Método que procese todos los pedidos del mozo que tiene más años de experiencia.
   //Debe retornar los datos del mozo, la lista de pedidos que atendió y el monto de pago.
    
    public String mozoMayorAñoExp(){
        int mayor=0;
        NodoLEG<E> ptr=primero;
        String cad="";
        E p=null;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            if(ptr.getDato().getAñosExperiencia()>mayor){
                mayor=ptr.getDato().getAñosExperiencia();
                p=ptr.getDato();
            }
            ptr=ptr.getSiguiente();
        }
        cad=p.toStringProcesar();
        
        return cad;
    }
    
    //Método que permita procesar todos los pedidos. Para ello se deberá sacar los 
    //pedidos de cada uno de los mozos, recuerde actualizar monto de recaudación.
    
    
    public String procesarPedidos(){
        String cad="";
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            cad+=ptr.getDato().toStringProcesar();
            ptr=ptr.getSiguiente();
        }
        return cad;
    
    }
    
    //Metodo que muestre la informacion del mozo con mayor monto a Pagar
      
    public String mozoMayorMontoPago(){
        String cad="";
        float mayor=0.0f;
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            if(ptr.getDato().getMontoRecaudacion()>mayor){
                mayor=ptr.getDato().getMontoRecaudacion();
                cad=ptr.getDato().toString();
            }
            ptr=ptr.getSiguiente();
        
        }
        return cad;
             
    }
    
    //Metodo que retorne el monto total de pago por todos los mozos;
    
    public float montoTotalXTodosMozos(){
       
        float monto=0.0f;
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            monto+=ptr.getDato().getMontoRecaudacion();
            ptr=ptr.getSiguiente();
        
        }
        return monto;
             
    }
    
    //Metodo que muestre la informacion del mozo con su respectivo pedido con mayor pago
     
    public String mozoXPedidoMayor(){
        String cad="";
        
        NodoLEG<E> ptr=primero;
        ArrayCola<Pedido> Caux = new ArrayCola<Pedido>();
        while(ptr!=null){
            float mayor=0.0f;
            Pedido p= null;
            cad+="\nApellidos del mozo: "+ptr.getDato().getApellidos()+
                  "\nAños de experiencia: "+ptr.getDato().getAñosExperiencia();
            while(ptr.getDato().getPedidos().colaVacia()==false){
                Pedido x = ptr.getDato().getPedidos().desencolar();
                if (x.getMontoAPagar()>mayor) {
                    mayor=x.getMontoAPagar();
                    p=x;
                }
                Caux.encolar(x);
            
            }
            while(Caux.colaVacia()==false){
                ptr.getDato().getPedidos().encolar(Caux.desencolar());
                
            }
            cad+=p.toString()+"\n";
            ptr=ptr.getSiguiente();
        }
        return cad;
    }
    
    //Metodo que muestre la informacion de los mozos que tienen un monto de pago mayor al ingresado
    //Modificar a Lista para visualizar en la tabla
    public ListaLEG<E> mozosMontoSup(float monto){
        ListaLEG<E> listita = new ListaLEG<E>();
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            if (ptr.getDato().getMontoRecaudacion()>monto) {
                listita.insertarAlInicio(ptr.getDato());
            }
            ptr=ptr.getSiguiente();
        }
        return listita;
    
    }
    
    
    //Método que agregue un nuevo pedido a un determinado mozo, el cual es pasado como parametro
    //la referencia del pedido y el apellido del mozo
    
    
    public void agregarPedido_MozoEsp(Pedido refP,String apellido){
       boolean estado=false;
       NodoLEG<E> ptr=primero;
       
       while(ptr!=null && !estado){
           if(ptr.getDato().getApellidos().equalsIgnoreCase(apellido)){
               estado=true;
           }else{
               ptr=ptr.getSiguiente();
           }
       }       
       if(estado==true){
           ptr.getDato().encolarPedido(refP);
           JOptionPane.showMessageDialog(null,"Pedido registrado");
       }else{
           JOptionPane.showMessageDialog(null, "El Mozo no existe");
       }      
    }
    
    
    
    //Metodo que una lista de los mozos que tienen menos años de antiguedad(el
    //cual el año de antiguedad es pasado como parametro)
    // para visualizar en la tabla
    public ListaLEG<E> listaMenorExperiencia(int año){
        ListaLEG<E> listita = new ListaLEG<E>();
        NodoLEG<E> ptr=primero;
        while(ptr!=null){
            ptr.getDato().calcularMontoxMozo();
            if (ptr.getDato().getAñosExperiencia()<año) {
                listita.insertarAlInicio(ptr.getDato());
            }
            ptr=ptr.getSiguiente();
        }
        return listita;
    
    }
    
    
    
    //Metodo que retorne la informacion del mozo que genera la mayor cantidad de platos
    
    
    public String MozoMayorCantPlatos(){
        String cad="";
        NodoLEG<E> ptr=primero;
        ArrayCola<Pedido> Caux = new ArrayCola<Pedido>();
        int mayor=0;
        E p=null;
        while(ptr!=null){
            int suma=0;
            ptr.getDato().calcularMontoxMozo();
            while(ptr.getDato().getPedidos().colaVacia()==false){
                Pedido x= ptr.getDato().getPedidos().desencolar();
                for (int i = 0; i < x.getnP(); i++) {
                    suma+=x.getPlatos()[i].getCant();
                }
                Caux.encolar(x);
            }
            while(Caux.colaVacia()==false){
                ptr.getDato().getPedidos().encolar(Caux.desencolar());
                
            }
            if (suma>mayor) {
                mayor=suma;
                p=ptr.getDato();
            }
            ptr=ptr.getSiguiente();
        
        
        }
        cad=p.toString();
        return cad;
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
