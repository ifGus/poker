package app;
import java.util.*;

public class Carta {

    protected String palo;
    protected int valor;
    
   Carta(){}

   Carta(String C,int V){
    palo=C;
    valor=V;
    }

    Carta(Carta c) {
        palo=c.palo();
        valor=c.valor();
    }

   void valor(int N){
	   valor=N;
   }

   void palo(String P){
   palo=P;
   }

   int valor(){
   return valor;
   }
  
   String palo(){
   return palo;
   }
}
