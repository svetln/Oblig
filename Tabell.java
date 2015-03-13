import java.util.*;

public class Tabell<T> implements AbstraktTabell<T extends Iterable>{

    private int lengde;
    private T[] beholder;
    private int antall;

    Tabell(int lengde){
    // Oppretter en ny array med det antall plasser som kommer inn som
    // paramter. 

        this.lengde = lengde;
        beholder = (T[]) new Object[lengde];
    }

    public boolean settInn(T objekt, int indeks){
        // setter inn et objekt i arrayet
        if(beholder[indeks] == null){
            // denne plassen er ledig, sett inn objektet her 
            beholder[indeks] = objekt;
            antall ++;
            return true;
        }
        return false;
    }

    public T finnObjekt(int indeks){
        // finner et objekt i arrayet.
        return beholder[indeks];

    }
    
    public int getLenge(){
        return lengde;
    }
    
    public Iterator<T> iterator(){
        return new tabellIterator();
    }
    
    public class tabellIterator implements Iterator<T>{
        private int teller = 0;
        T sjekk = beholder[0];
        
        public boolean hasNext(){
            return(teller < antall);
        }
            
        public T next(){
        // Henter ut objektet som ligger på denne plassen
            T hentUt = beholder[teller];
            teller ++;
            return hentUt;
        }
        public void remove(){
        }
    }
    


 
}
