import java.util.*;
class TestSortertEnkelListe {
    public static void main (String [] args) {
	SortertEnkelListe leger = new SortertEnkelListe();

	//sjekke storrelse
	System.out.println (leger.getAntall());
	
	//sette inn en lege
	Lege olsen = new Lege("Olsen");
	Lege hansen = new Lege("Hansen");
	System.out.println (leger.settInn(olsen));
	System.out.println(leger.settInn(hansen));

	// sjekke antall i lista
	System.out.println (leger.getAntall());

	// finne en lege med navnet
	
	Lege skrivUt = null;
	Iterator<Lege> legeiterator = leger.iterator();
	while ( legeiterator.hasNext() ) {
	    skrivUt = legeiterator.next();
	    System.out.println("Dette er en lege  ["
			       + skrivUt + "] med navn " + skrivUt.getNavn());
        }

 	System.out.println (leger.finnObjekt("Olsen"));
	
	
    }
}
