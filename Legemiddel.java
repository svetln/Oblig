public class Legemiddel{
    
    // klasse Legemiddel, har informasjon om navn, pris, idnr og 
    // mengde virkestoff i hvert legemiddel. 
    
    private String navn; 
    private int pris;
    private int id;
    private double virkestoffMg;

    public Legemiddel(String navn, int pris, int id, double virk){
        this.navn = navn;
        this.pris = pris;
        this.id = id;
        virkestoffMg = virk;
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
