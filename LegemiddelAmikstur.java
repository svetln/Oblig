class LegemiddelAmikstur extends LegemiddelA implements Mikstur{

    // Legemiddel type A i miksturform. Inneholder i tillegg til informasjonen
    // i Legemiddel type A også info om volum per flaske, og mengde virkestoff
    // per kubikkcm. 

    private double volum;
    private double virkestoff = getVirkestoff();
    private double virkestoffKubikkcm = virkestoff/volum;
    
    public LegemiddelAmikstur(String navn, int pris, double virk, int nark, double volum){
        super(navn, pris,virk, nark);
        this.volum = volum;
    }
 
    public double getVolum(){
        return volum;
    }

    public double getVirkestoffKubikkcm(){
        return virkestoffKubikkcm();
    }

}
