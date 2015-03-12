class LegemiddelApiller extends LegemiddelA implements Piller{
    
    // Subklasse av Legemidler type A for narkotiske legemidler 
    // i pilleform. Inneholder informasjon om antall piller i en boks
    // og mengde virkestoff per pille. 

    private int antPiller;
    private double mengdeVirkestoff = getVirkestoff();
    private double virkestoffPerPille = mengdeVirkestoff/antPiller;

    public LegemiddelApiller(String n, int p, int i, double virk, int nark, int ant){
        super(n, p, i, virk, nark);
        antPiller = ant;
    }

    public double getVirkestoffPille(){
        return virkestoffPerPille;
    }

    public int pillerPerBoks(){
        return antPiller;
    }

}
