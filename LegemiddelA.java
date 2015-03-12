public class LegemiddelA extends Legemiddel{
    
    // Subklasse av Legemiddel for narkotiske stoffer
    // Har i tillegg til egenskapene i Legemidden en narkotisk grad.

    private int narkotiskGrad;

    public LegemiddelA(String navn, int pris, int id, double virk, int nark){
        super(navn, pris, id, virk);
        narkotiskGrad = nark;
    }
    
    public int getNatkotiskGrad(){
        return narkotiskGrad;
    }
}
