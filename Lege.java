class Lege extends Person implements Lik{

    // En lege er en person, og extender derfor Person. 
    // Lege implementerer interfacet Lik som sjekker om et legenavn som 
    // kommer inn som paramter i metoden samme(String navn) er 
    // likt navnet på legeobjektet metoden finnes i. 

    public Lege(String navn, String fodselsnr, String postnummer, String adresse, int id){
        super(navn, fodselsnr, postnummer, adresse, id);
    }

    public boolean samme(String navn){
        // sammenlikner legens navn med navnet som kommer inn som parameter
        return(getNavn()==navn);
    }
    
}
