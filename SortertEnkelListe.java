import java.util.*;

public class SortertEnkelListe<T extends Lik & Comparable<T>> implements AbstraktSortertEnkelListe<T>{

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
    
        if(tom()){
        // hvis lista er tom, sett inn nytt objekt først. 
            forste = new Node(t);
            siste = forste;
            return true;
        }
        else if(getAntall()==1){
            if(forste.hentUt().compareTo(t) == 1){
                // parameteret er før første node i lista, sett inn dette først 
                Node nyNode = new Node(t);
                    nyNode.neste = forste;
                    forste = nyNode;
                    return true;
            }
            Node nyNode = new Node(t);
            siste.neste = nyNode;
            siste = nyNode; 
            return true;
        }
        // hvis lista inneholder mer enn ett element. 
        Node sjekk = forste; 
        if(sjekk.hentUt().compareTo(t) == 0){
            // objektene er de samme, ikke sett inn på nytt
            return false; 
        }
        else if(sjekk.hentUt().compareTo(t) == 1){
            // 1 betyr at parameterlegen er før denne legen i alfabetet
            // settes inn foran denne legen 
            if(objekt == forste.hentUt()){
                Node nyNode = new Node(t);
                nyNode.neste = forste;
                forste = nyNode;
                return true;
            }
            
            while(sjekk.neste != null){
                // når vi setter inn en node - sett satt til true og returner true
                if(sjekk.hentUt().compareTo(sjekk.neste.hentUt()== -1)){
                        // sjekker om dette objektet er større enn parameteret. 
                        // hvis paramteretet er større, så går vi videre til vi finner et større objekt i lista. 
                        // Når vi kommer til at dette er false, så må vi sette inn den nye noden
                        // før det objektet som er større.
                    sjekk = sjekk.neste;
                }
                else{
                // her har objektet vi ser på blitt større enn parameteret. 
                // legge til en ny node 
                // sjekk er noden som er akkuratt mindre enn parameteret, og sjekk.neste er akkuratt større enn parameteret
                
                    if(sjekk == siste){
                        Node nyNode = new Node(t);
                        siste.neste = nyNode;
                        siste = nyNode; 
                        return true;
                    }
                    
                    Node nyNode = new Node(t);
                    nyNode.neste = sjekk.neste;
                    sjekk.neste = nyNode; 
                    return true;
                }
            }
        }
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
    
    public boolean tom(){
        return(forste ==null);
    }
    
    
    public int getAntall(){
        return antall;
    }


}
