import java.util.*;

public class EnkelReseptliste implements Iterable<Resept>{

    private Node forste;
    private Node siste;
    private int antall;

    EnkelReseptliste(){
        forste = null;
        antall  = 0;        
    }
    
    // Klasse som representerer noder i en lenkeliste. 
    // Har peker til neste objekt og til innholdet i noden (en resept)
    private class Node{
        Resept resept;
        Node neste;

        // Konstruktør, lagrer en resept i noden. 
        Node(Resept resept){
            this.resept = resept;
        }

        // Henter ut resepten som ligger lagret i noden.
        public Resept hentUt(){ 
            return resept;
        }
    }

    // Metoden fra grensesnittet Iterable.
    // Skal returnerer en iterator over lenkelisten vår. 
    public Iterator<Resept> iterator(){
        return new Reseptiterator();
    }

    // Vår reseptiterator, implementerer grensesnittet Iterator. 
    public class Reseptiterator implements Iterator<Resept>{
        private int teller = 0;
        Node node = forste; 

        public boolean hasNext(){
            // Hver gang vi henter ut neste objekt i lista øker teller
            // med en. Når teller er like stor som antall
            // returnerer denne metoden false. 
            // Da har nåværende objekt ingen objekter etter seg i lista.

            return(teller < antall);
        }

        public Resept next(){
            // Henter ut objektet som ligger i en node
            Resept hentUt = node.resept;
            teller ++;
            node = node.neste;
            return hentUt; 
        }

        public void remove(){
        }

    }

    // Metode for å sette inne en resept. Legger den inn sist i lista.
    public boolean settInnResept(Resept r){
        // hvis lista inneholder r fra før, ikke legg til på nytt
        if(inneholder(r)){
            return false; 
        }
        else if(tom()){
            // Hvis lista er tom, sett inn den nye noden på første plass
            // Øker antall noder i lista med en. 
            forste = new Node(r);
            siste = forste;
            antall ++;
            return true;
        }
        else{
            // Lista er ikke tom, sett inn den nye noden sist.
            // Øker antall noder i lista med en.
            Node nyNode = new Node(r);
            siste.neste = nyNode;
            siste = nyNode;
            antall ++;
            return true;
        }
    }

    // Metode for å hente ut en resept i lista basert på reseptnr.
    public Resept finnResept(int nr) throws IkkeFinnes{
        
        boolean finnes = false;

        Node sjekk = forste; 
        while(sjekk != null){
            if(sjekk.hentUt().getReseptnr() == nr){
                finnes = true;
                return sjekk.hentUt();
            }
            sjekk = sjekk.neste;
        }
        
        if (finnes == false){
        // her sjekker vi om det finnes en resept, 
        // og hvis ikke, så kaster programmet en unntakk
            throw new IkkeFinnes(nr);
        }
        return null;
    }

    // Metode for å sjekke om lenkelista inneholder en gitt resept. 
    public boolean inneholder(Resept r){
        // henter ut første node
        Node n = forste;

        // hvis denne ikke er tom, sjekk om den er lik noden vi leter etter
        while(n != null){
            if(n.hentUt() == r){
                return true;
            }
            n = n.neste;
        }
        return false;
    }

    public boolean tom(){
        return(forste == null);
    }
}
