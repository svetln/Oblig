class Lege implements  Lik{

    // Comparable, , Iterable
    // En lege er en person, og extender derfor Person. 
    // Lege implementerer interfacet Lik som sjekker om et legenavn som 
    // kommer inn som paramter i metoden samme(String navn) er 
    // likt navnet på legeobjektet metoden finnes i. 
    // Implementerer også grensesnittet Comparable for å kunne
    // sammenlikne to leger i SortertEnkelListe
    
    private String navn;

    public Lege(String navn){
        this.navn = navn;
    }
    
    public String getNavn(){
        return navn;
    }

    public boolean samme(String navn){
        // sammenlikner legens navn med navnet som kommer inn som parameter
        return(this.navn==navn);
    }
    
    public int compareTo(Lege x){
        if(navn.compareTo(x.getNavn())==0){
            return 0;
        }
        else if(navn.compareTo(x.getNavn())<0){
            // da er denne legen tidligere i alfabetet enn parameteret
            return -1;
        }
        return 1;
    }
}
