class LegemiddelBpiller extends LegemiddelB implements Piller{
    
    // Subklasse av Legemiddel type B for piller med vanedannende 
    // virkestoff. Implementeter også interfacet Piller med dens metoder.

    private int antPiller;
    private double mengdeVirkestoff = getVirkestoff();
    private double virkestoffPerPille = mengdeVirkestoff/antPiller;

    public LegemiddelBpiller(String navn, int pris, double virk, int van, int ant){
        super(navn, pris, virk, van);
        antPiller = ant;
    }

    public double getVirkestoffPille(){
        return virkestoffPerPille;
    }

    public int pillerPerBoks(){
        return antPiller;
    }


}
