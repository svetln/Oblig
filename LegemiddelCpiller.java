class LegemiddelCpiller extends LegemiddelC implements Piller{
    
    // Subklasse av Legemiddel type c for piller som hverken er
    // narkotiske eller vanedannende. Inneholder ingen yttligere info
    // men implementerer interfacet Piller. 
    
    private int antPiller;
    private double mengdeVirkestoff;
    private double virkestoffPerPille = mengdeVirkestoff/antPiller;

    public LegemiddelCpiller(String navn, int pris, double virk, int ant){
        super(navn, pris, virk);
        mengdeVirkestoff = virk;
        antPiller = ant;
    }


    public double getVirkestoffPille(){
        return virkestoffPerPille;
    }

    public int pillerPerBoks(){
        return antPiller;
    }


}
