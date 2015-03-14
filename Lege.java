import java.util.*;
class Lege implements Lik, Comparable<Lege>{
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
        return(this.navn.equals(navn));
    }
    
    public int compareTo(Lege x){
        if(navn.compareTo(x.getNavn())==0){
            return 0;
        }
        else if(navn.compareTo(x.getNavn())<0){
            // returnerer -1 hvis legen vi sjekker er før parameteret i alfabetet. 
            return -1;
        }
        // returnerer 1 hvis legen vi sjekker er etter parameteret i alfabetet. 
        return 1;
    }
}
