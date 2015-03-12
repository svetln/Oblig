public interface AbstraktSortertEnkelListe<T extends Comparable<T> & Lik>{
    
    // et interface kan ikke implementere et annet interface fordi et interface aldri
    // selv blir implementert, det kan derfor bare extende et annet interface. 
   
    public boolean settInn(T t);
    public T finnObjekt(String nokkel);

    // metoden fra grensesnittet comparable
    public int compareTo(T o);

    // metoden fra grensesnittet Lik
    public boolean samme(String navn);


}
