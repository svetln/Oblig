class Person{

    // Klasse Person for å beskrive et personobjekt. 

    private String navn;
    private String fodselsnummer;
    private String postnummer; 
    private String adresse;
    private static int id;
    
    public Person(String navn, String fodselsnr, String postnummer, String adresse){
        this.navn = navn; 
        fodselsnummer = fodselsnr; 
        this.postnummer = postnummer; 
        this.adresse = adresse;
        id ++; 
    }

    public String getNavn(){
        return navn;
    }

    public String getFodselsnummer(){
        return fodselsnummer;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getPostnummer(){
        return postnummer; 
    }

    public int getId(){
        return id;
    }

    
}

