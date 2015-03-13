public class LegemiddelB extends Legemiddel{
    
    // Subklasse av Legemiddel for vanedannende legemidler
    // har i tillegg til info i Legemiddel en int vanedannendeGrad

    private int vanedannendeGrad;

    public LegemiddelB(String navn, int pris, double virk, int van){
        super(navn, pris, virk);
        vanedannendeGrad = van;
    }

    public int getVanedannendeGrad(){
        return vanedannendeGrad;
    }

}
