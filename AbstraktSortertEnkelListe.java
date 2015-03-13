import java.util.*;
public interface AbstraktSortertEnkelListe<T extends Comparable<T> & Lik> extends Iterable<T>{
    
    // et interface kan ikke implementere et annet interface fordi et interface aldri
    // selv blir implementert, det kan derfor bare extende et annet interface. 
   
    public boolean settInn(T t);
    public T finnObjekt(String nokkel);
    public Iterator<T> iterator();

}
