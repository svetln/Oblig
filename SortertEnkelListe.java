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
              
        if(inneholder(t)){
            // lista inneholder allerede denne legen, ikke sett inn på nytt
            return false; 
        }

        if(tom()){
            // hvis lista er tom, sett inn nytt objekt først. 
            forste = new Node(t);
            siste = forste;
            return true;
        }

        // lista er ikke tom og inneholder ikke elementet vi prøver  å sette inn
        // lagrer noden vi jobber med og den forrige noden vi jobbet med i to variabler
        // for å kunne sette inn en ny node imellom disse. 
        Node sjekk = forste; 
        Node forrigeSjekk = null; 
        Node nyNode = new Node(t);

        while(sjekk != null){
        // while-løkke som stopper på det siste elementet. 
        // sammenlikner objektpekeren i noden med parameteret 
            if(sjekk.hentUt().compareTo(t)== -1){
                // -1 betyr at denne legen er midre enn parameteret (dvs tidligere i alfabetet). 
                // hvis paramteretet er større, så går vi videre til vi finner et større objekt i lista. 
                // Når vi kommer til at dette er false, så må vi sette inn den nye noden
                // før det objektet som er større enn parameteret.
                forrigeSjekk = sjekk;
                sjekk = sjekk.neste;
            }
            else{ 
                // compareTo() gir 1 som svar: parameteret er nå mindre enn denne legen.
                // vi må sette inn parameteret før denne legen.
                // hvis denne legen er den første i lista, legg til ny lege foran denne. 
                if(sjekk == forste){
                    nyNode.neste = forste;
                    forste = nyNode;
                    return true;
                }
                // denne legen er ikke den første i lista, men parameteret er mindre
                // legg til den nye legen foran denne legen. 
                Node flyttesFrem = sjekk;
                forrigeSjekk.neste = nyNode;
                nyNode.neste = flyttesFrem;
                return true;
            }
        }
        // noden sjekk er den siste noden, vi har fortsatt ikke funnet en lege som er større enn parameteret.
        // legg til parameteret sist i lista. 
        siste.neste = nyNode;
        siste = nyNode; 
        return true;
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
        Node sjekk = forste;
        while(sjekk != null){
            if(sjekk.hentUt().samme(nokkel)){
                return sjekk.hentUt();
            }
            sjekk = sjekk.neste;
        }
        return null;
    }
    
    public boolean tom(){
        return(forste ==null);
    }
    
    
    public int getAntall(){
        return antall;
    }
    
    public boolean inneholder(T objekt){
        Node sjekk = forste; 
        while(sjekk != null){
           if(sjekk.hentUt() == objekt){
                return true;
           }
           sjekk = sjekk.neste;
        }
        return false; 
    }

}
