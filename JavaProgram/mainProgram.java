
package coda;
import java.io.*;
public class mainProgram{
    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        Coda oggettoCoda = new Coda();
        int scelta =0;
        boolean erroreTrovato = false;

    do{
        
        do{
            erroreTrovato=false;
            System.out.println("\n\n\t---MENU AZIONI CODA---\n\n ATTENZIONE: La coda inizialmente è vuota.\n1) Aggiungi un elemento nella coda [ACCODA];\n2) Rimuovi e mostra l'elemento rimosso dalla coda [DEQUEUE];\n3) Mostra il primo valore [index 0] della coda ma SENZA rimuoverlo [PEEK del BOTTOM];\n4) Mostra il numero degli elementi contenuti attualmente nella coda [SIZE];\n5) Stampa la coda nello stato corrente [PRINT];\n6) Ricerca un elemento nella coda [RICERCA];\n7) Rimuovi tutti gli elementi dalla coda [RESET].\n---------------------------------------------------\n0 ) EXIT\nFai la tua scelta:");
            try{
            String valore = tastiera.readLine();
            scelta = Integer.valueOf(valore).intValue();
            }catch(Exception e){
                System.out.println("\nErrore di digitazione");
                erroreTrovato = true;
            }
        }while(erroreTrovato==true);
    
        //--
    int elemento = 0;

        switch (scelta) {
            case 1:

        do{
            try{
                erroreTrovato = false;
                System.out.println("Inserisci l'elemento da mettere in coda: ");
                String valore = tastiera.readLine();
                elemento = Integer.valueOf(valore).intValue();
            }catch(Exception e){
                    System.out.println("Errore di digitazione");
                    erroreTrovato = true;
            }

        }while(erroreTrovato==true);
             oggettoCoda.accoda(elemento);
                break;


            //--

            case 2:
    
            System.out.println("\nElemento : " + oggettoCoda.dequeue() + " RIMOSSO dalla coda. \nLa coda è composta attualmente da:  " + oggettoCoda.totElementi() + " elementi");
            
            break;
            //--
            case 3:

            System.out.println("\nIl primo elemento della coda è " + oggettoCoda.bottom());
            break;

            case 4: 

            System.out.println("\nIl numero degli elementi contenuti attualmente nella coda è " + oggettoCoda.totElementi());
            break;

            case 5: 
            System.out.println("");
            oggettoCoda.stampaCoda();
            break;

            case 6: 

            int elementoRicercato=0;

            do{
                try{
                    erroreTrovato = false;
                    System.out.println("\nInserisci l'elemento che vuoi ricercare all'interno della coda: ");
                    String valore = tastiera.readLine();
                    elementoRicercato = Integer.valueOf(valore).intValue();
                }catch(Exception e){
                        System.out.println("Errore di digitazione");
                        erroreTrovato = true;
                }
        }while(erroreTrovato==true);

            oggettoCoda.ricercaElemento(elementoRicercato);
            break;
    //--
            case 7: 
            String conferma ="";
            
            System.out.println("\nVuoi davvero procedere con il reset della coda? (si o no)");
            
            try{
                conferma = tastiera.readLine();
            }catch(Exception e){}

            if(conferma.equals("Si") || conferma.equals("si") || conferma.equals("SI") ){
                oggettoCoda.resetCoda();
            }
            else{
                System.out.println("L'operazione è stata annullata");
            }
            break;

            default:
                break;
        }


    }while(scelta!=0);


    }
}

