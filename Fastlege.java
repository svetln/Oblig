class Fastlege extends Lege implements AvtaleKommunen{
    
    // En Fastlege er en type Lege, men har i tillegg til Legeegenskapene også
    // en avtale med kommunen(et avtalenummer).

    private int avtalenummer;

    public Fastlege(String navn, int avtalenummer){
        super(navn);
        this.avtalenummer = avtalenummer; 
    }

    public int getAvtalenummer(){
         return avtalenummer;
    }
}
