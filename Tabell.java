import java.util.*;

public class Tabell<T> implements AbstraktTabell<T extends Iterable>{

    private int lengde;
    private T[] beholder;

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
            return true;
        }
        return false;
    }

    public T finnObjekt(int indeks){
        // finner et objekt i arrayet.
        return beholder[indeks];

    }


 
}
