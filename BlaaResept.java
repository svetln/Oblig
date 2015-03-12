class BlaaResept extends Resept{
    
    // Blå resept extends Resept fordi det er en type resept. 

    public Resept(int reseptnr, Legemiddel hvilket, Lege hvilken, int pasientid, int reit){
       super(reseptnr, hvilket, hvilken, pasientid, reit);
    }

}
