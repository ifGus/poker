package app;

import java.util.*;

public abstract class Jugador {
    protected String nombre;
    protected int ganancias;
    protected LinkedList<Carta> carta = new LinkedList<Carta>();
    Jugador() {
        ganancias=0;
        nombre=null;
    }
    Jugador(String n,int g){
        this.inicializa(n,g);
    }
    public void inicializa(String n,int g){
        nombre=n;
        ganancias=g;
    }
    public String nombre(){
        return nombre;
    }
    public int ganancias(){
        return ganancias;
    }
    public boolean eliminado() {
        return ganancias<=0;
    }
    public void robar(Carta c){
        carta.add(c);
    }

    public LinkedList<Carta> vaciarCartas() {
        LinkedList<Carta> aux = new LinkedList<Carta>();
        while (!carta.isEmpty()) {
            aux.add(carta.remove());
        }
        return aux;
    }

    public abstract LinkedList<Carta> seleccionaCartas();
    public abstract int apostar();
    public abstract boolean seRetira();
    
   public LinkedList<Carta> descartar() {
        LinkedList<Carta> seleccion = new LinkedList<Carta>();
        LinkedList<Carta> descarte = new LinkedList<Carta>();
        
        seleccion = this.seleccionaCartas();
        for (int i=0; i<seleccion.size(); i++) {
            descarte.add(carta.remove(carta.indexOf(seleccion.get(i))));
        }
        return descarte;
    }
     public boolean perdedor() {
        return ganancias<=0;
    }
    public void ganancias(int g) {
        ganancias+=g;
    }
}
