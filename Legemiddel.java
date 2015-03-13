public class Legemiddel{
    
    // klasse Legemiddel, har informasjon om navn, pris, idnr og 
    // mengde virkestoff i hvert legemiddel. 
    
    private String navn; 
    private int pris;
    private double virkestoffMg;
    private static int id; 

    public Legemiddel(String navn, int pris, double virk){
        this.navn = navn;
        this.pris = pris;
        virkestoffMg = virk;
        id ++;
    }

    public int getPris(){
        return pris;
    }

    public int getId(){
        return id;
    }

    public double getVirkestoff(){
        return virkestoffMg;
    }

}
