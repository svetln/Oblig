class LegemiddelCmikstur extends LegemiddelC implements Mikstur{
    
    // Legemiddel type C for miksturer som hverken er vanedannende eller 
    // narkotiske. 

    private double volum;
    private double virkestoff = getVirkestoff();
    private double virkestoffKubikkcm = virkestoff/volum;
    
    public LegemiddelCmikstur(String navn, int pris, double virk, double volum){
        super(navn, pris, virk);
        this.volum = volum;
    }
 
    public double getVolum(){
        return volum;
    }
    public double getVirkestoffKubikkcm(){
        return virkestoffKubikkcm;
    }

}
