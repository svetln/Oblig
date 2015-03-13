class LegemiddelBmikstur extends LegemiddelB implements Mikstur{

    // Subklasse av Legemiddel type B for vanedannende miksturer. 

    private double volum;
    private double virkestoff = getVirkestoff();
    private double virkestoffKubikkcm = virkestoff/volum;
    
    public LegemiddelBmikstur(String navn, int pris, double virk, int van, double volum){
        super(navn, pris, virk, van);
        this.volum = volum;
    }
 
    public double getVolum(){
        return volum;
    }

    public double getVirkestoffKubikkcm(){
        return virkestoffKubikkcm;
    }

}
