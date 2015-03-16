class TestEldsteForstReseptListe {

    public void testVerdi(int forventet, int faktisk){
        if(forventet == faktisk){
            System.out.println("*** Forventet verdi var " + forventet + ", og faktisk verdi var " + faktisk + ", OK!" );
            return;
        }
        System.out.println("*** Forventet verdi var " + forventet + ", og faktisk verdi var " + faktisk + ", FEIL!" );
    }

    public void testResept(Resept forventet, Resept faktisk){
        if(forventet == faktisk){
            System.out.println("Forventet resept var " + forventet + ", og faktisk resept var " + faktisk + ", OK!" );
            return;
        }
        System.out.println("Forventet resept var " + forventet + ", og faktisk resept var " + faktisk + ", FEIL!" );
    }

    public void testBoolean(boolean forventet, boolean faktisk){
        if(forventet == faktisk){
            System.out.println("Forventet verdi var " + forventet + ", og faktisk verdi var " + faktisk + ", OK!" );
            return;
        }
        System.out.println("Forventet verdi var " + forventet + ", og faktisk verdi var " + faktisk + ", FEIL!" );

    }

    public static void main (String [] args) {
    TestEldsteForstReseptListe t = new TestEldsteForstReseptListe();
	EldsteForstReseptliste legesResepter = new EldsteForstReseptliste();

    System.out.println("-------- TEST #1 ----------");
    System.out.println("Sjekker om listen er tom når vi ikke har satt inn noe:");
	t.testVerdi(0, legesResepter.getAntall());

	System.out.println("-------- TEST #2 ----------");
    System.out.println("Oppretter en ny resept og prøver å sette denne inn:");
	Lege per = new Lege("Per");	
	Legemiddel etLegemiddel = new Legemiddel("Legemiddel", 20, 0.3);
	Resept resept  = new Resept(etLegemiddel, per, 44000444, 20);
	t.testBoolean(true, legesResepter.settInnResept(resept));

	
    System.out.println("-------- TEST #3 ----------");
    System.out.println("Sjekker at reseptlista nå inneholder én resept:");
	t.testVerdi(1, legesResepter.getAntall());

	
    System.out.println("-------- TEST #4 ----------");
    System.out.println("Tester om lista nå inneholder denne resepten:");
	t.testBoolean(true, legesResepter.inneholder(resept));

    System.out.println("-------- TEST #5 ----------");
    System.out.println("Oppretter noen nye resepter og setter de inn. \nSjekker om EnkelReseptliste sin forste-peker peker på \nnoden som inneholder resepten vi satte inn først: ");
    Lege tom = new Lege("Tom");
    Legemiddel ibux = new Legemiddel("Ibux", 40, 0.4);
    Resept tomResept = new Resept(ibux, tom, 555000, 50);

    Lege jon = new Lege("Jon");
    Legemiddel paracet = new Legemiddel("Paracet", 60, 0.5);
    Resept jonResept = new Resept(paracet, jon, 6600, 50);
    t.testResept(resept, legesResepter.getForste());
 

	//finne en resept med nummer
	
	try {
		 legesResepter.finnResept(44000444);
	}
	catch (IkkeFinnes e){
		System.out.println ("Resepten med nr " + e.notFound() + " finnes ikke!");
		}
    }
}
