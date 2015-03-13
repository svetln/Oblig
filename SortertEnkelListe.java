import java.util.*;

public class SortertEnkelListe<T implements Comparable<T> & Lik> implements AbstraktSortertEnkelListe<T>, Iterable<T>{

    // Er en enveisliste
    private Node forste;
    private Node siste;
    private int antall;

    public SortertEnkelListe(){
        forste = null;
        antall = 0;
    }

    private class Node{
    // hver node i listen inneholder en peker til objektet det lagrer, og 
    // til neste objekt i lista. 

        T objekt;
        Node neste;

        Node(T t){
            objekt = t;
            antall ++;
        }

        public T hentUt(){
        // metode for å hente ut et objekt som ligger lagret i noden. 
            return objekt;
        }
    }
       
    public boolean settInn(T t){
    // setter inn et objekt i lista i sortert rekkefølge
    // returnerer false om objektet finnes i lista fra før eller man prøver å 
    // sette inn på en ugyldig plass

       /* Iterator<T> objekter = iterator();

        while(objekter.hasNext()){
          
            T objekt = objekter.next();

            if(objekt.compareTo(t) == 0){
                // objektene er de samme, ikke sett inn på nytt
                return false; 
            }
            else if(objekt.compareTo(t) == 1){
               // 1 betyr at parameterlegen er før denne legen i alfabetet
               // settes inn foran denne legen 
              
                Node nyNode = new Node(t);
                
                if(objekt == forste.hentUt()){
                    nyNode.neste = forste;
                    forste = nyNode;
                }
                
        
            }
            
            Node nyNode = new Node(t);
            
          
             
        
        // rett etterpå vi sjekker imot er ikke det første objektet. 
                // gå gjennom resten av nodene og finn ut hvor det skal settes inn. 
                for(int i = 1; i< antall; i++){

                    Node sjekk = forste;
                    if(objekt == sjekk.neste.hentUt()){
                        // hvis objektet vi ser på ikke er den første noden. 
                        // parameteret settes inn før den gamle noden
                        sjekk.neste = gammelNode;
                        sjekk = nyNode;
                        nyNode.neste = gammelNode;
                        return true;
                    }
                    // hvis ikke, sjekk neste node. 
                    sjekk = sjekk.neste;
                }
                // hvis ingen av disse slår inn, returner false:
                return false;
                
            }
            // parameteret har en senere id enn dette objektet, sett det inn 
            // rett etterpå 

            for(int i = 1; i< antall; i++){

                    Node sjekk = forste;
                    if(objekt == sjekk.neste.hentUt()){
                        // hvis objektet vi ser på ikke er den første noden. 
                        // parameteret settes inn etter den gamle noden
                        nodeFlyttesFrem = sjekk.neste;
                        sjekk.neste = nyNode;
                        nyNode.neste = nodeFlyttesFrem;
                        return true;
                    }
                    // hvis ikke, sjekk neste node. 
                    sjekk = sjekk.neste;
                }
                // hvis ingen av disse slår inn, returner false:
                return false;

        }*/
        return false;
    }

    // metode fra grenesnittet iterable
    public Iterator<T> iterator(){
        return new Objektiterator();
    }
   

    // Vår objektiterator, implementerer grensesnittet Iterator. 
    // indre klasse Objektiterator 
    public class Objektiterator implements Iterator<T>{
        private int teller = 0;
        Node node = forste; 

        public boolean hasNext(){
            // Hver gang vi henter ut neste objekt i lista øker teller
            // med en. Når teller er like stor som antall
            // returnerer denne metoden false. 
            // Da har nåværende objekt ingen objekter etter seg i lista.

            return(teller < antall);
        }

        public T next(){
            // Henter ut objektet som ligger i en node
            T sjekke = node.hentUt();
            teller ++;
            node = node.neste;
            return sjekke; 
        }

        public void remove(){
        }

    }


    public T finnObjekt(String nokkel){
    // returnerer legen med navnet som kommer inn som parameter
        return null;
    }


}
