class Lege extends Person implements Comparable, Lik, Iterable{

    // En lege er en person, og extender derfor Person. 
    // Lege implementerer interfacet Lik som sjekker om et legenavn som 
    // kommer inn som paramter i metoden samme(String navn) er 
    // likt navnet på legeobjektet metoden finnes i. 
    // Implementerer også grensesnittet Comparable for å kunne
    // sammenlikne to leger i SortertEnkelListe

    public Lege(String navn, String fodselsnr, String postnummer, String adresse){
        super(navn, fodselsnr, postnummer, adresse);
    }

    public boolean samme(String navn){
        // sammenlikner legens navn med navnet som kommer inn som parameter
        return(getNavn()==navn);
    }
    
    public int compareTo(Lege x){
        return getId().compareTo(x.getId());
       /*if(x.getId() == this.getId()){
            // de to objektene er like
            return 0;
       }
       else if(x.getId() < this.getId()){
            // parameteret har en tidlgiere id(mindre enn iden til dette objektet),
            // dette objektet er derfor senere enn det nye objektet i lista
            return -1;
       }
       // Dette objektet har en tidligere id enn parameteret, 
       // parametere er etter  dette objektet i lista. 
       return 1;
        */
    }
}
