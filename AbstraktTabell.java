import java.util.*;

public interface AbstraktTabell<T> extends Iterable<T>{

    public boolean settInn(T objekt, int plass);
    public T finnObjekt(int indeks);

}
