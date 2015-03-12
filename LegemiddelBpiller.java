class LegemiddelBpiller extends LegemiddelB implements Piller{
    
    // Subklasse av Legemiddel type B for piller med vanedannende 
    // virkestoff. Implementeter også interfacet Piller med dens metoder.

    private int antPiller;
    private double mengdeVirkestoff = getVirkestoff();
    private double virkestoffPerPille = mengdeVirkestoff/antPiller;

    public LegemiddelBpiller(String n, int p, int i, double virk, int van, int ant){
        super(n, p, i, virk, van);
        antPiller = ant;
    }

    public double getVirkestoffPille(){
        return virkestoffPerPille;
    }

    public int pillerPerBoks(){
        return antPiller;
    }


}
