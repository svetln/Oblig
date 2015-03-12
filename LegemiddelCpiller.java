class LegemiddelCpiller extends LegemiddelC implements Piller{
    
    // Subklasse av Legemiddel type c for piller som hverken er
    // narkotiske eller vanedannende. Inneholder ingen yttligere info
    // men implementerer interfacet Piller. 
    
    private int antPiller;
    private double mengdeVirkestoff = getVirkestoff();
    private double virkestoffPerPille = mengdeVirkestoff/antPiller;

    public LegemiddelCpiller(String n, int p, int i, double virk, int ant){
        super(n, p, i, virk);
        antPiller = ant;
    }


    public double getVirkestoffPille(){
        return virkestoffPerPille;
    }

    public int pillerPerBoks(){
        return antPiller;
    }


}
