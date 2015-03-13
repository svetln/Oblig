class TestEldsteForstReseptListe {
    public static void main (String [] args) {
	EldsteForstReseptliste legesResepter = new EldsteForstReseptliste();


	
	//sjekke om listen er tom

	System.out.println(legesResepter.getAntall()==0);

	//sette inn en resept
	Lege per = new Lege("Per");	
	Legemiddel etLegemiddel = new Legemiddel("Legemiddel", 20, 0.3);
	Resept resept  = new Resept(etLegemiddel, per, 44000444, 20);


	System.out.println (legesResepter.settInnResept(resept));

	//sjekke antall elementer

	System.out.println(legesResepter.getAntall());

	//sjekke om listen inneholder en resept

	System.out.println (legesResepter.inneholder(resept));

	//finne en resept med nummer
	
	try {
		 legesResepter.finnResept(44000444);
	}
	catch (IkkeFinnes e){
		System.out.println ("Resepten med nr" + e.notFound() + "finnes ikke!");
		}
    }
}
