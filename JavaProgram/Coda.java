package coda;

import java.util.*;
public class Coda {
    
Vector <Integer> coda;
private int buffer = 0;

    Coda(){
        coda = new Vector<Integer>();
    }

    //coda vuota?
    public boolean codaVuota(){
        if(coda.size()>0) 
            return false;
        else
            return true;
    }

    //inserimeto top [accoda] .
    public void accoda(int num){
        coda.addElement(num);
        System.out.println("Elemento messo in coda!");
    }

    //estrazione del primo [dequeue] .
    public int dequeue(){
    
        if(!codaVuota()){
            buffer = coda.elementAt(0);
            coda.removeElementAt(0);
        }

        stampaCoda();
        return buffer;
    }

    //peek del primo elemento.
    public int bottom(){

        if(!codaVuota()){
            buffer = coda.elementAt(0);
        }
        else
            System.out.println("La coda è vuota!");

        return buffer;
    }

    //lunghezza coda .
    public String totElementi(){
        if(!codaVuota()){
            String tot = String.valueOf(coda.size());
            return tot;
        }
        else 
            return "Vuota";
    }

    //ricerca
    public void ricercaElemento(int elementoCercato){
        boolean trovato = false;
        if(!codaVuota()){
            for(int i=0;i<coda.size();i++){

                if(elementoCercato == coda.elementAt(i)){
                    trovato = true;
                    System.out.println("Elemento trovato alla posizione " + i);
                }

            }
            if(trovato==false){
                System.out.println("Elemento non presente all'interno della coda");
            }
        }
        else 
            System.out.println("Coda vuota impossibile continuare con la ricerca! ");

    }

    //rimuove tutti gli elementi nella coda
    public void resetCoda(){
        if(!codaVuota()){
                coda.removeAllElements();
                System.out.println("Coda resettata!");
        }
        else    
            System.out.println("Impossibile resettare la coda in quanto è gia vuota");
    }

    //stampo
    public void stampaCoda(){
        System.out.println("Stato attuale della coda: \n");
    if(!codaVuota())
        for(int i=0;i<coda.size();i++)
        {
            System.out.println("Posizione: " + i + "\t|\t" + coda.elementAt(i) + "\t|\t");
            System.out.println("---------------------------------");
        }
    else
        System.out.println("CODA VUOTA!");
     }


}
