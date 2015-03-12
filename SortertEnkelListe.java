public class SortertEnkelListe<T extends Comparable<T> & Lik> implements AbstraktSortertEnkelListe<T>{

    // Er en enveisliste

    private class Node{
    // hver node i listen inneholder en peker til objektet det lagrer, og 
    // til neste objekt i lista. 

        T objekt;
        Node neste;

        Node(T t){
            objekt = t;
        }

        public T hentUt(){
        // metode for å hente ut et objekt som ligger lagret i noden. 
            return objekt;
        }
    }
       
    public boolean settInn(T t){
    // setter inn et objekt i lista i sortert rekkefølge
        return false;
    }

    public T finnObjekt(String nokkel){
    // returnerer legen med navnet som kommer inn som parameter
        return null;
    }

    public int compareTo(T o){
        // metoden fra grensesnittet Comparable
        // skal sammenlikne et objekt av samme type med seg selv 
        return 1;
    }

    public boolean samme(String navn){
        // metoden fra grensesnittet Lik
        return false;
    }
}
