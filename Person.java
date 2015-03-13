import java.util.*;

class Person implements Iterable{

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

    public Iterator<Person> iterator(){
        return new personIterator();
    }
    public class personIterator implements Iterator<Person>{
        private int teller = 0;
        public boolean hasNext(){
            return true;
        }
        public Person next(){
        // Henter ut objektet som ligger på denne plassen
            return this;
        }
        public void remove(){
        }
}




}

