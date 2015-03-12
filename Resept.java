class Resept{

    // En klasse for å beskrive et reseptobjekt. 
    // reseptnr er statisk slik at vi bare kan øke den med en for
    // hver nye resept. Da får hver nye resept et unikt nummer.  
    private static int reseptnr = 0;
    private Legemiddel hvilketLegemiddel;
    private Lege hvilkenLege;
    private int pasientid;
    private int reit; 
    

    public Resept(Legemiddel hvilket, Lege hvilken, int pasientid, int reit){
        hvilketLegemiddel = hvilket; 
        hvilkenLege = hvilken;
        this.pasientid = pasientid;
        this.reit = reit; 
        reseptnr ++;
    }

    public int getReseptnr(){
        return reseptnr;
    }

    public Legemiddel getHvilketLegemiddel(){
        return hvilketLegemiddel;
    }

    public Lege getHvilkenLege(){
        return hvilkenLege;
    }

    public int getPasientid(){
        return pasientid;
    }

    public int reit(){
        return reit;
    }

}
