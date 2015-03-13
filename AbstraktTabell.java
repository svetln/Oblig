import java.util.*;

public interface AbstraktTabell<T extends Iterable>{

    public boolean settInn(T objekt, int plass);
    public T finnObjekt(int indeks);
    public Iterator<T> iterator();


}
