class TestTabell {
    public static void main (String [] args) {
	
	Tabell<Person> personer = new Tabell<Person>(50);

	//returnere storrelse

	System.out.println(personer.getLengde());
	
	// returnere objekt fra en tom plass

	System.out.println (personer.finnObjekt(0));

	//sette inn en person
	
	Person person = new Person("Svetlana", "1212", "1212", "Oslo");

	System.out.println (personer.settInn(person, 0));

	
	Tabell <Legemiddel> legemidler = new Tabell<Legemiddel>(100);

	

	//sette inn en legemiddel
	
	Legemiddel etLegemiddel = new Legemiddel("Legemiddel", 20, 0.3);
	System.out.println (legemidler.settInn (etLegemiddel, 99));
	
	
    }

}
